package it.univaq.disim.sealab.metaheuristic.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CSVUtils {

	private static final char DEFAULT_SEPARATOR = ';';
	private static boolean header = true;
	
	public static void writeLine(String path, List<String> values) {
		try (FileWriter writer = new FileWriter(path, true)){
//			FileWriter writer = new FileWriter(path);
			writeLine(writer, values, DEFAULT_SEPARATOR, ' ');
		} catch (IOException e) {
			System.err.println("Error in saving a line to the file " + path);
			e.printStackTrace();
		}
	}

	public static void writeLine(Writer w, List<String> values) throws IOException {
		writeLine(w, values, DEFAULT_SEPARATOR, ' ');
	}
	
	public static void writeHeader(Writer w, List<String> values) throws IOException {
		if(header) {
			writeLine(w, values, DEFAULT_SEPARATOR, ' ');
			header = false;
		}
	}

	public static void writeLine(Writer w, List<String> values, char separators) throws IOException {
		writeLine(w, values, separators, ' ');
	}

	// https://tools.ietf.org/html/rfc4180
	private static String followCVSformat(String value) {

		String result = value;
		if (result.contains("\"")) {
			result = result.replace("\"", "\"\"");
		}
		return result;

	}

	public static void writeLine(Writer w, List<String> values, char separators, char customQuote) throws IOException {

		boolean first = true;

		// default customQuote is empty

		if (separators == ' ') {
			separators = DEFAULT_SEPARATOR;
		}

		StringBuilder sb = new StringBuilder();
		for (String value : values) {
			if (!first) {
				sb.append(separators);
			}
			if (customQuote == ' ') {
				sb.append(followCVSformat(value));
			} else {
				sb.append(customQuote).append(followCVSformat(value)).append(customQuote);
			}

			first = false;
		}
		sb.append("\n");
		w.append(sb.toString());

	}

}

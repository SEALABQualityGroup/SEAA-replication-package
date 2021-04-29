package it.univaq.disim.sealab.metaheuristic.evolutionary;

import org.apache.commons.lang3.mutable.MutableInt;

/**
 * Ascii progress meter. On completion this will reset itself,
 * so it can be reused
 * <br /><br />
 * 100% ################################################## |
 */
public class ProgressBar {
    private StringBuilder progress;
    /**
     * initialize progress bar properties.
     */
    public ProgressBar(String msg) {
    	System.out.print("\n"+msg);
        init();
    }


    /**
     * called whenever the progress bar needs to be updated.
     * that is whenever progress was made.
     *
     * @param done an int representing the work done so far
     * @param total an int representing the total work
     */
    public void update(MutableInt done, MutableInt total, int to_add) {

        char[] workchars = {'|', '/', '-', '\\'};
        String format = "\r%3d%% %s %c";
        done.add(to_add);
        int percent = (done.getValue()*100) / total.getValue();
        int extrachars = (percent / 2) - this.progress.length();

        while (extrachars-- > 0) {
            progress.append('#');
        }

        System.out.printf(format, percent, progress,
         workchars[done.getValue() % workchars.length]);

        if (done == total) {
            System.out.flush();
            System.out.println();
            init();
        }
    }

    private void init() {
        this.progress = new StringBuilder(60);
    }
    
    
    public static void showBar(final int actual, final int max) {
    	int j = actual;
    	
    	final float percentage = ((float) actual / max) * 100;
    	
		String bar ="Run " + actual + " over " + max;

		bar +="\n[";
		j = (int) (80 * percentage)/100;
		while (j > 0) {
			bar += "=";
			j--;
		}
		
//		j = actual;
//		int blank = max > 80 ? 80 : max;
		
		j = 80 - ((int) (80 * percentage)/100);
		
		while (j > 0) {
			bar += " ";
			j--;
		}
		bar += "] " + String.format(java.util.Locale.US,"%.2f", percentage) + " %";
		
		System.out.println(bar);
    }
}
write("", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex",append=FALSE)
resultDirectory<-"/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/data"
latexHeader <- function() {
  write("\\documentclass{article}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\title{StandardStudy}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\usepackage{amssymb}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\author{A.J.Nebro}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\begin{document}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\maketitle", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\section{Tables}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
}

latexTableHeader <- function(problem, tabularString, latexTableFirstLine) {
  write("\\begin{table}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\caption{", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(problem, "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(".IGD+.}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)

  write("\\label{Table:", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(problem, "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(".IGD+.}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)

  write("\\centering", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\begin{scriptsize}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\begin{tabular}{", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(tabularString, "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(latexTableFirstLine, "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\hline ", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
}

printTableLine <- function(indicator, algorithm1, algorithm2, i, j, problem) { 
  file1<-paste(resultDirectory, algorithm1, sep="/")
  file1<-paste(file1, problem, sep="/")
  file1<-paste(file1, indicator, sep="/")
  data1<-scan(file1)
  file2<-paste(resultDirectory, algorithm2, sep="/")
  file2<-paste(file2, problem, sep="/")
  file2<-paste(file2, indicator, sep="/")
  data2<-scan(file2)
  if (i == j) {
    write("-- ", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  }
  else if (i < j) {
    if (is.finite(wilcox.test(data1, data2)$p.value) & wilcox.test(data1, data2)$p.value <= 0.05) {
      if (median(data1) <= median(data2)) {
        write("$\\blacktriangle$", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
      }
      else {
        write("$\\triangledown$", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE) 
      }
    }
    else {
      write("--", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE) 
    }
  }
  else {
    write(" ", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  }
}

latexTableTail <- function() { 
  write("\\hline", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\end{tabular}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\end{scriptsize}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\end{table}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
}

latexTail <- function() { 
  write("\\end{document}", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
}

### START OF SCRIPT 
# Constants
problemList <-c("train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_142") 
algorithmList <-c("NSGAII") 
tabularString <-c("l") 
latexTableFirstLine <-c("\\hline \\\\ ") 
indicator<-"IGD+"

 # Step 1.  Writes the latex header
latexHeader()
tabularString <-c("| l | ") 

latexTableFirstLine <-c("\\hline \\multicolumn{1}{|c|}{} \\\\") 

# Step 3. Problem loop 
latexTableHeader("train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_142 ", tabularString, latexTableFirstLine)

indx = 0
for (i in algorithmList) {
  if (i != "NSGAII") {
    write(i , "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
    write(" & ", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)

    jndx = 0
    for (j in algorithmList) {
      for (problem in problemList) {
        if (jndx != 0) {
          if (i != j) {
            printTableLine(indicator, i, j, indx, jndx, problem)
          }
          else {
            write("  ", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
          } 
          if (problem == "train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_142") {
            if (j == "NSGAII") {
              write(" \\\\ ", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
            } 
            else {
              write(" & ", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
            }
          }
     else {
    write("&", "/mnt/store/research/easier/uml_case_studies/tuning/solution_no_pas_avg_igd/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
     }
        }
      }
      jndx = jndx + 1
    }
    indx = indx + 1
  }
} # for algorithm

  latexTableTail()

#Step 3. Writes the end of latex file 
latexTail()


write("", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex",append=FALSE)
resultDirectory<-"/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/data"
latexHeader <- function() {
  write("\\documentclass{article}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\title{StandardStudy}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\usepackage{amssymb}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\author{A.J.Nebro}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\begin{document}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\maketitle", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\section{Tables}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
}

latexTableHeader <- function(problem, tabularString, latexTableFirstLine) {
  write("\\begin{table}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\caption{", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(problem, "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(".IGD+.}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)

  write("\\label{Table:", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(problem, "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(".IGD+.}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)

  write("\\centering", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\begin{scriptsize}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\begin{tabular}{", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(tabularString, "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write(latexTableFirstLine, "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\hline ", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
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
    write("-- ", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  }
  else if (i < j) {
    if (is.finite(wilcox.test(data1, data2)$p.value) & wilcox.test(data1, data2)$p.value <= 0.05) {
      if (median(data1) <= median(data2)) {
        write("$\\blacktriangle$", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
      }
      else {
        write("$\\triangledown$", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE) 
      }
    }
    else {
      write("--", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE) 
    }
  }
  else {
    write(" ", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  }
}

latexTableTail <- function() { 
  write("\\hline", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\end{tabular}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\end{scriptsize}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
  write("\\end{table}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
}

latexTail <- function() { 
  write("\\end{document}", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
}

### START OF SCRIPT 
# Constants
problemList <-c("train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_82") 
algorithmList <-c("NSGAII") 
tabularString <-c("l") 
latexTableFirstLine <-c("\\hline \\\\ ") 
indicator<-"IGD+"

 # Step 1.  Writes the latex header
latexHeader()
tabularString <-c("| l | ") 

latexTableFirstLine <-c("\\hline \\multicolumn{1}{|c|}{} \\\\") 

# Step 3. Problem loop 
latexTableHeader("train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_82 ", tabularString, latexTableFirstLine)

indx = 0
for (i in algorithmList) {
  if (i != "NSGAII") {
    write(i , "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
    write(" & ", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)

    jndx = 0
    for (j in algorithmList) {
      for (problem in problemList) {
        if (jndx != 0) {
          if (i != j) {
            printTableLine(indicator, i, j, indx, jndx, problem)
          }
          else {
            write("  ", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
          } 
          if (problem == "train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_82") {
            if (j == "NSGAII") {
              write(" \\\\ ", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
            } 
            else {
              write(" & ", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
            }
          }
     else {
    write("&", "/mnt/research/easier/tunig/solution_with_pas_rel_095/referenceFront/Exp/R/IGD+.Wilcoxon.tex", append=TRUE)
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


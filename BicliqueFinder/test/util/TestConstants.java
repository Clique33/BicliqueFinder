/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author clique
 */
public enum TestConstants {
    RIJNDAEL_UNBALANCED_DELTA("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_UNBALANCED_NABLA0("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_UNBALANCED_NABLA1("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		&&\\green&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_UNBALANCED_RECOMPUTATION("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&\\grey&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&\\grey&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\grey\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&&&\\\\\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&&&\\\\\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_BALANCED_DELTA0("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_BALANCED_DELTA1("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\blue&&&\\\\\\hline\n" +
"		&\\blue&&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_BALANCED_NABLA0("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		&&\\green&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_BALANCED_NABLA1("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\\\\\hline\n" +
"		&&\\green&\\green\\\\\\hline\n" +
"		\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&\\green&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&\\green&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\green&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    RIJNDAEL_BALANCED_RECOMPUTATION("\\documentclass{article}\n" +
"\\usepackage[paperheight=65.60000000000001in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.4cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&\\grey&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.4cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&\\grey&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.4cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.4cm]{$\\#3$};\n" +
"	\\node(state4)[below of=state3, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.4cm]{$\\#4$};\n" +
"		\\node(xor1)[below of=state4]{$\\oplus$};\n" +
"	\\node(state5)[below of=xor1]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.4cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.4cm]{$\\#6$};\n" +
"	\\node(state7)[below of=state6, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.4cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.4cm]{$\\#8$};\n" +
"		\\node(xor2)[below of=state8]{$\\oplus$};\n" +
"	\\node(state9)[below of=xor2]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.4cm]{$\\#9$};\n" +
"	\\node(state10)[below of=state9, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.4cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.4cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.4cm]{$\\#12$};\n" +
"		\\node(xor3)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor3]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.4cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.4cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		&&\\grey&\\\\\\hline\n" +
"		&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.4cm]{$\\#15$};\n" +
"	\\node(state16)[below of=state15, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.4cm]{$\\#16$};\n" +
"		\\node(xor4)[below of=state16]{$\\oplus$};\n" +
"	\\node(state17)[below of=xor4]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.4cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.4cm]{$\\#18$};\n" +
"	\\node(state19)[below of=state18, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.4cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.4cm]{$\\#20$};\n" +
"		\\node(xor5)[below of=state20]{$\\oplus$};\n" +
"	\\node(state21)[below of=xor5]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.4cm]{$\\#21$};\n" +
"	\\node(state22)[below of=state21, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.4cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.4cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\grey\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\grey&&&\\\\\\hline\n" +
"		\\grey&\\grey&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.4cm]{$\\#24$};\n" +
"		\\node(xor6)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor6]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.4cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.4cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.4cm]{$\\#27$};\n" +
"	\\node(state28)[below of=state27, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.4cm]{$\\#28$};\n" +
"		\\node(xor7)[below of=state28]{$\\oplus$};\n" +
"	\\node(state29)[below of=xor7]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.4cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.4cm]{$\\#30$};\n" +
"	\\node(state31)[below of=state30, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.4cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.4cm]{$\\#32$};\n" +
"		\\node(xor8)[below of=state32]{$\\oplus$};\n" +
"	\\node(state33)[below of=xor8]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.4cm]{$\\#33$};\n" +
"	\\node(state34)[below of=state33, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.4cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.4cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.4cm]{$\\#36$};\n" +
"		\\node(xor9)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor9]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.4cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.4cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.4cm]{$\\#39$};\n" +
"		\\node(xor10)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor10]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.4cm]{$\\#40$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-0.5cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-0.5cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-0.5cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-0.5cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-0.5cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-0.5cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-0.5cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-0.5cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-0.5cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-0.5cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-1.0cm]{\\begin{tabular}{|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-0.5cm]{$\\$10$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state4);\n" +
"	\\path [line] (state4) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state9);\n" +
"	\\path [line] (state9) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state16);\n" +
"	\\path [line] (state16) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state21);\n" +
"	\\path [line] (state21) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state28);\n" +
"	\\path [line] (state28) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state33);\n" +
"	\\path [line] (state33) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state40);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    SERPENT_DELTA_P1("\\documentclass{article}\n" +
"\\usepackage[paperheight=155.20000000000002in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.8cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.8cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.8cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.8cm]{$\\#3$};\n" +
"		\\node(xor1)[below of=state3]{$\\oplus$};\n" +
"	\\node(state4)[below of=xor1]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.8cm]{$\\#4$};\n" +
"	\\node(state5)[below of=state4, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.8cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.8cm]{$\\#6$};\n" +
"		\\node(xor2)[below of=state6]{$\\oplus$};\n" +
"	\\node(state7)[below of=xor2]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.8cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.8cm]{$\\#8$};\n" +
"	\\node(state9)[below of=state8, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.8cm]{$\\#9$};\n" +
"		\\node(xor3)[below of=state9]{$\\oplus$};\n" +
"	\\node(state10)[below of=xor3]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.8cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.8cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.8cm]{$\\#12$};\n" +
"		\\node(xor4)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor4]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.8cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.8cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.8cm]{$\\#15$};\n" +
"		\\node(xor5)[below of=state15]{$\\oplus$};\n" +
"	\\node(state16)[below of=xor5]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.8cm]{$\\#16$};\n" +
"	\\node(state17)[below of=state16, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.8cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.8cm]{$\\#18$};\n" +
"		\\node(xor6)[below of=state18]{$\\oplus$};\n" +
"	\\node(state19)[below of=xor6]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.8cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.8cm]{$\\#20$};\n" +
"	\\node(state21)[below of=state20, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.8cm]{$\\#21$};\n" +
"		\\node(xor7)[below of=state21]{$\\oplus$};\n" +
"	\\node(state22)[below of=xor7]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.8cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.8cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.8cm]{$\\#24$};\n" +
"		\\node(xor8)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor8]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.8cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.8cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.8cm]{$\\#27$};\n" +
"		\\node(xor9)[below of=state27]{$\\oplus$};\n" +
"	\\node(state28)[below of=xor9]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.8cm]{$\\#28$};\n" +
"	\\node(state29)[below of=state28, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.8cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.8cm]{$\\#30$};\n" +
"		\\node(xor10)[below of=state30]{$\\oplus$};\n" +
"	\\node(state31)[below of=xor10]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.8cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.8cm]{$\\#32$};\n" +
"	\\node(state33)[below of=state32, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.8cm]{$\\#33$};\n" +
"		\\node(xor11)[below of=state33]{$\\oplus$};\n" +
"	\\node(state34)[below of=xor11]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.8cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.8cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.8cm]{$\\#36$};\n" +
"		\\node(xor12)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor12]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.8cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.8cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.8cm]{$\\#39$};\n" +
"		\\node(xor13)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor13]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.8cm]{$\\#40$};\n" +
"	\\node(state41)[below of=state40, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState41)[right of=state41,xshift=0.8cm]{$\\#41$};\n" +
"	\\node(state42)[below of=state41, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState42)[right of=state42,xshift=0.8cm]{$\\#42$};\n" +
"		\\node(xor14)[below of=state42]{$\\oplus$};\n" +
"	\\node(state43)[below of=xor14]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState43)[right of=state43,xshift=0.8cm]{$\\#43$};\n" +
"	\\node(state44)[below of=state43, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState44)[right of=state44,xshift=0.8cm]{$\\#44$};\n" +
"	\\node(state45)[below of=state44, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState45)[right of=state45,xshift=0.8cm]{$\\#45$};\n" +
"		\\node(xor15)[below of=state45]{$\\oplus$};\n" +
"	\\node(state46)[below of=xor15]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState46)[right of=state46,xshift=0.8cm]{$\\#46$};\n" +
"	\\node(state47)[below of=state46, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState47)[right of=state47,xshift=0.8cm]{$\\#47$};\n" +
"	\\node(state48)[below of=state47, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState48)[right of=state48,xshift=0.8cm]{$\\#48$};\n" +
"		\\node(xor16)[below of=state48]{$\\oplus$};\n" +
"	\\node(state49)[below of=xor16]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState49)[right of=state49,xshift=0.8cm]{$\\#49$};\n" +
"	\\node(state50)[below of=state49, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState50)[right of=state50,xshift=0.8cm]{$\\#50$};\n" +
"	\\node(state51)[below of=state50, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState51)[right of=state51,xshift=0.8cm]{$\\#51$};\n" +
"		\\node(xor17)[below of=state51]{$\\oplus$};\n" +
"	\\node(state52)[below of=xor17]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState52)[right of=state52,xshift=0.8cm]{$\\#52$};\n" +
"	\\node(state53)[below of=state52, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState53)[right of=state53,xshift=0.8cm]{$\\#53$};\n" +
"	\\node(state54)[below of=state53, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState54)[right of=state54,xshift=0.8cm]{$\\#54$};\n" +
"		\\node(xor18)[below of=state54]{$\\oplus$};\n" +
"	\\node(state55)[below of=xor18]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState55)[right of=state55,xshift=0.8cm]{$\\#55$};\n" +
"	\\node(state56)[below of=state55, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState56)[right of=state56,xshift=0.8cm]{$\\#56$};\n" +
"	\\node(state57)[below of=state56, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState57)[right of=state57,xshift=0.8cm]{$\\#57$};\n" +
"		\\node(xor19)[below of=state57]{$\\oplus$};\n" +
"	\\node(state58)[below of=xor19]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState58)[right of=state58,xshift=0.8cm]{$\\#58$};\n" +
"	\\node(state59)[below of=state58, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState59)[right of=state59,xshift=0.8cm]{$\\#59$};\n" +
"	\\node(state60)[below of=state59, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState60)[right of=state60,xshift=0.8cm]{$\\#60$};\n" +
"		\\node(xor20)[below of=state60]{$\\oplus$};\n" +
"	\\node(state61)[below of=xor20]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState61)[right of=state61,xshift=0.8cm]{$\\#61$};\n" +
"	\\node(state62)[below of=state61, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState62)[right of=state62,xshift=0.8cm]{$\\#62$};\n" +
"	\\node(state63)[below of=state62, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState63)[right of=state63,xshift=0.8cm]{$\\#63$};\n" +
"		\\node(xor21)[below of=state63]{$\\oplus$};\n" +
"	\\node(state64)[below of=xor21]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState64)[right of=state64,xshift=0.8cm]{$\\#64$};\n" +
"	\\node(state65)[below of=state64, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState65)[right of=state65,xshift=0.8cm]{$\\#65$};\n" +
"	\\node(state66)[below of=state65, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState66)[right of=state66,xshift=0.8cm]{$\\#66$};\n" +
"		\\node(xor22)[below of=state66]{$\\oplus$};\n" +
"	\\node(state67)[below of=xor22]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState67)[right of=state67,xshift=0.8cm]{$\\#67$};\n" +
"	\\node(state68)[below of=state67, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState68)[right of=state68,xshift=0.8cm]{$\\#68$};\n" +
"	\\node(state69)[below of=state68, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState69)[right of=state69,xshift=0.8cm]{$\\#69$};\n" +
"		\\node(xor23)[below of=state69]{$\\oplus$};\n" +
"	\\node(state70)[below of=xor23]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState70)[right of=state70,xshift=0.8cm]{$\\#70$};\n" +
"	\\node(state71)[below of=state70, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState71)[right of=state71,xshift=0.8cm]{$\\#71$};\n" +
"	\\node(state72)[below of=state71, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState72)[right of=state72,xshift=0.8cm]{$\\#72$};\n" +
"		\\node(xor24)[below of=state72]{$\\oplus$};\n" +
"	\\node(state73)[below of=xor24]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState73)[right of=state73,xshift=0.8cm]{$\\#73$};\n" +
"	\\node(state74)[below of=state73, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState74)[right of=state74,xshift=0.8cm]{$\\#74$};\n" +
"	\\node(state75)[below of=state74, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState75)[right of=state75,xshift=0.8cm]{$\\#75$};\n" +
"		\\node(xor25)[below of=state75]{$\\oplus$};\n" +
"	\\node(state76)[below of=xor25]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState76)[right of=state76,xshift=0.8cm]{$\\#76$};\n" +
"	\\node(state77)[below of=state76, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState77)[right of=state77,xshift=0.8cm]{$\\#77$};\n" +
"	\\node(state78)[below of=state77, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState78)[right of=state78,xshift=0.8cm]{$\\#78$};\n" +
"		\\node(xor26)[below of=state78]{$\\oplus$};\n" +
"	\\node(state79)[below of=xor26]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState79)[right of=state79,xshift=0.8cm]{$\\#79$};\n" +
"	\\node(state80)[below of=state79, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState80)[right of=state80,xshift=0.8cm]{$\\#80$};\n" +
"	\\node(state81)[below of=state80, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState81)[right of=state81,xshift=0.8cm]{$\\#81$};\n" +
"		\\node(xor27)[below of=state81]{$\\oplus$};\n" +
"	\\node(state82)[below of=xor27]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState82)[right of=state82,xshift=0.8cm]{$\\#82$};\n" +
"	\\node(state83)[below of=state82, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState83)[right of=state83,xshift=0.8cm]{$\\#83$};\n" +
"	\\node(state84)[below of=state83, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState84)[right of=state84,xshift=0.8cm]{$\\#84$};\n" +
"		\\node(xor28)[below of=state84]{$\\oplus$};\n" +
"	\\node(state85)[below of=xor28]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState85)[right of=state85,xshift=0.8cm]{$\\#85$};\n" +
"	\\node(state86)[below of=state85, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState86)[right of=state86,xshift=0.8cm]{$\\#86$};\n" +
"	\\node(state87)[below of=state86, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState87)[right of=state87,xshift=0.8cm]{$\\#87$};\n" +
"		\\node(xor29)[below of=state87]{$\\oplus$};\n" +
"	\\node(state88)[below of=xor29]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState88)[right of=state88,xshift=0.8cm]{$\\#88$};\n" +
"	\\node(state89)[below of=state88, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState89)[right of=state89,xshift=0.8cm]{$\\#89$};\n" +
"	\\node(state90)[below of=state89, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState90)[right of=state90,xshift=0.8cm]{$\\#90$};\n" +
"		\\node(xor30)[below of=state90]{$\\oplus$};\n" +
"	\\node(state91)[below of=xor30]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState91)[right of=state91,xshift=0.8cm]{$\\#91$};\n" +
"	\\node(state92)[below of=state91, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState92)[right of=state92,xshift=0.8cm]{$\\#92$};\n" +
"	\\node(state93)[below of=state92, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState93)[right of=state93,xshift=0.8cm]{$\\#93$};\n" +
"		\\node(xor31)[below of=state93]{$\\oplus$};\n" +
"	\\node(state94)[below of=xor31]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState94)[right of=state94,xshift=0.8cm]{$\\#94$};\n" +
"	\\node(state95)[below of=state94, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState95)[right of=state95,xshift=0.8cm]{$\\#95$};\n" +
"		\\node(xor32)[below of=state95]{$\\oplus$};\n" +
"	\\node(state96)[below of=xor32]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState96)[right of=state96,xshift=0.8cm]{$\\#96$};\n" +
"		\\node(xor33)[below of=state96]{$\\oplus$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-1.0cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		&&&\\blue&\\blue&&&\\\\\\hline\n" +
"		&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		&&&\\blue&&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-1.0cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		&&&\\blue&&&\\blue&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-1.0cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&&\\\\\\hline\n" +
"		&&&&&&\\blue&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-1.0cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-1.0cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\blue&\\blue&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-1.0cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		&&&\\blue&\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		&&&&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-1.0cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		&&&&&&\\blue&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-1.0cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&\\blue&\\\\\\hline\n" +
"		&&&&&&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-1.0cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\blue&&&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&&\\blue&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-1.0cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue&&&&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-1.0cm]{$\\$10$};\n" +
"	\\node(K11)[left of=xor11, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&&\\blue&\\blue&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK11)[left of=K11,xshift=-1.0cm]{$\\$11$};\n" +
"	\\node(K12)[left of=xor12, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&\\blue&\\blue&&&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&&\\\\\\hline\n" +
"		&&&\\blue&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK12)[left of=K12,xshift=-1.0cm]{$\\$12$};\n" +
"	\\node(K13)[left of=xor13, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&&&&&\\\\\\hline\n" +
"		&&&\\blue&&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&&\\\\\\hline\n" +
"		&&&\\blue&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK13)[left of=K13,xshift=-1.0cm]{$\\$13$};\n" +
"	\\node(K14)[left of=xor14, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&\\blue&&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK14)[left of=K14,xshift=-1.0cm]{$\\$14$};\n" +
"	\\node(K15)[left of=xor15, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK15)[left of=K15,xshift=-1.0cm]{$\\$15$};\n" +
"	\\node(K16)[left of=xor16, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK16)[left of=K16,xshift=-1.0cm]{$\\$16$};\n" +
"	\\node(K17)[left of=xor17, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK17)[left of=K17,xshift=-1.0cm]{$\\$17$};\n" +
"	\\node(K18)[left of=xor18, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&\\blue&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK18)[left of=K18,xshift=-1.0cm]{$\\$18$};\n" +
"	\\node(K19)[left of=xor19, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK19)[left of=K19,xshift=-1.0cm]{$\\$19$};\n" +
"	\\node(K20)[left of=xor20, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\blue&\\blue&&&&&&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		&&\\blue&\\blue&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK20)[left of=K20,xshift=-1.0cm]{$\\$20$};\n" +
"	\\node(K21)[left of=xor21, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		&&&&&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&&&&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK21)[left of=K21,xshift=-1.0cm]{$\\$21$};\n" +
"	\\node(K22)[left of=xor22, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\blue&\\blue&&\\blue&&\\\\\\hline\n" +
"		&&\\blue&\\blue&&\\blue&\\blue&\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK22)[left of=K22,xshift=-1.0cm]{$\\$22$};\n" +
"	\\node(K23)[left of=xor23, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&&\\blue&&&&&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&&\\blue&\\blue&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK23)[left of=K23,xshift=-1.0cm]{$\\$23$};\n" +
"	\\node(K24)[left of=xor24, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK24)[left of=K24,xshift=-1.0cm]{$\\$24$};\n" +
"	\\node(K25)[left of=xor25, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&&\\blue&\\blue&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		&&\\blue&\\blue&\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK25)[left of=K25,xshift=-1.0cm]{$\\$25$};\n" +
"	\\node(K26)[left of=xor26, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK26)[left of=K26,xshift=-1.0cm]{$\\$26$};\n" +
"	\\node(K27)[left of=xor27, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&&&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK27)[left of=K27,xshift=-1.0cm]{$\\$27$};\n" +
"	\\node(K28)[left of=xor28, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK28)[left of=K28,xshift=-1.0cm]{$\\$28$};\n" +
"	\\node(K29)[left of=xor29, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		&\\blue&\\blue&\\blue&&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK29)[left of=K29,xshift=-1.0cm]{$\\$29$};\n" +
"	\\node(K30)[left of=xor30, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK30)[left of=K30,xshift=-1.0cm]{$\\$30$};\n" +
"	\\node(K31)[left of=xor31, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\blue&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&&&\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK31)[left of=K31,xshift=-1.0cm]{$\\$31$};\n" +
"	\\node(K32)[left of=xor32, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&&\\blue&\\blue&\\blue&\\blue&\\blue&\\blue\\\\\\hline\n" +
"		\\blue&\\blue&&\\blue&\\blue&&\\blue&\\blue\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK32)[left of=K32,xshift=-1.0cm]{$\\$32$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state4);\n" +
"	\\path [line] (state4) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state9);\n" +
"	\\path [line] (state9) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state16);\n" +
"	\\path [line] (state16) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state21);\n" +
"	\\path [line] (state21) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state28);\n" +
"	\\path [line] (state28) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state33);\n" +
"	\\path [line] (state33) -- (xor11);\n" +
"	\\path [line] (xor11) -- (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor12);\n" +
"	\\path [line] (xor12) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor13);\n" +
"	\\path [line] (xor13) -- (state40);\n" +
"	\\path [line] (state40) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state41);\n" +
"	\\path [line] (state41) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state42);\n" +
"	\\path [line] (state42) -- (xor14);\n" +
"	\\path [line] (xor14) -- (state43);\n" +
"	\\path [line] (state43) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state44);\n" +
"	\\path [line] (state44) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state45);\n" +
"	\\path [line] (state45) -- (xor15);\n" +
"	\\path [line] (xor15) -- (state46);\n" +
"	\\path [line] (state46) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state47);\n" +
"	\\path [line] (state47) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state48);\n" +
"	\\path [line] (state48) -- (xor16);\n" +
"	\\path [line] (xor16) -- (state49);\n" +
"	\\path [line] (state49) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state50);\n" +
"	\\path [line] (state50) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state51);\n" +
"	\\path [line] (state51) -- (xor17);\n" +
"	\\path [line] (xor17) -- (state52);\n" +
"	\\path [line] (state52) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state53);\n" +
"	\\path [line] (state53) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state54);\n" +
"	\\path [line] (state54) -- (xor18);\n" +
"	\\path [line] (xor18) -- (state55);\n" +
"	\\path [line] (state55) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state56);\n" +
"	\\path [line] (state56) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state57);\n" +
"	\\path [line] (state57) -- (xor19);\n" +
"	\\path [line] (xor19) -- (state58);\n" +
"	\\path [line] (state58) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state59);\n" +
"	\\path [line] (state59) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state60);\n" +
"	\\path [line] (state60) -- (xor20);\n" +
"	\\path [line] (xor20) -- (state61);\n" +
"	\\path [line] (state61) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state62);\n" +
"	\\path [line] (state62) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state63);\n" +
"	\\path [line] (state63) -- (xor21);\n" +
"	\\path [line] (xor21) -- (state64);\n" +
"	\\path [line] (state64) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state65);\n" +
"	\\path [line] (state65) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state66);\n" +
"	\\path [line] (state66) -- (xor22);\n" +
"	\\path [line] (xor22) -- (state67);\n" +
"	\\path [line] (state67) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state68);\n" +
"	\\path [line] (state68) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state69);\n" +
"	\\path [line] (state69) -- (xor23);\n" +
"	\\path [line] (xor23) -- (state70);\n" +
"	\\path [line] (state70) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state71);\n" +
"	\\path [line] (state71) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state72);\n" +
"	\\path [line] (state72) -- (xor24);\n" +
"	\\path [line] (xor24) -- (state73);\n" +
"	\\path [line] (state73) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state74);\n" +
"	\\path [line] (state74) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state75);\n" +
"	\\path [line] (state75) -- (xor25);\n" +
"	\\path [line] (xor25) -- (state76);\n" +
"	\\path [line] (state76) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state77);\n" +
"	\\path [line] (state77) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state78);\n" +
"	\\path [line] (state78) -- (xor26);\n" +
"	\\path [line] (xor26) -- (state79);\n" +
"	\\path [line] (state79) --  node{\\begin{tabular}{l}\n"),
    
    SERPENT_DELTA_P2(
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state80);\n" +
"	\\path [line] (state80) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state81);\n" +
"	\\path [line] (state81) -- (xor27);\n" +
"	\\path [line] (xor27) -- (state82);\n" +
"	\\path [line] (state82) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state83);\n" +
"	\\path [line] (state83) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state84);\n" +
"	\\path [line] (state84) -- (xor28);\n" +
"	\\path [line] (xor28) -- (state85);\n" +
"	\\path [line] (state85) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state86);\n" +
"	\\path [line] (state86) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state87);\n" +
"	\\path [line] (state87) -- (xor29);\n" +
"	\\path [line] (xor29) -- (state88);\n" +
"	\\path [line] (state88) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state89);\n" +
"	\\path [line] (state89) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state90);\n" +
"	\\path [line] (state90) -- (xor30);\n" +
"	\\path [line] (xor30) -- (state91);\n" +
"	\\path [line] (state91) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state92);\n" +
"	\\path [line] (state92) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state93);\n" +
"	\\path [line] (state93) -- (xor31);\n" +
"	\\path [line] (xor31) -- (state94);\n" +
"	\\path [line] (state94) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state95);\n" +
"	\\path [line] (state95) -- (xor32);\n" +
"	\\path [line] (xor32) -- (state96);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"	\\path [line] (K11) -- (xor11);\n" +
"	\\path [line] (K12) -- (xor12);\n" +
"	\\path [line] (K13) -- (xor13);\n" +
"	\\path [line] (K14) -- (xor14);\n" +
"	\\path [line] (K15) -- (xor15);\n" +
"	\\path [line] (K16) -- (xor16);\n" +
"	\\path [line] (K17) -- (xor17);\n" +
"	\\path [line] (K18) -- (xor18);\n" +
"	\\path [line] (K19) -- (xor19);\n" +
"	\\path [line] (K20) -- (xor20);\n" +
"	\\path [line] (K21) -- (xor21);\n" +
"	\\path [line] (K22) -- (xor22);\n" +
"	\\path [line] (K23) -- (xor23);\n" +
"	\\path [line] (K24) -- (xor24);\n" +
"	\\path [line] (K25) -- (xor25);\n" +
"	\\path [line] (K26) -- (xor26);\n" +
"	\\path [line] (K27) -- (xor27);\n" +
"	\\path [line] (K28) -- (xor28);\n" +
"	\\path [line] (K29) -- (xor29);\n" +
"	\\path [line] (K30) -- (xor30);\n" +
"	\\path [line] (K31) -- (xor31);\n" +
"	\\path [line] (K32) -- (xor32);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    SERPENT_NABLA_P1("\\documentclass{article}\n" +
"\\usepackage[paperheight=155.20000000000002in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.8cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.8cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.8cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.8cm]{$\\#3$};\n" +
"		\\node(xor1)[below of=state3]{$\\oplus$};\n" +
"	\\node(state4)[below of=xor1]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.8cm]{$\\#4$};\n" +
"	\\node(state5)[below of=state4, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.8cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.8cm]{$\\#6$};\n" +
"		\\node(xor2)[below of=state6]{$\\oplus$};\n" +
"	\\node(state7)[below of=xor2]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.8cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.8cm]{$\\#8$};\n" +
"	\\node(state9)[below of=state8, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.8cm]{$\\#9$};\n" +
"		\\node(xor3)[below of=state9]{$\\oplus$};\n" +
"	\\node(state10)[below of=xor3]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.8cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.8cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.8cm]{$\\#12$};\n" +
"		\\node(xor4)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor4]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.8cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.8cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.8cm]{$\\#15$};\n" +
"		\\node(xor5)[below of=state15]{$\\oplus$};\n" +
"	\\node(state16)[below of=xor5]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.8cm]{$\\#16$};\n" +
"	\\node(state17)[below of=state16, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.8cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.8cm]{$\\#18$};\n" +
"		\\node(xor6)[below of=state18]{$\\oplus$};\n" +
"	\\node(state19)[below of=xor6]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.8cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.8cm]{$\\#20$};\n" +
"	\\node(state21)[below of=state20, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.8cm]{$\\#21$};\n" +
"		\\node(xor7)[below of=state21]{$\\oplus$};\n" +
"	\\node(state22)[below of=xor7]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.8cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.8cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.8cm]{$\\#24$};\n" +
"		\\node(xor8)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor8]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.8cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.8cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.8cm]{$\\#27$};\n" +
"		\\node(xor9)[below of=state27]{$\\oplus$};\n" +
"	\\node(state28)[below of=xor9]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.8cm]{$\\#28$};\n" +
"	\\node(state29)[below of=state28, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.8cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.8cm]{$\\#30$};\n" +
"		\\node(xor10)[below of=state30]{$\\oplus$};\n" +
"	\\node(state31)[below of=xor10]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.8cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.8cm]{$\\#32$};\n" +
"	\\node(state33)[below of=state32, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.8cm]{$\\#33$};\n" +
"		\\node(xor11)[below of=state33]{$\\oplus$};\n" +
"	\\node(state34)[below of=xor11]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.8cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.8cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.8cm]{$\\#36$};\n" +
"		\\node(xor12)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor12]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.8cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.8cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.8cm]{$\\#39$};\n" +
"		\\node(xor13)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor13]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.8cm]{$\\#40$};\n" +
"	\\node(state41)[below of=state40, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState41)[right of=state41,xshift=0.8cm]{$\\#41$};\n" +
"	\\node(state42)[below of=state41, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState42)[right of=state42,xshift=0.8cm]{$\\#42$};\n" +
"		\\node(xor14)[below of=state42]{$\\oplus$};\n" +
"	\\node(state43)[below of=xor14]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState43)[right of=state43,xshift=0.8cm]{$\\#43$};\n" +
"	\\node(state44)[below of=state43, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState44)[right of=state44,xshift=0.8cm]{$\\#44$};\n" +
"	\\node(state45)[below of=state44, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState45)[right of=state45,xshift=0.8cm]{$\\#45$};\n" +
"		\\node(xor15)[below of=state45]{$\\oplus$};\n" +
"	\\node(state46)[below of=xor15]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState46)[right of=state46,xshift=0.8cm]{$\\#46$};\n" +
"	\\node(state47)[below of=state46, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState47)[right of=state47,xshift=0.8cm]{$\\#47$};\n" +
"	\\node(state48)[below of=state47, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState48)[right of=state48,xshift=0.8cm]{$\\#48$};\n" +
"		\\node(xor16)[below of=state48]{$\\oplus$};\n" +
"	\\node(state49)[below of=xor16]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState49)[right of=state49,xshift=0.8cm]{$\\#49$};\n" +
"	\\node(state50)[below of=state49, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState50)[right of=state50,xshift=0.8cm]{$\\#50$};\n" +
"	\\node(state51)[below of=state50, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState51)[right of=state51,xshift=0.8cm]{$\\#51$};\n" +
"		\\node(xor17)[below of=state51]{$\\oplus$};\n" +
"	\\node(state52)[below of=xor17]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState52)[right of=state52,xshift=0.8cm]{$\\#52$};\n" +
"	\\node(state53)[below of=state52, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState53)[right of=state53,xshift=0.8cm]{$\\#53$};\n" +
"	\\node(state54)[below of=state53, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState54)[right of=state54,xshift=0.8cm]{$\\#54$};\n" +
"		\\node(xor18)[below of=state54]{$\\oplus$};\n" +
"	\\node(state55)[below of=xor18]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState55)[right of=state55,xshift=0.8cm]{$\\#55$};\n" +
"	\\node(state56)[below of=state55, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState56)[right of=state56,xshift=0.8cm]{$\\#56$};\n" +
"	\\node(state57)[below of=state56, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState57)[right of=state57,xshift=0.8cm]{$\\#57$};\n" +
"		\\node(xor19)[below of=state57]{$\\oplus$};\n" +
"	\\node(state58)[below of=xor19]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState58)[right of=state58,xshift=0.8cm]{$\\#58$};\n" +
"	\\node(state59)[below of=state58, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState59)[right of=state59,xshift=0.8cm]{$\\#59$};\n" +
"	\\node(state60)[below of=state59, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState60)[right of=state60,xshift=0.8cm]{$\\#60$};\n" +
"		\\node(xor20)[below of=state60]{$\\oplus$};\n" +
"	\\node(state61)[below of=xor20]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState61)[right of=state61,xshift=0.8cm]{$\\#61$};\n" +
"	\\node(state62)[below of=state61, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState62)[right of=state62,xshift=0.8cm]{$\\#62$};\n" +
"	\\node(state63)[below of=state62, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState63)[right of=state63,xshift=0.8cm]{$\\#63$};\n" +
"		\\node(xor21)[below of=state63]{$\\oplus$};\n" +
"	\\node(state64)[below of=xor21]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState64)[right of=state64,xshift=0.8cm]{$\\#64$};\n" +
"	\\node(state65)[below of=state64, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState65)[right of=state65,xshift=0.8cm]{$\\#65$};\n" +
"	\\node(state66)[below of=state65, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState66)[right of=state66,xshift=0.8cm]{$\\#66$};\n" +
"		\\node(xor22)[below of=state66]{$\\oplus$};\n" +
"	\\node(state67)[below of=xor22]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState67)[right of=state67,xshift=0.8cm]{$\\#67$};\n" +
"	\\node(state68)[below of=state67, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState68)[right of=state68,xshift=0.8cm]{$\\#68$};\n" +
"	\\node(state69)[below of=state68, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState69)[right of=state69,xshift=0.8cm]{$\\#69$};\n" +
"		\\node(xor23)[below of=state69]{$\\oplus$};\n" +
"	\\node(state70)[below of=xor23]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState70)[right of=state70,xshift=0.8cm]{$\\#70$};\n" +
"	\\node(state71)[below of=state70, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState71)[right of=state71,xshift=0.8cm]{$\\#71$};\n" +
"	\\node(state72)[below of=state71, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState72)[right of=state72,xshift=0.8cm]{$\\#72$};\n" +
"		\\node(xor24)[below of=state72]{$\\oplus$};\n" +
"	\\node(state73)[below of=xor24]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState73)[right of=state73,xshift=0.8cm]{$\\#73$};\n" +
"	\\node(state74)[below of=state73, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState74)[right of=state74,xshift=0.8cm]{$\\#74$};\n" +
"	\\node(state75)[below of=state74, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState75)[right of=state75,xshift=0.8cm]{$\\#75$};\n" +
"		\\node(xor25)[below of=state75]{$\\oplus$};\n" +
"	\\node(state76)[below of=xor25]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState76)[right of=state76,xshift=0.8cm]{$\\#76$};\n" +
"	\\node(state77)[below of=state76, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState77)[right of=state77,xshift=0.8cm]{$\\#77$};\n" +
"	\\node(state78)[below of=state77, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState78)[right of=state78,xshift=0.8cm]{$\\#78$};\n" +
"		\\node(xor26)[below of=state78]{$\\oplus$};\n" +
"	\\node(state79)[below of=xor26]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState79)[right of=state79,xshift=0.8cm]{$\\#79$};\n" +
"	\\node(state80)[below of=state79, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState80)[right of=state80,xshift=0.8cm]{$\\#80$};\n" +
"	\\node(state81)[below of=state80, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState81)[right of=state81,xshift=0.8cm]{$\\#81$};\n" +
"		\\node(xor27)[below of=state81]{$\\oplus$};\n" +
"	\\node(state82)[below of=xor27]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState82)[right of=state82,xshift=0.8cm]{$\\#82$};\n" +
"	\\node(state83)[below of=state82, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState83)[right of=state83,xshift=0.8cm]{$\\#83$};\n" +
"	\\node(state84)[below of=state83, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState84)[right of=state84,xshift=0.8cm]{$\\#84$};\n" +
"		\\node(xor28)[below of=state84]{$\\oplus$};\n" +
"	\\node(state85)[below of=xor28]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState85)[right of=state85,xshift=0.8cm]{$\\#85$};\n" +
"	\\node(state86)[below of=state85, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState86)[right of=state86,xshift=0.8cm]{$\\#86$};\n" +
"	\\node(state87)[below of=state86, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&&&&&\\\\\\hline\n" +
"		&&&&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&&&\\green&\\green&\\\\\\hline\n" +
"		&&&&\\green&\\green&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState87)[right of=state87,xshift=0.8cm]{$\\#87$};\n" +
"		\\node(xor29)[below of=state87]{$\\oplus$};\n" +
"	\\node(state88)[below of=xor29]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\green&\\green&&&&&\\\\\\hline\n" +
"		&&&&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&&&\\green&&\\\\\\hline\n" +
"		&&&&\\green&\\green&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState88)[right of=state88,xshift=0.8cm]{$\\#88$};\n" +
"	\\node(state89)[below of=state88, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\green&\\green&&&&&\\\\\\hline\n" +
"		&&&&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&&&&&\\green&&\\\\\\hline\n" +
"		&&&&\\green&\\green&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState89)[right of=state89,xshift=0.8cm]{$\\#89$};\n" +
"	\\node(state90)[below of=state89, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState90)[right of=state90,xshift=0.8cm]{$\\#90$};\n" +
"		\\node(xor30)[below of=state90]{$\\oplus$};\n" +
"	\\node(state91)[below of=xor30]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState91)[right of=state91,xshift=0.8cm]{$\\#91$};\n" +
"	\\node(state92)[below of=state91, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState92)[right of=state92,xshift=0.8cm]{$\\#92$};\n" +
"	\\node(state93)[below of=state92, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState93)[right of=state93,xshift=0.8cm]{$\\#93$};\n" +
"		\\node(xor31)[below of=state93]{$\\oplus$};\n" +
"	\\node(state94)[below of=xor31]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState94)[right of=state94,xshift=0.8cm]{$\\#94$};\n" +
"	\\node(state95)[below of=state94, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState95)[right of=state95,xshift=0.8cm]{$\\#95$};\n" +
"		\\node(xor32)[below of=state95]{$\\oplus$};\n" +
"	\\node(state96)[below of=xor32]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState96)[right of=state96,xshift=0.8cm]{$\\#96$};\n" +
"		\\node(xor33)[below of=state96]{$\\oplus$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-1.0cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&&&&\\green&\\green&\\green&\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-1.0cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&\\green&&\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&\\green&&\\green\\\\\\hline\n" +
"		&\\green&\\green&&&&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&&\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-1.0cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\green&\\green&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-1.0cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&&\\green&\\green&\\green&\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&&\\green&\\green&&&\\green\\\\\\hline\n" +
"		&\\green&\\green&&\\green&&&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-1.0cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-1.0cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\green&\\green&&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&\\green&\\green&&&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-1.0cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&&&&\\green&&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-1.0cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\green&\\green&&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-1.0cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&\\green&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&&&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-1.0cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&\\green&&&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-1.0cm]{$\\$10$};\n" +
"	\\node(K11)[left of=xor11, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK11)[left of=K11,xshift=-1.0cm]{$\\$11$};\n" +
"	\\node(K12)[left of=xor12, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&&\\green&&&\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&&&&\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK12)[left of=K12,xshift=-1.0cm]{$\\$12$};\n" +
"	\\node(K13)[left of=xor13, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK13)[left of=K13,xshift=-1.0cm]{$\\$13$};\n" +
"	\\node(K14)[left of=xor14, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&\\green&&&\\\\\\hline\n" +
"		&\\green&&&&&\\green&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK14)[left of=K14,xshift=-1.0cm]{$\\$14$};\n" +
"	\\node(K15)[left of=xor15, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&&&&&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK15)[left of=K15,xshift=-1.0cm]{$\\$15$};\n" +
"	\\node(K16)[left of=xor16, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&&&&\\\\\\hline\n" +
"		\\green&\\green&&&&&&\\\\\\hline\n" +
"		&&&\\green&\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK16)[left of=K16,xshift=-1.0cm]{$\\$16$};\n" +
"	\\node(K17)[left of=xor17, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&\\green&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&\\green&&&&&\\green&\\green\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK17)[left of=K17,xshift=-1.0cm]{$\\$17$};\n" +
"	\\node(K18)[left of=xor18, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK18)[left of=K18,xshift=-1.0cm]{$\\$18$};\n" +
"	\\node(K19)[left of=xor19, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&&&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&&&&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK19)[left of=K19,xshift=-1.0cm]{$\\$19$};\n" +
"	\\node(K20)[left of=xor20, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&&&&&\\\\\\hline\n" +
"		\\green&\\green&&&&&&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK20)[left of=K20,xshift=-1.0cm]{$\\$20$};\n" +
"	\\node(K21)[left of=xor21, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&&\\\\\\hline\n" +
"		&\\green&&&&&&\\\\\\hline\n" +
"		&\\green&&&&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK21)[left of=K21,xshift=-1.0cm]{$\\$21$};\n" +
"	\\node(K22)[left of=xor22, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\green\\\\\\hline\n" +
"		&\\green&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK22)[left of=K22,xshift=-1.0cm]{$\\$22$};\n" +
"	\\node(K23)[left of=xor23, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&&&&&\\\\\\hline\n" +
"		&&&\\green&\\green&&&\\\\\\hline\n" +
"		\\green&\\green&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK23)[left of=K23,xshift=-1.0cm]{$\\$23$};\n" +
"	\\node(K24)[left of=xor24, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&\\green&\\green&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		\\green&\\green&&&&&&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK24)[left of=K24,xshift=-1.0cm]{$\\$24$};\n" +
"	\\node(K25)[left of=xor25, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\green&\\green\\\\\\hline\n" +
"		&&&\\green&\\green&&&\\\\\\hline\n" +
"		\\green&\\green&&&&&\\green&\\\\\\hline\n" +
"		&&&\\green&\\green&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK25)[left of=K25,xshift=-1.0cm]{$\\$25$};\n" +
"	\\node(K26)[left of=xor26, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&&&&\\green&\\\\\\hline\n" +
"		&&&\\green&\\green&&&\\\\\\hline\n" +
"		\\green&\\green&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK26)[left of=K26,xshift=-1.0cm]{$\\$26$};\n" +
"	\\node(K27)[left of=xor27, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\green&\\green&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\green&\\green&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK27)[left of=K27,xshift=-1.0cm]{$\\$27$};\n" +
"	\\node(K28)[left of=xor28, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK28)[left of=K28,xshift=-1.0cm]{$\\$28$};\n" +
"	\\node(K29)[left of=xor29, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\green&\\green&&&&&&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK29)[left of=K29,xshift=-1.0cm]{$\\$29$};\n" +
"	\\node(K30)[left of=xor30, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK30)[left of=K30,xshift=-1.0cm]{$\\$30$};\n" +
"	\\node(K31)[left of=xor31, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\green&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK31)[left of=K31,xshift=-1.0cm]{$\\$31$};\n" +
"	\\node(K32)[left of=xor32, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK32)[left of=K32,xshift=-1.0cm]{$\\$32$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state4);\n" +
"	\\path [line] (state4) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state9);\n" +
"	\\path [line] (state9) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state16);\n" +
"	\\path [line] (state16) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state21);\n" +
"	\\path [line] (state21) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state28);\n" +
"	\\path [line] (state28) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state33);\n" +
"	\\path [line] (state33) -- (xor11);\n" +
"	\\path [line] (xor11) -- (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor12);\n" +
"	\\path [line] (xor12) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor13);\n" +
"	\\path [line] (xor13) -- (state40);\n" +
"	\\path [line] (state40) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state41);\n" +
"	\\path [line] (state41) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state42);\n" +
"	\\path [line] (state42) -- (xor14);\n" +
"	\\path [line] (xor14) -- (state43);\n" +
"	\\path [line] (state43) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state44);\n" +
"	\\path [line] (state44) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state45);\n" +
"	\\path [line] (state45) -- (xor15);\n" +
"	\\path [line] (xor15) -- (state46);\n" +
"	\\path [line] (state46) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state47);\n" +
"	\\path [line] (state47) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state48);\n" +
"	\\path [line] (state48) -- (xor16);\n" +
"	\\path [line] (xor16) -- (state49);\n" +
"	\\path [line] (state49) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state50);\n" +
"	\\path [line] (state50) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state51);\n" +
"	\\path [line] (state51) -- (xor17);\n" +
"	\\path [line] (xor17) -- (state52);\n" +
"	\\path [line] (state52) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state53);\n" +
"	\\path [line] (state53) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state54);\n" +
"	\\path [line] (state54) -- (xor18);\n" +
"	\\path [line] (xor18) -- (state55);\n" +
"	\\path [line] (state55) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state56);\n" +
"	\\path [line] (state56) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state57);\n" +
"	\\path [line] (state57) -- (xor19);\n" +
"	\\path [line] (xor19) -- (state58);\n" +
"	\\path [line] (state58) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state59);\n" +
"	\\path [line] (state59) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state60);\n" +
"	\\path [line] (state60) -- (xor20);\n" +
"	\\path [line] (xor20) -- (state61);\n" +
"	\\path [line] (state61) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state62);\n" +
"	\\path [line] (state62) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state63);\n" +
"	\\path [line] (state63) -- (xor21);\n" +
"	\\path [line] (xor21) -- (state64);\n" +
"	\\path [line] (state64) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state65);\n" +
"	\\path [line] (state65) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state66);\n" +
"	\\path [line] (state66) -- (xor22);\n" +
"	\\path [line] (xor22) -- (state67);\n" +
"	\\path [line] (state67) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state68);\n" +
"	\\path [line] (state68) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n"),
    
    SERPENT_NABLA_P2("                                        MC\n" +
"                                    \\end{tabular}} (state69);\n" +
"	\\path [line] (state69) -- (xor23);\n" +
"	\\path [line] (xor23) -- (state70);\n" +
"	\\path [line] (state70) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state71);\n" +
"	\\path [line] (state71) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state72);\n" +
"	\\path [line] (state72) -- (xor24);\n" +
"	\\path [line] (xor24) -- (state73);\n" +
"	\\path [line] (state73) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state74);\n" +
"	\\path [line] (state74) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state75);\n" +
"	\\path [line] (state75) -- (xor25);\n" +
"	\\path [line] (xor25) -- (state76);\n" +
"	\\path [line] (state76) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state77);\n" +
"	\\path [line] (state77) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state78);\n" +
"	\\path [line] (state78) -- (xor26);\n" +
"	\\path [line] (xor26) -- (state79);\n" +
"	\\path [line] (state79) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state80);\n" +
"	\\path [line] (state80) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state81);\n" +
"	\\path [line] (state81) -- (xor27);\n" +
"	\\path [line] (xor27) -- (state82);\n" +
"	\\path [line] (state82) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state83);\n" +
"	\\path [line] (state83) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state84);\n" +
"	\\path [line] (state84) -- (xor28);\n" +
"	\\path [line] (xor28) -- (state85);\n" +
"	\\path [line] (state85) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state86);\n" +
"	\\path [line] (state86) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state87);\n" +
"	\\path [line] (state87) -- (xor29);\n" +
"	\\path [line] (xor29) -- (state88);\n" +
"	\\path [line] (state88) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state89);\n" +
"	\\path [line] (state89) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state90);\n" +
"	\\path [line] (state90) -- (xor30);\n" +
"	\\path [line] (xor30) -- (state91);\n" +
"	\\path [line] (state91) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state92);\n" +
"	\\path [line] (state92) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state93);\n" +
"	\\path [line] (state93) -- (xor31);\n" +
"	\\path [line] (xor31) -- (state94);\n" +
"	\\path [line] (state94) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state95);\n" +
"	\\path [line] (state95) -- (xor32);\n" +
"	\\path [line] (xor32) -- (state96);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"	\\path [line] (K11) -- (xor11);\n" +
"	\\path [line] (K12) -- (xor12);\n" +
"	\\path [line] (K13) -- (xor13);\n" +
"	\\path [line] (K14) -- (xor14);\n" +
"	\\path [line] (K15) -- (xor15);\n" +
"	\\path [line] (K16) -- (xor16);\n" +
"	\\path [line] (K17) -- (xor17);\n" +
"	\\path [line] (K18) -- (xor18);\n" +
"	\\path [line] (K19) -- (xor19);\n" +
"	\\path [line] (K20) -- (xor20);\n" +
"	\\path [line] (K21) -- (xor21);\n" +
"	\\path [line] (K22) -- (xor22);\n" +
"	\\path [line] (K23) -- (xor23);\n" +
"	\\path [line] (K24) -- (xor24);\n" +
"	\\path [line] (K25) -- (xor25);\n" +
"	\\path [line] (K26) -- (xor26);\n" +
"	\\path [line] (K27) -- (xor27);\n" +
"	\\path [line] (K28) -- (xor28);\n" +
"	\\path [line] (K29) -- (xor29);\n" +
"	\\path [line] (K30) -- (xor30);\n" +
"	\\path [line] (K31) -- (xor31);\n" +
"	\\path [line] (K32) -- (xor32);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}"),
    
    SERPENT_RECOMPUTATION_P1("\\documentclass{article}\n" +
"\\usepackage[paperheight=155.20000000000002in,paperwidth=5in,top=1in,bottom=1in,right=1in,left=1in]{geometry}\n" +
"\\usepackage[table,xcdraw]{xcolor}\n" +
"\\usepackage{tikz}\n" +
"\\usetikzlibrary{shapes, arrows}\n" +
"\n" +
"\\newcommand{\\blue}{\\cellcolor[HTML]{3166FF}}\n" +
"\\newcommand{\\green}{\\cellcolor[HTML]{32CB00}}\n" +
"\\newcommand{\\salmon}{\\cellcolor[HTML]{FD6864}}\n" +
"\\newcommand{\\darkgreen}{\\cellcolor[HTML]{646809}}\n" +
"\\newcommand{\\grey}{\\cellcolor[HTML]{9B9B9B}}\n" +
"\n" +
"\\begin{document}\n" +
"\\pagestyle{empty}\n" +
"% Define block styles\n" +
"\\tikzstyle{line} = [draw, -latex']\n" +
"   \n" +
"\\centering\n" +
"\\begin{tikzpicture}[node distance = 1.7cm, auto]\n" +
"% Draw States\n" +
"	\\node(state0)[]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState0)[right of=state0,xshift=0.8cm]{$\\#0$};\n" +
"		\\node(xor0)[below of=state0]{$\\oplus$};\n" +
"	\\node(state1)[below of=xor0]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\grey&&\\grey&&&&\\\\\\hline\n" +
"		\\grey&\\grey&&\\grey&\\grey&&\\grey&\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\\\\\hline\n" +
"		\\grey&\\grey&&\\grey&&&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState1)[right of=state1,xshift=0.8cm]{$\\#1$};\n" +
"	\\node(state2)[below of=state1, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\grey&&\\grey&&&&\\\\\\hline\n" +
"		\\grey&\\grey&&\\grey&\\grey&&\\grey&\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\\\\\hline\n" +
"		\\grey&\\grey&&\\grey&&&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState2)[right of=state2,xshift=0.8cm]{$\\#2$};\n" +
"	\\node(state3)[below of=state2, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState3)[right of=state3,xshift=0.8cm]{$\\#3$};\n" +
"		\\node(xor1)[below of=state3]{$\\oplus$};\n" +
"	\\node(state4)[below of=xor1]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState4)[right of=state4,xshift=0.8cm]{$\\#4$};\n" +
"	\\node(state5)[below of=state4, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState5)[right of=state5,xshift=0.8cm]{$\\#5$};\n" +
"	\\node(state6)[below of=state5, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState6)[right of=state6,xshift=0.8cm]{$\\#6$};\n" +
"		\\node(xor2)[below of=state6]{$\\oplus$};\n" +
"	\\node(state7)[below of=xor2]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState7)[right of=state7,xshift=0.8cm]{$\\#7$};\n" +
"	\\node(state8)[below of=state7, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState8)[right of=state8,xshift=0.8cm]{$\\#8$};\n" +
"	\\node(state9)[below of=state8, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState9)[right of=state9,xshift=0.8cm]{$\\#9$};\n" +
"		\\node(xor3)[below of=state9]{$\\oplus$};\n" +
"	\\node(state10)[below of=xor3]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState10)[right of=state10,xshift=0.8cm]{$\\#10$};\n" +
"	\\node(state11)[below of=state10, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState11)[right of=state11,xshift=0.8cm]{$\\#11$};\n" +
"	\\node(state12)[below of=state11, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState12)[right of=state12,xshift=0.8cm]{$\\#12$};\n" +
"		\\node(xor4)[below of=state12]{$\\oplus$};\n" +
"	\\node(state13)[below of=xor4]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState13)[right of=state13,xshift=0.8cm]{$\\#13$};\n" +
"	\\node(state14)[below of=state13, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState14)[right of=state14,xshift=0.8cm]{$\\#14$};\n" +
"	\\node(state15)[below of=state14, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState15)[right of=state15,xshift=0.8cm]{$\\#15$};\n" +
"		\\node(xor5)[below of=state15]{$\\oplus$};\n" +
"	\\node(state16)[below of=xor5]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState16)[right of=state16,xshift=0.8cm]{$\\#16$};\n" +
"	\\node(state17)[below of=state16, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState17)[right of=state17,xshift=0.8cm]{$\\#17$};\n" +
"	\\node(state18)[below of=state17, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState18)[right of=state18,xshift=0.8cm]{$\\#18$};\n" +
"		\\node(xor6)[below of=state18]{$\\oplus$};\n" +
"	\\node(state19)[below of=xor6]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState19)[right of=state19,xshift=0.8cm]{$\\#19$};\n" +
"	\\node(state20)[below of=state19, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState20)[right of=state20,xshift=0.8cm]{$\\#20$};\n" +
"	\\node(state21)[below of=state20, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState21)[right of=state21,xshift=0.8cm]{$\\#21$};\n" +
"		\\node(xor7)[below of=state21]{$\\oplus$};\n" +
"	\\node(state22)[below of=xor7]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState22)[right of=state22,xshift=0.8cm]{$\\#22$};\n" +
"	\\node(state23)[below of=state22, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState23)[right of=state23,xshift=0.8cm]{$\\#23$};\n" +
"	\\node(state24)[below of=state23, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState24)[right of=state24,xshift=0.8cm]{$\\#24$};\n" +
"		\\node(xor8)[below of=state24]{$\\oplus$};\n" +
"	\\node(state25)[below of=xor8]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState25)[right of=state25,xshift=0.8cm]{$\\#25$};\n" +
"	\\node(state26)[below of=state25, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState26)[right of=state26,xshift=0.8cm]{$\\#26$};\n" +
"	\\node(state27)[below of=state26, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState27)[right of=state27,xshift=0.8cm]{$\\#27$};\n" +
"		\\node(xor9)[below of=state27]{$\\oplus$};\n" +
"	\\node(state28)[below of=xor9]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState28)[right of=state28,xshift=0.8cm]{$\\#28$};\n" +
"	\\node(state29)[below of=state28, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState29)[right of=state29,xshift=0.8cm]{$\\#29$};\n" +
"	\\node(state30)[below of=state29, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState30)[right of=state30,xshift=0.8cm]{$\\#30$};\n" +
"		\\node(xor10)[below of=state30]{$\\oplus$};\n" +
"	\\node(state31)[below of=xor10]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState31)[right of=state31,xshift=0.8cm]{$\\#31$};\n" +
"	\\node(state32)[below of=state31, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState32)[right of=state32,xshift=0.8cm]{$\\#32$};\n" +
"	\\node(state33)[below of=state32, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState33)[right of=state33,xshift=0.8cm]{$\\#33$};\n" +
"		\\node(xor11)[below of=state33]{$\\oplus$};\n" +
"	\\node(state34)[below of=xor11]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState34)[right of=state34,xshift=0.8cm]{$\\#34$};\n" +
"	\\node(state35)[below of=state34, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState35)[right of=state35,xshift=0.8cm]{$\\#35$};\n" +
"	\\node(state36)[below of=state35, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState36)[right of=state36,xshift=0.8cm]{$\\#36$};\n" +
"		\\node(xor12)[below of=state36]{$\\oplus$};\n" +
"	\\node(state37)[below of=xor12]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState37)[right of=state37,xshift=0.8cm]{$\\#37$};\n" +
"	\\node(state38)[below of=state37, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState38)[right of=state38,xshift=0.8cm]{$\\#38$};\n" +
"	\\node(state39)[below of=state38, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState39)[right of=state39,xshift=0.8cm]{$\\#39$};\n" +
"		\\node(xor13)[below of=state39]{$\\oplus$};\n" +
"	\\node(state40)[below of=xor13]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState40)[right of=state40,xshift=0.8cm]{$\\#40$};\n" +
"	\\node(state41)[below of=state40, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState41)[right of=state41,xshift=0.8cm]{$\\#41$};\n" +
"	\\node(state42)[below of=state41, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState42)[right of=state42,xshift=0.8cm]{$\\#42$};\n" +
"		\\node(xor14)[below of=state42]{$\\oplus$};\n" +
"	\\node(state43)[below of=xor14]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState43)[right of=state43,xshift=0.8cm]{$\\#43$};\n" +
"	\\node(state44)[below of=state43, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState44)[right of=state44,xshift=0.8cm]{$\\#44$};\n" +
"	\\node(state45)[below of=state44, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState45)[right of=state45,xshift=0.8cm]{$\\#45$};\n" +
"		\\node(xor15)[below of=state45]{$\\oplus$};\n" +
"	\\node(state46)[below of=xor15]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState46)[right of=state46,xshift=0.8cm]{$\\#46$};\n" +
"	\\node(state47)[below of=state46, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState47)[right of=state47,xshift=0.8cm]{$\\#47$};\n" +
"	\\node(state48)[below of=state47, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState48)[right of=state48,xshift=0.8cm]{$\\#48$};\n" +
"		\\node(xor16)[below of=state48]{$\\oplus$};\n" +
"	\\node(state49)[below of=xor16]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState49)[right of=state49,xshift=0.8cm]{$\\#49$};\n" +
"	\\node(state50)[below of=state49, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState50)[right of=state50,xshift=0.8cm]{$\\#50$};\n" +
"	\\node(state51)[below of=state50, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState51)[right of=state51,xshift=0.8cm]{$\\#51$};\n" +
"		\\node(xor17)[below of=state51]{$\\oplus$};\n" +
"	\\node(state52)[below of=xor17]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState52)[right of=state52,xshift=0.8cm]{$\\#52$};\n" +
"	\\node(state53)[below of=state52, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState53)[right of=state53,xshift=0.8cm]{$\\#53$};\n" +
"	\\node(state54)[below of=state53, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState54)[right of=state54,xshift=0.8cm]{$\\#54$};\n" +
"		\\node(xor18)[below of=state54]{$\\oplus$};\n" +
"	\\node(state55)[below of=xor18]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState55)[right of=state55,xshift=0.8cm]{$\\#55$};\n" +
"	\\node(state56)[below of=state55, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState56)[right of=state56,xshift=0.8cm]{$\\#56$};\n" +
"	\\node(state57)[below of=state56, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState57)[right of=state57,xshift=0.8cm]{$\\#57$};\n" +
"		\\node(xor19)[below of=state57]{$\\oplus$};\n" +
"	\\node(state58)[below of=xor19]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState58)[right of=state58,xshift=0.8cm]{$\\#58$};\n" +
"	\\node(state59)[below of=state58, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState59)[right of=state59,xshift=0.8cm]{$\\#59$};\n" +
"	\\node(state60)[below of=state59, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState60)[right of=state60,xshift=0.8cm]{$\\#60$};\n" +
"		\\node(xor20)[below of=state60]{$\\oplus$};\n" +
"	\\node(state61)[below of=xor20]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState61)[right of=state61,xshift=0.8cm]{$\\#61$};\n" +
"	\\node(state62)[below of=state61, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState62)[right of=state62,xshift=0.8cm]{$\\#62$};\n" +
"	\\node(state63)[below of=state62, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState63)[right of=state63,xshift=0.8cm]{$\\#63$};\n" +
"		\\node(xor21)[below of=state63]{$\\oplus$};\n" +
"	\\node(state64)[below of=xor21]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState64)[right of=state64,xshift=0.8cm]{$\\#64$};\n" +
"	\\node(state65)[below of=state64, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState65)[right of=state65,xshift=0.8cm]{$\\#65$};\n" +
"	\\node(state66)[below of=state65, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState66)[right of=state66,xshift=0.8cm]{$\\#66$};\n" +
"		\\node(xor22)[below of=state66]{$\\oplus$};\n" +
"	\\node(state67)[below of=xor22]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState67)[right of=state67,xshift=0.8cm]{$\\#67$};\n" +
"	\\node(state68)[below of=state67, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState68)[right of=state68,xshift=0.8cm]{$\\#68$};\n" +
"	\\node(state69)[below of=state68, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&&&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState69)[right of=state69,xshift=0.8cm]{$\\#69$};\n" +
"		\\node(xor23)[below of=state69]{$\\oplus$};\n" +
"	\\node(state70)[below of=xor23]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&&&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState70)[right of=state70,xshift=0.8cm]{$\\#70$};\n" +
"	\\node(state71)[below of=state70, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&&&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState71)[right of=state71,xshift=0.8cm]{$\\#71$};\n" +
"	\\node(state72)[below of=state71, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\grey&&&&\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&&&&&&&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState72)[right of=state72,xshift=0.8cm]{$\\#72$};\n" +
"		\\node(xor24)[below of=state72]{$\\oplus$};\n" +
"	\\node(state73)[below of=xor24]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\grey&&&&\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&&&&&&&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState73)[right of=state73,xshift=0.8cm]{$\\#73$};\n" +
"	\\node(state74)[below of=state73, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&\\grey&\\grey&&&&\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&&&&&&&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState74)[right of=state74,xshift=0.8cm]{$\\#74$};\n" +
"	\\node(state75)[below of=state74, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState75)[right of=state75,xshift=0.8cm]{$\\#75$};\n" +
"		\\node(xor25)[below of=state75]{$\\oplus$};\n" +
"	\\node(state76)[below of=xor25]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState76)[right of=state76,xshift=0.8cm]{$\\#76$};\n" +
"	\\node(state77)[below of=state76, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState77)[right of=state77,xshift=0.8cm]{$\\#77$};\n" +
"	\\node(state78)[below of=state77, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\\\\\hline\n" +
"		&&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&&&&&&&\\grey\\\\\\hline\n" +
"		&&&&&\\grey&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState78)[right of=state78,xshift=0.8cm]{$\\#78$};\n" +
"		\\node(xor26)[below of=state78]{$\\oplus$};\n" +
"	\\node(state79)[below of=xor26]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\\\\\hline\n" +
"		&&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&&&&&&&\\grey\\\\\\hline\n" +
"		&&&&&\\grey&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState79)[right of=state79,xshift=0.8cm]{$\\#79$};\n" +
"	\\node(state80)[below of=state79, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\\\\\hline\n" +
"		&&&&&&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&&&&&&&\\grey\\\\\\hline\n" +
"		&&&&&\\grey&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState80)[right of=state80,xshift=0.8cm]{$\\#80$};\n" +
"	\\node(state81)[below of=state80, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState81)[right of=state81,xshift=0.8cm]{$\\#81$};\n" +
"		\\node(xor27)[below of=state81]{$\\oplus$};\n" +
"	\\node(state82)[below of=xor27]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState82)[right of=state82,xshift=0.8cm]{$\\#82$};\n" +
"	\\node(state83)[below of=state82, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState83)[right of=state83,xshift=0.8cm]{$\\#83$};\n" +
"	\\node(state84)[below of=state83, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		&&&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState84)[right of=state84,xshift=0.8cm]{$\\#84$};\n" +
"		\\node(xor28)[below of=state84]{$\\oplus$};\n" +
"	\\node(state85)[below of=xor28]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		&&&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState85)[right of=state85,xshift=0.8cm]{$\\#85$};\n" +
"	\\node(state86)[below of=state85, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		&&&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState86)[right of=state86,xshift=0.8cm]{$\\#86$};\n" +
"	\\node(state87)[below of=state86, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\grey&\\grey&\\grey&&&&&\\\\\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		&&&&&\\grey&\\grey&\\\\\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState87)[right of=state87,xshift=0.8cm]{$\\#87$};\n" +
"		\\node(xor29)[below of=state87]{$\\oplus$};\n" +
"	\\node(state88)[below of=xor29]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\grey&\\grey&&&&&\\\\\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		&&&&&\\grey&&\\\\\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState88)[right of=state88,xshift=0.8cm]{$\\#88$};\n" +
"	\\node(state89)[below of=state88, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\grey&\\grey&&&&&\\\\\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\grey\\\\\\hline\n" +
"		&&&&&\\grey&&\\\\\\hline\n" +
"		&&&&\\grey&\\grey&\\grey&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState89)[right of=state89,xshift=0.8cm]{$\\#89$};\n" +
"	\\node(state90)[below of=state89, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&\\grey&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState90)[right of=state90,xshift=0.8cm]{$\\#90$};\n" +
"		\\node(xor30)[below of=state90]{$\\oplus$};\n" +
"	\\node(state91)[below of=xor30]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState91)[right of=state91,xshift=0.8cm]{$\\#91$};\n" +
"	\\node(state92)[below of=state91, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState92)[right of=state92,xshift=0.8cm]{$\\#92$};\n" +
"	\\node(state93)[below of=state92, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState93)[right of=state93,xshift=0.8cm]{$\\#93$};\n" +
"		\\node(xor31)[below of=state93]{$\\oplus$};\n" +
"	\\node(state94)[below of=xor31]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState94)[right of=state94,xshift=0.8cm]{$\\#94$};\n" +
"	\\node(state95)[below of=state94, yshift=-2cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState95)[right of=state95,xshift=0.8cm]{$\\#95$};\n" +
"		\\node(xor32)[below of=state95]{$\\oplus$};\n" +
"	\\node(state96)[below of=xor32]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
" 		\\node(numberOfState96)[right of=state96,xshift=0.8cm]{$\\#96$};\n" +
"		\\node(xor33)[below of=state96]{$\\oplus$};\n" +
"    % Draw keys\n" +
"	\\node(K0)[left of=xor0, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK0)[left of=K0,xshift=-1.0cm]{$\\$0$};\n" +
"	\\node(K1)[left of=xor1, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&&\\salmon&\\salmon&\\salmon&\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK1)[left of=K1,xshift=-1.0cm]{$\\$1$};\n" +
"	\\node(K2)[left of=xor2, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&\\salmon&&\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&&&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&&\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK2)[left of=K2,xshift=-1.0cm]{$\\$2$};\n" +
"	\\node(K3)[left of=xor3, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK3)[left of=K3,xshift=-1.0cm]{$\\$3$};\n" +
"	\\node(K4)[left of=xor4, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon&\\salmon&\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&&\\salmon&&&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK4)[left of=K4,xshift=-1.0cm]{$\\$4$};\n" +
"	\\node(K5)[left of=xor5, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK5)[left of=K5,xshift=-1.0cm]{$\\$5$};\n" +
"	\\node(K6)[left of=xor6, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\salmon&\\salmon&&\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&\\salmon&\\salmon&&&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK6)[left of=K6,xshift=-1.0cm]{$\\$6$};\n" +
"	\\node(K7)[left of=xor7, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK7)[left of=K7,xshift=-1.0cm]{$\\$7$};\n" +
"	\\node(K8)[left of=xor8, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\salmon&\\salmon&&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK8)[left of=K8,xshift=-1.0cm]{$\\$8$};\n" +
"	\\node(K9)[left of=xor9, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&\\salmon&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&&&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK9)[left of=K9,xshift=-1.0cm]{$\\$9$};\n" +
"	\\node(K10)[left of=xor10, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&\\salmon&&&&\\salmon&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK10)[left of=K10,xshift=-1.0cm]{$\\$10$};\n" +
"	\\node(K11)[left of=xor11, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK11)[left of=K11,xshift=-1.0cm]{$\\$11$};\n" +
"	\\node(K12)[left of=xor12, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&&\\salmon&&&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&&&&\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK12)[left of=K12,xshift=-1.0cm]{$\\$12$};\n" +
"	\\node(K13)[left of=xor13, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK13)[left of=K13,xshift=-1.0cm]{$\\$13$};\n" +
"	\\node(K14)[left of=xor14, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&\\salmon&&&\\\\\\hline\n" +
"		&\\salmon&&&&&\\salmon&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK14)[left of=K14,xshift=-1.0cm]{$\\$14$};\n" +
"	\\node(K15)[left of=xor15, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&&&\\salmon&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK15)[left of=K15,xshift=-1.0cm]{$\\$15$};\n" +
"	\\node(K16)[left of=xor16, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK16)[left of=K16,xshift=-1.0cm]{$\\$16$};\n" +
"	\\node(K17)[left of=xor17, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&\\salmon&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&\\salmon&&&&&\\salmon&\\salmon\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK17)[left of=K17,xshift=-1.0cm]{$\\$17$};\n" +
"	\\node(K18)[left of=xor18, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK18)[left of=K18,xshift=-1.0cm]{$\\$18$};\n" +
"	\\node(K19)[left of=xor19, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&&&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&&&&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK19)[left of=K19,xshift=-1.0cm]{$\\$19$};\n" +
"	\\node(K20)[left of=xor20, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&&&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK20)[left of=K20,xshift=-1.0cm]{$\\$20$};\n" +
"	\\node(K21)[left of=xor21, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		&\\salmon&&&&&&\\\\\\hline\n" +
"		&\\salmon&&&&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK21)[left of=K21,xshift=-1.0cm]{$\\$21$};\n" +
"	\\node(K22)[left of=xor22, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\salmon\\\\\\hline\n" +
"		&\\salmon&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK22)[left of=K22,xshift=-1.0cm]{$\\$22$};\n" +
"	\\node(K23)[left of=xor23, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&&&&&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK23)[left of=K23,xshift=-1.0cm]{$\\$23$};\n" +
"	\\node(K24)[left of=xor24, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&\\salmon&\\salmon&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK24)[left of=K24,xshift=-1.0cm]{$\\$24$};\n" +
"	\\node(K25)[left of=xor25, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\salmon&\\salmon\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&\\salmon&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK25)[left of=K25,xshift=-1.0cm]{$\\$25$};\n" +
"	\\node(K26)[left of=xor26, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&&&&\\salmon&\\\\\\hline\n" +
"		&&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK26)[left of=K26,xshift=-1.0cm]{$\\$26$};\n" +
"	\\node(K27)[left of=xor27, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&\\salmon&\\salmon&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\salmon&\\salmon&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK27)[left of=K27,xshift=-1.0cm]{$\\$27$};\n" +
"	\\node(K28)[left of=xor28, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK28)[left of=K28,xshift=-1.0cm]{$\\$28$};\n" +
"	\\node(K29)[left of=xor29, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		\\salmon&\\salmon&&&&&&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK29)[left of=K29,xshift=-1.0cm]{$\\$29$};\n" +
"	\\node(K30)[left of=xor30, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK30)[left of=K30,xshift=-1.0cm]{$\\$30$};\n" +
"	\\node(K31)[left of=xor31, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&\\salmon&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK31)[left of=K31,xshift=-1.0cm]{$\\$31$};\n" +
"	\\node(K32)[left of=xor32, xshift=-2.0cm]{\\begin{tabular}{|l|l|l|l|l|l|l|l|}\n" +
"		\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		&&&&&&&\\\\\\hline\n" +
"		\\end{tabular}};\n" +
"		\\node(numberK32)[left of=K32,xshift=-1.0cm]{$\\$32$};\n" +
"    % Draw edges\n" +
"	\\path [line] (state0) -- (xor0);\n" +
"	\\path [line] (xor0) -- (state1);\n" +
"	\\path [line] (state1) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state2);\n" +
"	\\path [line] (state2) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state3);\n" +
"	\\path [line] (state3) -- (xor1);\n" +
"	\\path [line] (xor1) -- (state4);\n" +
"	\\path [line] (state4) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state5);\n" +
"	\\path [line] (state5) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state6);\n" +
"	\\path [line] (state6) -- (xor2);\n" +
"	\\path [line] (xor2) -- (state7);\n" +
"	\\path [line] (state7) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state8);\n" +
"	\\path [line] (state8) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state9);\n" +
"	\\path [line] (state9) -- (xor3);\n" +
"	\\path [line] (xor3) -- (state10);\n" +
"	\\path [line] (state10) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state11);\n" +
"	\\path [line] (state11) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state12);\n" +
"	\\path [line] (state12) -- (xor4);\n" +
"	\\path [line] (xor4) -- (state13);\n" +
"	\\path [line] (state13) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state14);\n" +
"	\\path [line] (state14) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state15);\n" +
"	\\path [line] (state15) -- (xor5);\n" +
"	\\path [line] (xor5) -- (state16);\n" +
"	\\path [line] (state16) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state17);\n" +
"	\\path [line] (state17) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state18);\n" +
"	\\path [line] (state18) -- (xor6);\n" +
"	\\path [line] (xor6) -- (state19);\n" +
"	\\path [line] (state19) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state20);\n" +
"	\\path [line] (state20) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state21);\n" +
"	\\path [line] (state21) -- (xor7);\n" +
"	\\path [line] (xor7) -- (state22);\n" +
"	\\path [line] (state22) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state23);\n" +
"	\\path [line] (state23) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state24);\n" +
"	\\path [line] (state24) -- (xor8);\n" +
"	\\path [line] (xor8) -- (state25);\n" +
"	\\path [line] (state25) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state26);\n" +
"	\\path [line] (state26) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state27);\n" +
"	\\path [line] (state27) -- (xor9);\n" +
"	\\path [line] (xor9) -- (state28);\n" +
"	\\path [line] (state28) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state29);\n" +
"	\\path [line] (state29) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state30);\n" +
"	\\path [line] (state30) -- (xor10);\n" +
"	\\path [line] (xor10) -- (state31);\n" +
"	\\path [line] (state31) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state32);\n" +
"	\\path [line] (state32) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state33);\n" +
"	\\path [line] (state33) -- (xor11);\n" +
"	\\path [line] (xor11) -- (state34);\n" +
"	\\path [line] (state34) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state35);\n" +
"	\\path [line] (state35) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state36);\n" +
"	\\path [line] (state36) -- (xor12);\n" +
"	\\path [line] (xor12) -- (state37);\n" +
"	\\path [line] (state37) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state38);\n" +
"	\\path [line] (state38) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state39);\n" +
"	\\path [line] (state39) -- (xor13);\n" +
"	\\path [line] (xor13) -- (state40);\n" +
"	\\path [line] (state40) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state41);\n" +
"	\\path [line] (state41) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state42);\n" +
"	\\path [line] (state42) -- (xor14);\n" +
"	\\path [line] (xor14) -- (state43);\n" +
"	\\path [line] (state43) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state44);\n" +
"	\\path [line] (state44) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state45);\n" +
"	\\path [line] (state45) -- (xor15);\n" +
"	\\path [line] (xor15) -- (state46);\n" +
"	\\path [line] (state46) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state47);\n" +
"	\\path [line] (state47) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state48);\n" +
"	\\path [line] (state48) -- (xor16);\n" +
"	\\path [line] (xor16) -- (state49);\n" +
"	\\path [line] (state49) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state50);\n" +
"	\\path [line] (state50) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state51);\n" +
"	\\path [line] (state51) -- (xor17);\n" +
"	\\path [line] (xor17) -- (state52);\n" +
"	\\path [line] (state52) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state53);\n" +
"	\\path [line] (state53) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state54);\n" +
"	\\path [line] (state54) -- (xor18);\n" +
"	\\path [line] (xor18) -- (state55);\n" +
"	\\path [line] (state55) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state56);\n" +
"	\\path [line] (state56) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state57);\n" +
"	\\path [line] (state57) -- (xor19);\n" +
"	\\path [line] (xor19) -- (state58);\n" +
"	\\path [line] (state58) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state59);\n" +
"	\\path [line] (state59) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state60);\n" +
"	\\path [line] (state60) -- (xor20);\n" +
"	\\path [line] (xor20) -- (state61);\n" +
"	\\path [line] (state61) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state62);\n" +
"	\\path [line] (state62) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state63);\n" +
"	\\path [line] (state63) -- (xor21);\n" +
"	\\path [line] (xor21) -- (state64);\n" +
"	\\path [line] (state64) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state65);\n" +
"	\\path [line] (state65) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state66);\n" +
"	\\path [line] (state66) -- (xor22);\n" +
"	\\path [line] (xor22) -- (state67);\n" +
"	\\path [line] (state67) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state68);\n" +
"	\\path [line] (state68) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state69);\n" +
"	\\path [line] (state69) -- (xor23);\n" +
"	\\path [line] (xor23) -- (state70);\n" +
"	\\path [line] (state70) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state71);\n" +
"	\\path [line] (state71) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state72);\n" +
"	\\path [line] (state72) -- (xor24);\n" +
"	\\path [line] (xor24) -- (state73);\n" +
"	\\path [line] (state73) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state74);\n" +
"	\\path [line] (state74) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state75);\n" +
"	\\path [line] (state75) -- (xor25);\n" +
"	\\path [line] (xor25) -- (state76);\n" +
"	\\path [line] (state76) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state77);\n" +
"	\\path [line] (state77) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state78);\n" +
"	\\path [line] (state78) -- (xor26);\n" +
"	\\path [line] (xor26) -- (state79);\n" +
"	\\path [line] (state79) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state80);\n" +
"	\\path [line] (state80) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state81);\n" +
"	\\path [line] (state81) -- (xor27);\n" +
"	\\path [line] (xor27) -- (state82);\n" +
"	\\path [line] (state82) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state83);\n" +
"	\\path [line] (state83) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state84);\n" +
"	\\path [line] (state84) -- (xor28);\n" +
"	\\path [line] (xor28) -- (state85);\n" +
"	\\path [line] (state85) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state86);\n" +
"	\\path [line] (state86) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state87);\n" +
"	\\path [line] (state87) -- (xor29);\n" +
"	\\path [line] (xor29) -- (state88);\n" +
"	\\path [line] (state88) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state89);\n"),
    
    SERPENT_RECOMPUTATION_P2("	\\path [line] (state89) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state90);\n" +
"	\\path [line] (state90) -- (xor30);\n" +
"	\\path [line] (xor30) -- (state91);\n" +
"	\\path [line] (state91) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state92);\n" +
"	\\path [line] (state92) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state93);\n" +
"	\\path [line] (state93) -- (xor31);\n" +
"	\\path [line] (xor31) -- (state94);\n" +
"	\\path [line] (state94) --  node{\\begin{tabular}{l}\n" +
"                                        SB \\\\\n" +
"                                        SR \\\\ \n" +
"                                        MC\n" +
"                                    \\end{tabular}} (state95);\n" +
"	\\path [line] (state95) -- (xor32);\n" +
"	\\path [line] (xor32) -- (state96);\n" +
"	\\path [line] (K0) -- (xor0);\n" +
"	\\path [line] (K1) -- (xor1);\n" +
"	\\path [line] (K2) -- (xor2);\n" +
"	\\path [line] (K3) -- (xor3);\n" +
"	\\path [line] (K4) -- (xor4);\n" +
"	\\path [line] (K5) -- (xor5);\n" +
"	\\path [line] (K6) -- (xor6);\n" +
"	\\path [line] (K7) -- (xor7);\n" +
"	\\path [line] (K8) -- (xor8);\n" +
"	\\path [line] (K9) -- (xor9);\n" +
"	\\path [line] (K10) -- (xor10);\n" +
"	\\path [line] (K11) -- (xor11);\n" +
"	\\path [line] (K12) -- (xor12);\n" +
"	\\path [line] (K13) -- (xor13);\n" +
"	\\path [line] (K14) -- (xor14);\n" +
"	\\path [line] (K15) -- (xor15);\n" +
"	\\path [line] (K16) -- (xor16);\n" +
"	\\path [line] (K17) -- (xor17);\n" +
"	\\path [line] (K18) -- (xor18);\n" +
"	\\path [line] (K19) -- (xor19);\n" +
"	\\path [line] (K20) -- (xor20);\n" +
"	\\path [line] (K21) -- (xor21);\n" +
"	\\path [line] (K22) -- (xor22);\n" +
"	\\path [line] (K23) -- (xor23);\n" +
"	\\path [line] (K24) -- (xor24);\n" +
"	\\path [line] (K25) -- (xor25);\n" +
"	\\path [line] (K26) -- (xor26);\n" +
"	\\path [line] (K27) -- (xor27);\n" +
"	\\path [line] (K28) -- (xor28);\n" +
"	\\path [line] (K29) -- (xor29);\n" +
"	\\path [line] (K30) -- (xor30);\n" +
"	\\path [line] (K31) -- (xor31);\n" +
"	\\path [line] (K32) -- (xor32);\n" +
"\\end{tikzpicture}\n" +
"\\end{document}");
    
    
    
    
    private final String value;

    private TestConstants(String value) {
        this.value = value;
    }
    
    public String value(){
        return this.value;
    }
}

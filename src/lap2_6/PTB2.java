package lap2_6;

public class PTB2 {

public String WhatKind(int a,int b, int c) {
	if (a == 0) {
		return "degenerate"; }
	int delta = b * b - 4 * a * c ;
	if (delta > 0 ) {
		return "two";
	} else if (delta == 0) {
		return "one";
	} else {
		return"none";
	}
}
}

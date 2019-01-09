package main;

import java.io.File;

import visitors.VisitPython2;

public class ExampleVisitiPython2 {
	public static void main(String[] args) {
		VisitPython2 visitor = new VisitPython2();
		visitor.visit(new File("examples/samplepython2.txt"));
	}
}

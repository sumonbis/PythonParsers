package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import visitors.VisitPython3;

public class ExampleVisitPython3 {

	public static void main(String[] args) {
		VisitPython3 visitor = new VisitPython3();
	    visitor.visit(new File("examples/py2.py"));
	}
}
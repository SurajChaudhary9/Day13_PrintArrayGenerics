/**
 * UC2 :PROBLEM STATEMENT
 * Given an array of Integer, Double and Character, write a program to print the UC 2 same using Generics
 */

/**
 * @author Suraj Chaudhary
 * @date 25-Feb-2022
 */
// integer array printing
package com.bridgelabz.printarray;

public class PrintArray {
	private static <t> void toPrint(t[] inputArray) {
		for (t element : inputArray) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("___________Welcome to Printing Array using Java Generics___________");

		Integer[] a = { 1, 2, 3 };
		Double[] b = { 1.2, 1.2, 1.3 };
		Character[] c = { 'a', 's', 'h', 'i', 'k', 'a' };

		toPrint(a);
		toPrint(b);
		toPrint(c);

	}

}

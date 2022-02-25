/**
 * UC1 :PROBLEM STATEMENT
 * Given an array of Integer,
Double and Character, write
a program to print the same - Create PrintArray class and define
toPrint method to print
corresponding elements to stdout
 */

/**
 * @author Suraj Chaudhary
 * @date 25-Feb-2022
 */
// integer array printing
package com.bridgelabz.printarray;

public class PrintArray {
	private static void toPrint(Integer[] a) {

		for (int element : a) {
			System.out.println(element);
		}

	}

	// double array printing
	private static void toPrint(Double[] b) {

		for (double element : b) {
			System.out.println(element);
		}

	}

	// character array printing
	private static void toPrint(Character[] c) {

		for (char element : c) {
			System.out.println(element);
		}

	}

	public static void main(String[] args) {

		System.out.println("_______________Welcome to Printing Array using Java Generics ________________");

		Integer[] a = { 1, 2, 3 };
		Double[] b = { 1.2, 1.2, 1.3 };
		Character[] c = { 'a', 's', 'h', 'i', 'k', 'a' };
		toPrint(a);
		toPrint(b);
		toPrint(c);

	}

}

/**
 * UC3 :PROBLEM STATEMENT
 * Given an array of Integer, Double and Character, write a program to print the UC 2 same using Generics Class
 */

/**
 * @author Suraj Chaudhary
 * @date 25-Feb-2022
 */
// integer array printing
package com.bridgelabz.printarray;

public class PrintArray<T> {

	private T[] inputArray;

	public PrintArray(T[] inputArray) {
		this.inputArray = inputArray;
	}

	public void toPrint() {
		PrintArray.toPrint(this.inputArray);
	}

	private static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("__________Welcome to Printing Array using Java Generics___________");

		Integer[] integerArray = { 1, 2, 3 };
		Double[] doubleArray = { 1.2, 1.2, 1.3 };
		Character[] characterArray = { 'a', 's', 'h', 'i', 'k', 'a' };

		new PrintArray(integerArray).toPrint();
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(characterArray);

	}

}

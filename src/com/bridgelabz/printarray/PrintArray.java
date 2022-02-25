/**
 * @author Suraj Chaudhary
 * @date 25-Feb-2022
 */

package com.bridgelabz.printarray;

public class PrintArray<X, Y, Z> {
	private X[] myXArray;
	private Y[] myYArray;
	private Z[] myZArray;

//constructor
	public PrintArray(X[] myXArray, Y[] myYArray, Z[] myZArray) {
		super();
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;
	}

	// generic array printing
	static public <T> void printArray(T[] arr) {
		for (T element : arr)
			System.out.print(element + " ");
		System.out.println();
	}

	// generic array printing using class

	private void printArray() {
		printArray(myXArray);
		printArray(myYArray);
		printArray(myZArray);
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 10, 20, 30 };
		Double[] arr2 = { 1.23, 2.24, 3.345 };
		Character[] arr3 = { 'a', 'A', 'V' };
		/// using generic methods
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
		/// passing all types at same time
		new PrintArray<Integer, Double, Character>(arr1, arr2, arr3).printArray();

	}

}
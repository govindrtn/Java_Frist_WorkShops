package com.bl.workshop;

import java.util.Scanner;

public class Largest_Number {

	public void largestNumberInArray(int arr[]) {

//		int largest = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (largest < arr[i]) {
//				largest = arr[i];
//			}
//		}
//		System.out.println("The largest Number in Array --> " + largest);
//	} 
		
		int largest = arr[0];
		for (int i = 0 ; i < arr.length ; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the lenght of Array :- ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of array  : -");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		Largest_Number myArray = new Largest_Number();
		myArray.largestNumberInArray(array);

	}
}

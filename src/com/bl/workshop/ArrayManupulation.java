package com.bl.workshop;

import java.util.Scanner;

public class ArrayManupulation {
	public void arrayCount(int arr[], int num) {
		int countZero = 0;
		int countOne = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZero++;
			} else {
				countOne++;
			}
		}
		for (int i = 0; i < countZero; i++) {
			System.out.print(4 + " ");
		}
		for (int i = 0; i < countOne; i++) {
			System.out.print(1 + " ");
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("----->> Zeros " + countZero + "------>>  One " + countOne);
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

		ArrayManupulation myArray = new ArrayManupulation();
		myArray.arrayCount(array, size);
	}
}

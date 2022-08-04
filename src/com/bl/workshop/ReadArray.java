package com.bl.workshop;

import java.util.Scanner;

public class ReadArray {
	
	public static int[] readArray() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lenght of Array :- ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of array  : -");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		
	}

}

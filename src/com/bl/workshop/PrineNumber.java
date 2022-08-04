package com.bl.workshop;

import java.util.*;

public class PrineNumber {

	public void isPrimeNumber(int num) {

		boolean f = false;;
		int number = num/2;
		int i = 2;
		
//		for (int i = 2; i <= number; i++) {
//			
//			if (num % i == 0) {
//				f = true;
//			}
//			break;
//		}
		while(i <= number) {
			if (num % i == 0 ) {
				f = true;
				break;
			}
			i++;
		}
		
		if (!f) {
			System.out.println("Number is prime ---> " + num);
		} else {
			System.out.println("Number is not prime ---> " + num);
		}
	}

	public static void main(String[] args) {

		PrineNumber myNum = new PrineNumber();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number to check is prime or not : - ");
		int num = userInput.nextInt();
		userInput.close();
		myNum.isPrimeNumber(num);
	}
}

package com.bl.workshop;
import java.util.Scanner;

public class LargestNumber {
	
	public int largestNumberInThreeInteger(int num1, int num2 ,int num3) {
		
		int max = num1;
		if(num2>max) {
			max = num2;
		}
		if(num3>max) {
			max = num3;
		}
		return max;   
	}
	
public int smallNumberInThreeInteger(int num1, int num2 ,int num3) {
		
		int max = num1;
		if(num2<max) {
			max = num2;
		}
		if(num3<max) {
			max = num3;
		}
		return max;   
	}

	public static void main(String[] args) {
		
		 Scanner sc  = new Scanner(System.in);
			
			System.out.println("Enter First Number : ");
			int number1 = sc.nextInt();
			System.out.println("Enter second Number : ");
			int number2 = sc.nextInt();
			System.out.println("Enter third Number : ");
			int number3 = sc.nextInt();
			sc.close();
			
			LargestNumber myObj = new LargestNumber();
			int largest = myObj.largestNumberInThreeInteger(number1, number2, number3);
			System.out.println("Largest number " + largest);
			
			int smallest =  myObj.smallNumberInThreeInteger(number1, number2, number3);
			System.out.println("Smallest number " + smallest);

	}
}

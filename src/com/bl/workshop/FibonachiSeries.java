package com.bl.workshop;

import java.util.Scanner;

public class FibonachiSeries 
{
	public void fibonachiSerieseGet(int num){
		
		int fterm = 0;
		int sterm = 1;
		System.out.println("Finonaci series till " + num + " terms" );
		
		for (int i = 1 ; i <= num; i++) 
		{	
			System.out.print(fterm + " ");	
			int nterm = fterm+sterm;
			fterm=sterm;
			sterm=nterm;		
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers ---> ");
		int num = sc.nextInt();
		sc.close();
		
		FibonachiSeries myObj = new FibonachiSeries();
		myObj.fibonachiSerieseGet(num);
		
	}
}

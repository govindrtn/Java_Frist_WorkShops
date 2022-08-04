package com.bl.workshop;

import java.util.Scanner;

public class StringMapulupation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string here : ");
		String str = sc.next();
//		System.out.println("Enter char here : ");
//		char ch = sc.next().charAt(0);

		StringMapulupation myStr = new StringMapulupation();
//		myStr.getCharOccurence(str, ch);
		myStr.getCount(str);

	}

	public void getCharOccurence(String str, char ch) {

		int charCount = 0;
		int i = 0;
		while (i < str.length()) {
			if (ch == str.charAt(i)) {
				charCount++;
			}
			i++;
		}
		System.out.println("Occurenace of word " + charCount);
	}

	public void getCount(String str) {

		int vowelsCount = 0;
		int consonantCount = 0;
		String vowels = String.valueOf(vowelsCount);
		String consonant = String.valueOf(vowelsCount);
		System.out.println(vowels);

		for (char i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println("Vowel's ---> " + vowelsCount);
		System.out.println("Consonant's ---> " + consonantCount);
	}
}

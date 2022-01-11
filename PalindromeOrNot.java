package com.dd;

import java.util.Scanner;
public class PalindromeOrNot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1 = sc.next();
		String string2 = "";
		char ch;
		int length = string1.length();
		for(int i = length - 1; i >= 0; i--) {
			ch = string1.charAt(i);
			string2 += ch;
		}
		if(string1.equals(string2)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		System.out.println(string1 + " " + string2);
		sc.close();
	}
}


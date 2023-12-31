package com.app.java;

public class PalindromeArray {
	public static void main(String[] args) {
		int[] numbers = new int[] { 121, 11, 22, 54, 12 };
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			int reverseNumber = 0;
			int temp = 0;
			while (num > 0) {
				temp = num % 10;
				num = num / 10;
				reverseNumber = reverseNumber * 10 + temp;
			}
			if (reverseNumber == numbers[i]) {
				System.out.println(numbers[i] + " : is Palindrome");
			} else {
				System.out.println(numbers[i] + " : is not Palindrome");
			}
		}
	}
}

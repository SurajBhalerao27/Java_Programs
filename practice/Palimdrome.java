package practice;

import java.util.Scanner;

class Palindrome {
	public static void main(String args[]) {
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		in.close();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string OR number is a PALINDROME.");
		else
			System.out.println("Entered string OR number NOT PALINDROME.");
	}
}
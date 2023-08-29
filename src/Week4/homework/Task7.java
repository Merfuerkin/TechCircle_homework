package Week4.homework;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

//		## Task7
//
//		Write a method that asks user to enter a string. if the string is empty, print: string is empty if
//		the string has more than 3 characters, print the last three characters if the string has less than
//		or equal 3 characters, print the string 

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word");

		String input = sc.nextLine();

		int NumberOfCharacters = input.length();

		if (input == null || input.trim().length() == 0) {

			System.out.println("This is an empty string");

		} else if (NumberOfCharacters > 3) {

			int lastIndex = input.length() - 1;

			String LastCharacters = input.substring(lastIndex - 2);

			System.out.println(LastCharacters);

		} else if (1 <= NumberOfCharacters && NumberOfCharacters <= 3) {
			System.out.println(input );

		}

	}
}

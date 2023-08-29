package Week4.homework;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

//## Task8
//write a program that asks the user enter a three letter word. 
//Check if the middle character of the given word is 'a'.
//In the case it is print: "Cool word",
//but in the case the middle letter is not 'a' print: "Okay word".
//- If the user does not enter a 3 letter word tell them:
//If the word is less than 3 letters: "Word is too short"
//If the word is too long: "Word is too long"input

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a three letter word");

		String input = sc.nextLine();

		int NumberOfCharacters = input.length();

		if (NumberOfCharacters == 3) {

			char middleLetter = input.charAt(1);
			if (middleLetter == 'a') {
				boolean middleLetterVerification = true;
				System.out.println(middleLetterVerification);
			}

			if (middleLetter == 'a') {
				System.out.println("Cool Word");
			}

			else if (!(middleLetter == 'a')) {
				System.out.println("Okay Word");
			}

		} else if (NumberOfCharacters < 3) {

			System.out.println("Word is too short");

		} else if (NumberOfCharacters > 3) {
//
			System.out.println("Word is too long");

		}
	}
}

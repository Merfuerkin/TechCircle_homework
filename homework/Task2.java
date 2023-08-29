package Week4.homework;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//
//		`Create a class called Reverse, write a program that will reverse a string. Your program should
//		reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word
//		is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the
//		console.
//
//			intput: pizza
//			output: azzip
//			input:TechCircle
//			output: too long
//			input: car
//			output: too short
		String output = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word!");

		String input = sc.nextLine();

		if (input.length() == 5) {

			for (int i = input.length() - 1; i >= 0; i--) {
				output += input.charAt(i);
				System.out.print(output);
			}
		} else if (input.length() > 5) {
			System.out.println("Too long!");

		} else if (input.length() < 5) {
			System.out.println("Too short!");

		}

	}
}

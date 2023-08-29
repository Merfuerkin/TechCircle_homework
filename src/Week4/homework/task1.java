package Week4.homework;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

//`write a program that asks user to enter a sentence. then print the first & last characters of the sentence
//Example:
//`
//Input: Welcome To TechCircle 
//output: We// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence!");

		String input = sc.nextLine();

		String firstChar = Character.toString(input.charAt(0));
		String LastChar = Character.toString(input.charAt(input.length() - 1));

		String output = firstChar.concat(LastChar);
		System.out.println(output);
	}

}

package Week4.homework;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// ## Task9
//
//		Ask user to enter two words. 
//		Print first word without its first character then print the second word without its first character. 
//		```text
//		Input:
//		apple banana 
//
//		Output:
//		ppleanana
//		```
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two words");

		String input = sc.nextLine();

		int space = input.indexOf(' ');

		String str1 = input.substring(0, space);

		String str2 = input.substring(space + 1);

		String output = (str1.substring(1) + str2.substring(1));

		System.out.println(output);

	}

}

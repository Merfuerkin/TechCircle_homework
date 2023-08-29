package Week4.homework;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
//		## Task11
//
//		Ask user to enter a word. If the word starts with x, print the word without x.
//
//		```text
//		Input:
//		xcode 
//
//		Output:
//		code
		char wordBeginning='x';
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a words");

		String input = sc.nextLine();
		String output=input.substring(1);
if(input.charAt(0)==wordBeginning) {
	System.out.println(output);
}
		
		
	}

}

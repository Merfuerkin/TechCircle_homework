package Week4.homework;

import java.util.Scanner;

public class Task12{

	public static void main(String[] args) {
//		## Task12
//
//		Create a class calledEmailTask1. Assume that email address is constructed by person's first name and
//		followed by an underscore and last name.
//
//		Write a program that can swap first name with last name in the email (Seperated by an underscore).
//		If the email doesn't contain an underscore print the given input email.
//
//		Ex:
//
//		```text
//		input: 
//		mike_tyson@gmail.com
//
//		output: 
//		tyson_mike@gmail.com
//		```
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your email.  ");

		String email = sc.nextLine();

		char At = '@';
		int indexOfAt = email.indexOf(At);
		String domain = email.substring(indexOfAt);

		char underScore = '_';
		int indexOfUnderScore = email.indexOf(underScore);

		if (indexOfUnderScore == -1) {
			System.out.println(email);

		} else if (indexOfUnderScore >= 0) {

			String firstName = email.substring(0, indexOfUnderScore);
			String lastName = email.substring(indexOfUnderScore + 1, indexOfAt);
			String fName = lastName;
			String lName = firstName;

			System.out.println(fName + underScore + lName + domain);

		}

	}

}

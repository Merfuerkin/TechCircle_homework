package Week4.homework;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
//		## Task13
//
//		Create a class called EmailTask2. Assume that email address is constructed by person's first name
//		and followed by an underscore and last name.
//
//		Write a program that will print out information about user based on email. Print first name, last
//		name, and domain.
//
//		First and Last name should be printed with proper format - uppercase first letter and remaining
//		lowercase.
//
//		```text
//		Ex:
//		input:
//		techcircle_school@aws.com
//
//		Output:
//		First name: Techcircle
//		Last name: School
//		Domain: aws
//		```	 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your email. ");

		String email = sc.nextLine();

		char At = '@';
		int indexOfAt = email.indexOf(At);
		String EmailDomain = email.substring(indexOfAt);

	char underScore = '_';
	int indexOfUnderScore = email.indexOf(underScore);
		
	String fName = email.substring(0, indexOfUnderScore);
		String lName = email.substring(indexOfUnderScore + 1, indexOfAt);
	
		String fName1=""+(fName.charAt(0));
		String fName2=fName.substring(1);
		String firstName =fName1.toUpperCase()+fName2;
	
		String lName1=""+(lName.charAt(0));
		String lName2=lName.substring(1);
		String lastName =lName1.toUpperCase()+lName2;
		
		char dot='.';
		int indexOfDot= email.indexOf(dot);
		String Domain=email.substring(indexOfAt+1,indexOfDot);
		
			System.out.println("First name : " +firstName );

			System.out.println("Last name : " +lastName );
			System.out.println("Domain : " +Domain );
	 
		//System.out.println(indexOfDot);
		}

	
	}



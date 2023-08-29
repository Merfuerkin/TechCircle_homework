package Week4.homework;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

//## Task14
//
//Write a program that asks user to enter first and last names, and then prints the full name in
//regular format (first character in upper case)
//
//```text
//input:
//firstName = "tecHCIrcle"
//lastName = "SCHOOL";
//
//output:
//Techcircle School

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first and last name please ");

		String name = sc.nextLine();
		
		char space=' ';
		int spaceIndex=name.indexOf(space);
		
		String fName = name.substring(0, spaceIndex);
		String lName = name.substring(spaceIndex + 1);
	
		String fName1=""+(fName.charAt(0));
		String fName2=fName.substring(1);
		String firstName =fName1.toUpperCase()+fName2;
	
		String lName1=""+(lName.charAt(0));
		String lName2=lName.substring(1);
		String lastName =lName1.toUpperCase()+lName2;
		
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName);
	}

}

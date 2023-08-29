package Week4.homework;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// write a program that can return the initials of the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your full name");

		String fullName = sc.nextLine();

		char firstLetter = fullName.charAt(0);

		int spaceIndex = fullName.indexOf(" ");

		char secondLetter = fullName.charAt(spaceIndex+1);

		String Initials = (firstLetter + "" + secondLetter).toUpperCase();

		System.out.println(Initials);

	}

}

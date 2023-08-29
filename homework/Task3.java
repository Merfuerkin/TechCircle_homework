package Week4.homework;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// 
//		## Task3
//
//		`write a program that asks user to enter two strings, and print out the longest string
//		`

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word!");
		String str1 = sc.nextLine();
		
		System.out.println("Enter another word!");
		String str2=sc.nextLine();
		
		if(str2.length()>str1.length()) {
			System.out.println(str2);
		}
		else {
			System.out.println(str1);
		}
		
		
		
		
		
	}

}

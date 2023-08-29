package Week4.homework;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		//
		//write a program that can check if the first and last characters of the string are same
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word!");
		String input = sc.nextLine();
		System.out.println("First character and last characters ");
		if(input.charAt(0)==input.charAt(input.length()-1)) {
			System.out.println("the same");
		}else {
			System.out.println("Not the same");
		}	
	}

}

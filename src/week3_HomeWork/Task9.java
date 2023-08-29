package week3_HomeWork;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
//		Write a program to find the sum of the digits of a given number using a while loop

		 int digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		while (num > 0) {

			digit = num % 10;

			sum = sum + digit;

			num = num / 10;
		}

		System.out.println("Sum of Digits: " + sum);
	}

}

package week3_HomeWork;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);

		System.out.println("Enter Number 5 diffrent Numbers");

		int Number1 = num.nextInt();

		int Number2 = num.nextInt();

		int Number3 = num.nextInt();

		int Number4 = num.nextInt();

		int Number5 = num.nextInt();

		int max1 = Math.max(Number1, Number2);
		int max2 = Math.max(Number3, Number4);
		int max3 = Math.max(max1, max2);
		int Max = Math.max(max3, Number5);

		System.out.println(" Maximum Number is : " + Max);

	}

}

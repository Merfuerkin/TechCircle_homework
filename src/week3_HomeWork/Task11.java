package week3_HomeWork;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		//## Task11
		//```Write a program to check if a given number is prime or not using a for loop
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number");
        
        boolean isPrime = true;
        
        int input = scan.nextInt();

        for (int i = 2; i < input; i++) {
 
            
            if (input % i == 0) {
                isPrime = false;
            }
               }

        if (isPrime) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("It's not a prime number");
        }

        scan.close();
	 
	}

}

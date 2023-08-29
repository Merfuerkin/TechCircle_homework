package week3_HomeWork;

public class Task7 {

	public static void main(String[] args) {
//		Write a program that can return the factorial number of any given number
//	            Ex:
//	                input: 5
//	                output: 120
//	                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}

		System.out.println(fact);

	}

}

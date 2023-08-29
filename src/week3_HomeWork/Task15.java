package week3_HomeWork;

public class Task15 {

	public static void main(String[] args) {
//		## Task15
//		### Write a program that generates the following pattern using nested for loops:
//		 ```
//		     1
//		    22
//		   333
//		  4444
//		 55555
//		 ```

		for (int i = 1; i < 6; i++) {
			// System.out.println("*****");
			for (int j = 1; j <= i; j++) {
				int a = i;
				System.out.print(a);
			}
			System.out.println();
		}

	}

}

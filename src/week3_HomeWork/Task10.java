package week3_HomeWork;

public class Task10 {

	public static void main(String[] args) {
		// ## Task10
		//```Write a program to print the reverse of a given number using a while loop```

		
		int num=1234;
		int reversed=0;
		
		while (num!=0) {
			
			int digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
		}
		
		System.out.println("Reversed Number: " + reversed);
		
		
		
	}

}

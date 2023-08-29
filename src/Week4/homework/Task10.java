package Week4.homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
//		## Task10
//
//		ask the user to enter a word. if the word ends with "ly", print "really???" , otherwise, print "
//		never mind"
//

//		```
		String refrence = "ly";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a words");

		String input = sc.nextLine();

		String wordEnd = input.substring(input.length() - 2);
		if (wordEnd.equals(refrence)) {
			System.out.println("really???");
		} else {
			System.out.println("Never mind.");
		}
	}

}

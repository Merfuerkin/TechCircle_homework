package Week4.homework;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		## Task15
//
//		Write a program to extract digits from a String:
//
//		```text
//		input: 
//		ab123c4d56efg 
//
//		output:
//		123456
//		```
//
		String input = "ab123c4d56efg";

		String rev = "0123456789";
		String digit = "";
		for (int i = 0; i < input.length(); i++) {

			for (int j = 0; j < rev.length(); j++) {

				if (input.charAt(i) == rev.charAt(j)) {

					digit += input.charAt(i);
				}

			}

		}
		System.out.print(digit);
	}
// another method
//	String output = input.replaceAll("[^0-9]", "");
//	System.out.println(output);
}

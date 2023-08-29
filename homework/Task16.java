package Week4.homework;

public class Task16 {

	public static void main(String[] args) {
//		Task16
//		Write a program to extract distinct character from a string input: abcabcabcabc output:abc

		String str = "abcabcabcabc";

		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (temp.indexOf(str.charAt(i)) == -1) {
				temp+= str.charAt(i);
			}
		}

		System.out.println(temp + " ");

	}

}

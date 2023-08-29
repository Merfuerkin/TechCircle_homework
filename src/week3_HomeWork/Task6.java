package week3_HomeWork;

public class Task6 {

	public static void main(String[] args) {
//		Write a method which prints out the numbers from 1 to 100 but for numbers which are divisible both 
//		3 and 5, print "FINRA" instead of the number,  for numbers which are divisible by 3, print "FIN" instead of the number
//		and for numbers which are divisible by 5, print "RA" instead of the number.
//		        ex:
//		            output:
//		                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println("FINRA");

			} else if (i % 5 == 0) {
				System.out.println("RA");
			} else if (i % 3 == 0) {
				System.out.println("FIN");
			}

			else {
				System.out.println(i);
			}
		}

	}

}

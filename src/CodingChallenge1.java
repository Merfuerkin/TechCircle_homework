import java.util.Scanner;

public class CodingChallenge1 {

	public static void main(String[] args) {
		
//		challenge1
//		`Create a class called TipCalculator, write a program for a tip calculator. 
//		There will be different service quality benchmarks that will determine the tip given. 
//		There will also the ability to calculate based on the number of people in the party and 
//		if there is a split of the bill or not.
//
//			Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
//
//		The program should display the following information based on the user input:
//
//		Split or No split (Yes or No), 
//		Number of people entered: (number) (each person = & in output) 
//		Check amount: (number) Service Quality: (String) Total to pay:
//			Total tip: Total per person: Tip per person:
//
//		Ex:
//			Split or No split (Yes or No)?
//			Yes
//			Enter the number of people
//			4
//			Enter the check amount:
//			476
//			How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
//			Excellent
//
//			output:
//				Number of people entered: 4
//				Total to pay: 595.0
//				Total tip: 119.0
//				Total per person: 148.75
//				Tip per person: 29.75
//
//		HINT: you will need to use .equals() method
		Scanner sc = new Scanner(System.in);

		System.out.println("Split or No split ");

		String choice = sc.nextLine();
		
		System.out.println("Enter the number of people. ");

		int NumberOfPeople = sc.nextInt();
		
		System.out.println("Enter the check amount ");

		int checkAmount = sc.nextInt();

		System.out.println("How was the service quality? ");
		System.out.println("Choose between: Poor , Fair , Good , Great , Excellent ");
		
		String ServiceQuality = sc.nextLine();
		
		if(ServiceQuality.equals("Poor")) {
			double tipRate=0.05;
			
		}else if(ServiceQuality.equals("Fair")) {
			double tipRate=0.10;
			
		}else if(ServiceQuality.equals("Good")) {
			double tipRate=0.15;
			
		}else if(ServiceQuality.equals("Great")) {
			double tipRate=0.20;
			
		}else if(ServiceQuality.equals("Excellent")){
			double tipRate=0.25;
			
		}

	}



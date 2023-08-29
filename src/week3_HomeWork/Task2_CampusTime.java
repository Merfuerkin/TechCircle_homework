package week3_HomeWork;

public class Task2_CampusTime {

	public static void main(String[] args) {
		 

//## Task2
//		``` Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has
//		been initialized, write a program that can find out if the campus is open or not.
//		 Campus is open from 8 am(8) to
//	11 pm (23) If user enters a time within the open time they should see message: “open”  but if the time entered is
//		outside of operating hours they should see: “ closed”

  
		int time=12;
		
	if( 23>=time&&time>=8) {
		System.out.println(" Open");
	}
	if( time<8||time>23) {
			
		System.out.println(" closed");
	}
		
		
		switch (time) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 24:
			
		System.out.println(" Closed");
		break;
		
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:	
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		
	System.out.println(" Open");	
		break;	
			
			
			
			
			
			
		 
		
		}
		
		
		
	
	}

}

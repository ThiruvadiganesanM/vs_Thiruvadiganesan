package closedLabBook;

import java.util.Scanner;

public class NoOfDaysInAMonth {
	static Scanner input=new Scanner(System.in);
public static void main(String[] args) {

	
	
	System.out.println("Enter the month ");
	int n=input.nextInt();
	switch(n) {
	case 1:
		System.out.println("31 days");
		break;
	case 2:
		
		System.out.println("Enter the year");
		long year=input.nextLong();
		if(year%4==0 || year%400==0) {
			System.out.println("Its a leap year, it have 29 days");
		}else {
			System.out.println("Its not a leap year, it have 28 days");
		}
		break;
	case 3:
		System.out.println("31 days");
		break;
	case 4:
		System.out.println("30 days");
		break;
	case 5:
		System.out.println("31 days");
		break;
	case 6:
		System.out.println("30 days");
		break;
	case 7:
		System.out.println("31 days");
		break;
	case 8:
		System.out.println("31 days");
		break;
	case 9:
		System.out.println("30 days");
		break;
	case 10:
		System.out.println("31 days");
		break;
	case 11:
		System.out.println("30 days");
		break;
	case 12:
		System.out.println("31 days");
		break;
	default:
		System.out.println("invalid");
		break;
		
	}
}
}

package openLabBook;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the week day");
	int n=input.nextInt();
	switch(n) {
	case 1:
		System.out.println(" Its a Sunday");
		break;
	case 2:
		System.out.println("Its Monday");
		break;
	case 3:
		System.out.println("Its Tuesday");
		break;
	case 4:
		System.out.println("Its Wednesday");
		break;
	case 5:
		System.out.println("Its Thursday");
		break;
	case 6:
		System.out.println("Its Friday");
		break;
	case 7:
		System.out.println("Its Saturday");
		break;
	default:
		System.out.println("Its invalid");
		break;
	}
}
}

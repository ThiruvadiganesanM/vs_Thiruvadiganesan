package Lab10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void division() {
		try {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=input.nextInt();
			System.out.println("Enter the divisor");
			int divisor=input.nextInt();
		    int div=num/divisor;
		    System.out.println("The division is "+div);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	division();
}
}

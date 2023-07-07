package openLabBook;

import java.util.Scanner;

public class AreaOfSquare {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the side value of a square");
	double side=input.nextDouble();
	double area=side*side;
	System.out.println("The area of the square is "+area);
			
}
}

package openLabBook;

import java.util.Scanner;

public class AreaOfRectangle {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a length of rectangle");
	double length=input.nextDouble();
	System.out.println("Enter a breadth of a rectangle");
	double breadth =input.nextDouble();
	double area=length*breadth;
	System.out.println("The area of the rectangle is "+area);
	
}
}

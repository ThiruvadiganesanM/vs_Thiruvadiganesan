package openLabBook;

import java.util.Scanner;

public class AreaOfTriangle {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the height of the triangle");
	double height=input.nextDouble();
	System.out.println("Enter the width of the triangle");
	double width=input.nextDouble();
	double area=(height*width)*1/2;
	System.out.println("The area of the triangle is "+area);
}
}

package openLabBook;

import java.util.Scanner;

public class AreaOfCircle {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a radius of circle");
	double radius=input.nextDouble();
	double area=(22/7)*radius*radius;
}
}

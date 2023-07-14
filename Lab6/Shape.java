package Lab6;

import java.util.Scanner;

abstract class Shape {
	abstract void calculateArea();
	public static double area;
	Scanner input=new Scanner(System.in);
}
class Rectangle extends Shape{

	
	void calculateArea() {
		System.out.println("Enter the length of the Rectangle");
		int length=input.nextInt();
		System.out.println("Enter the width of the Rectangle");
		int width=input.nextInt();
		area=length*width;
		System.out.println("Area of the Rectangle is "+area);
	}
	
}
class Circle extends Shape{
	void calculateArea() {
		System.out.println("Enter the radius of the circle");
		int radius=input.nextInt();
		area=(Math.PI)*(radius*radius);
		System.out.println("Area of the Circle is "+area);
	}
	
}

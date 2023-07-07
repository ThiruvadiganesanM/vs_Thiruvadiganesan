package openLabBook;

import java.util.Scanner;

public class Multiply2Numbers {
public static void main() {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first number");
	int num1=input.nextInt();
	System.out.println("Enter the first number");
	int num2=input.nextInt();
	int mul=num1*num2;
	System.out.println("Multiple of two numbers is: "+mul);
}
}

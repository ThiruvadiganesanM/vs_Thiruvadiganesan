package coreJavaAssignment;

import java.util.Scanner;

public class BasicArithmeticOperations {
	public static long addition(long a,long b) {
		long sum=a+b;
		return sum;
	}
	public static long substraction(long a,long b) {
		long sub=a-b;
		return sub;
	}
	public static long multiplication(long a,long b) {
		long mul=a*b;
		return mul;
	}
	public static long division(long a, long b) {
		long div=a/b;
		return div;
	}
	public static long power(long base,long exp) {
		long pow=1;
		for(int i=1;i<=exp;i++) {
			pow*=base;
		}
		return pow;
	}
	
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the first number");
	long a=input.nextLong();
	System.out.println("Enter the second number");
	long b=input.nextLong();
	
	
	
	System.out.println(addition(a,b));
	System.out.println(substraction(a,b));
	System.out.println(multiplication(a,b));
	System.out.println(division(a,b));
	System.out.println(power(a,b));
}
}

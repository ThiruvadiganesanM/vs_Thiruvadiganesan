package openLabBook;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=input.nextInt();
	if(num%2==0) {
		System.out.println("The given number is even");
	}
	else {
		System.out.println("The given number is odd");
	}
}
}

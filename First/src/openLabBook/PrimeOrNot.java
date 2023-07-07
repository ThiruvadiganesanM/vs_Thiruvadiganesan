package openLabBook;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=input.nextInt();
	boolean isPrime=true;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			isPrime=false;
		}
	}
	if(isPrime) {
		System.out.println("Its a prime number");
	}else {
		System.out.println("Its not a prime number");
	}
}
}

package openLabBook;

import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the maximum value");
	int max=input.nextInt();
	boolean isPrime=true;
	
	for(int i=1;i<max;i++) {
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(i+" ");
		}
	}
	
	
	
	
	
	
	
	
	
//	for(int i=1;i<=max;i++) {
//		for(int j=2;j<i;j++) {
//			if(i%j==0) {
//				isPrime=false;
//				break;
//			}
//		}
//		if(isPrime) {
//		System.out.println(i+" ");
//		}
//	}
}
}

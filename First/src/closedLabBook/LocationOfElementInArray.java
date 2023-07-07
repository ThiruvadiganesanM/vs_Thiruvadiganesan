package closedLabBook;

import java.util.Scanner;

public class LocationOfElementInArray {
public static void main(String[] args) {
	int[] ar= {45,12,67,23,78,94,39,47};
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the element");
	int n=input.nextInt();
	for(int i=0;i<ar.length;i++) {
		if(n==ar[i]) {
			System.out.println("The location of "+n+" is "+ ++i);
		}
	}
}
}

package openLabBook;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputtingArrayValues {
public static void main(String[] args) {
	int [] ar=new int[5];
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the values of array");
	for(int i=0;i<ar.length;i++) {
		ar[i]=input.nextInt();
	}
System.out.println(Arrays.toString(ar));	
}
}

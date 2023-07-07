package openLabBook;

import java.util.Scanner;

public class WhileLoopDemo {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=input.nextInt();
	int sum=0;
	while(num!=0) {
		sum+=num;
		num--;
	}
	System.out.println("The sum of natural numbers is "+sum);
}
}

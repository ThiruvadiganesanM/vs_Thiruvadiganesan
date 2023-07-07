package closedLabBook;

import java.util.Scanner;

public class ArmstrongPerfectPallindrome {
	public static boolean armstrong(long n) {
		boolean isArmstrong=false;
		long count=0,mul=1, sum=0,num=n;
		while(num!=0) {
			count++;
			num/=10;
		}
		num=n;
		
		while(num!=0) {
		for(int i=1;i<=count;i++) {
			mul*=num%10;
		}
		sum+=mul;
		mul=1;
		num/=10;	
	}
		if(sum==n) {
			isArmstrong= true;
		}
		return isArmstrong;
	
	}
	
	
	public static boolean pallindrome(long n) {
		boolean isPallindrome=false;
		long rev=0,num=n;
		while(num!=0) {
			rev=(rev*10)+(num%10);
			num/=10;
		}
		if(rev==n) {
			isPallindrome=true;
		}
		return isPallindrome;
	}
	public static boolean perfect(long n) {
		boolean isPerfect=false;
		long num=n,sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			isPerfect=true;
		}
		return isPerfect;
	}
	
	
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter  the number");
	long num=input.nextLong();
	if(armstrong(num)) {
		System.out.println("Its a armstrong number");
	}else if(pallindrome(num)) {
		System.out.println("Its a pallindrome number");
	}
	else if(perfect(num)) {
		System.out.println("Its a perfect number");
	}
	else {
		System.out.println("Its none of these number");
	}
}
}

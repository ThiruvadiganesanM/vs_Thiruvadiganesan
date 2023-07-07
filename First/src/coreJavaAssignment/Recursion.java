package coreJavaAssignment;

public class Recursion {
	public static long factorial(long n) {
		long fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void fibonacci(int num) {
		int n1=0,n2=1;
		int n;
		System.out.print(n1+", "+n2+", ");
		for(int i=1;i<=num-2;i++) {
			n=n1+n2;
			System.out.print(n+", ");
			n1=n2;
			n2=n;
		}
	}
	public static int sumOfDigit(long n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static boolean pallindrome(String s) {
		boolean isPallindrome=false;
		String str=s,rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(s.equals(rev)) {
			isPallindrome=true;
		}
		return isPallindrome;
	}
	
public static void main(String[] args) {
System.out.println(factorial(5));	
fibonacci(5);
System.out.println();
System.out.println(sumOfDigit(12345));
System.out.println(pallindrome("malayala"));

}
}

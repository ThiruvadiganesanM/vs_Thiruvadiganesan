package closedLabBook;

import java.util.*;

public class PrimeNumberList1To100 {
public static void main(String[] args) {
	boolean isPrime=true;
	int num=1;
	for(int i=2;i<=100;i++) {
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.print(i+", ");
		}
		isPrime=true;
		
	}
}
}

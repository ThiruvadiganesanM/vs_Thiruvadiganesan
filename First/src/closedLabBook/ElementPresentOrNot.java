package closedLabBook;

import java.util.Scanner;


public class ElementPresentOrNot {
public static void main(String[] args) {
	int[] ar= {45,92,843,80,34,29,74,18,93,80,92,80};
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the element");
	int n=input.nextInt();
	int count=0;
	System.out.print("The positions of the elements are ");
	for(int i=0;i<ar.length;i++) {
		if(n==ar[i]) {
			
			for(int j=0;j<ar.length;j++) {
				if(n==ar[j]) {
					System.out.print( ++j + " ");
					count++;
				}
			}
			System.out.println();
			System.out.println("Total count of the element is "+count);
			break;
			
		}
	}
}
}

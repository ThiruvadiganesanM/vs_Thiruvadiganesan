package openLabBook;

public class SumOfElementsInArray {
public static void main(String[] args) {
	int [] ar= {10,5,34,4,91};
	int sum=0;
	for(int i=0;i<ar.length;i++) {
		sum+=ar[i];
	}
System.out.println("The sum of elements in array is "+sum);
}
}

package coreJavaAssignment;
import java.util.*;
public class Arrays {
public static void main(String[] args) {
	int[] ar= {23,90,56,467,26};
	modifyArray(ar);
}
public static void arrayInitilization() {
	int [] ar= {12,45,89,54,31};
}
public static void arrayTraverse() {
	int [] ar= {12,45,89,54,31};
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]+", ");
	}
}
public static void arraySum(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println("The sum of the array elements is "+sum);
}
public static void arrayAverage(int[] arr) {
	int avg=0,sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	avg=sum/arr.length;
}
public static void arrayMaxMin(int[] arr) {
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Minimum value is "+arr[0]);
	System.out.println("Maximum value is "+arr[arr.length-1]);
}

public static void sortArray(int[] arr) {
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+", ");
	}
}
public static void searchArray(int[] arr, int a) {
	boolean isPresent=false;
	for(int i=0;i<arr.length;i++) {
		if(a==arr[i]) {
			isPresent=true;
			System.out.println("The index of the element is "+i);
			break;
		}
		}
	if(isPresent=false) {
		System.out.println("The element is not present in the array");
	}
}

public static void modifyArray(int[] arr) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the index");
	int index=input.nextInt();
	System.out.println("Enter new value");
	int v=input.nextInt();
	
	arr[index]= v;
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+", ");
	}
}
}

package closedLabBook;

import java.util.Arrays;

public class AscendingArray {
public static void main(String[] args) {
	int[] ar= {10,45,21,73,0,234};
	int temp;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(ar));
}
}

package closedLabBook;

import java.util.Arrays;

public class TwoDimensionalRectangularArray {
public static void main(String[] args) {
	int ar[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<ar[i].length;j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
}
}

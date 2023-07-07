package closedLabBook;

public class Average {
	public static int average(int n) {
		int avg,sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		avg=sum/n;
		return avg;
	}
public static void main(String[] args) {
	System.out.println(average(5));
}
}

package Lab8;

public class WrapperClass {
	public static void main(String[] args) {
		byte a=10;
		short b=11;
		int c=12;
		long d=13;
		float e=14;
		double f=15f;
		char g='g';
		boolean h=true;
		
		Byte a1=new Byte(a);
		Short b1=new Short(b);
		Integer c1=new Integer(c);
		Long d1=new Long(d);
		Float e1=new Float(e);
		Double f1=new Double(f);
		Character g1=new Character(g);
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		System.out.println(f1);
		System.out.println(g1);
		
	}
}

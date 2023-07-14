package Lab9;

public class StringHandling {
	 static String str=new String("Hello world this is the java code ");
	static String str1=new String("World");
	static String str2=new String("World");
public static void main(String[] args) {
	
	System.out.println("The length of the string is: "+str.length());
	
	System.out.println(str+str1);
	
	System.out.println(str1.substring(1,5));
	
	System.out.println(str.contains("ell"));
	
	System.out.println(str1.toUpperCase());
	
	System.out.println(str.replace('e','a'));
	
	System.out.println(str1.equals(str2));
	
	System.out.println( str1.compareTo(str2));
	 
	System.out.println(str.substring(5, 15)); 
}
}

package Assignments;

import java.lang.reflect.Field;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class DiseaseAssignment {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Disease corona=new Corona();
	System.out.println("Enter the property");
	System.out.println("property names are..:name,infectious,c,s");
	String property=input.next();
	getProperty(corona,property);
	
}
public static Object getProperty(Disease obj,String prop) throws Exception{
	try {
	Class className=null;
	if(obj!=null) {
		className=obj.getClass();
	}else {
		throw new NoSuchFieldException("the property is not present...");
	}
	if(className==Object.class) {
		System.out.println("The property is not present");
	}
	return callGetterRecursive();
	}
	catch(Exception e) {
		System.out.println("property not available");
		e.printStackTrace();
		return null;
	}
	
	private static Object callGetterRecursive(Disease obj,String prop,Class className) {
		if(className==null || className==Object.class) {
			throw new NoSuchFileException("Field not available");
		}
		try {
		Class c=obj.getClass();
		Field f=c.getDeclaredField(prop);
		if(f!=null) {
			return f.get(obj);
		}
		}catch(Exception e) {
			
		}
	
	
			
}
}
class Disease1{
	String work="assitant";
}
class Disease extends Disease1{
	public String name="infectious";
	public boolean infectious=true;
	String c="a";
	boolean s=false;
}
class Corona extends Disease{
	//String name="karthi";
	public String getName() {
		return this.name;
	}
	public boolean isInfectious() {
		return infectious;
	}
	String getC() {
		return this.c;
	}
	boolean isS() {
		return this.s;
	}

	}

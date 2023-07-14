package Lab1_2_3_4;

public class Person {
	private String name;
	private int age;
	private String address;
	public static int count=0;
	public String getName() {
		return name;
	}
	public Person(String name, int age, String address) {
		count++;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Person() {
		count++;
	}
	@Override
	public String toString() {
		
		return "[Name: "+name+" Age: "+age+" Address: "+address+"]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

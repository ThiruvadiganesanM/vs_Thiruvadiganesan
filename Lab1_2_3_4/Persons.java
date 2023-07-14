package Lab1_2_3_4;

public class Persons {
public static void main(String[] args) {
	Person p=new Person();
	
	p.setAddress("No 6, Dubai Kurukkusandhu, Dubai");
	p.setAge(25);
	p.setName("Naren");
	
	System.out.println("Name:"+p.getName()+" Age:"+p.getAge()+" Address: "+p.getAddress());

	
	//Lab2
	Person p1=new Person("Prashanth",23,"23 Adayar");
	Person p2=new Person("Priya",20," No.78 AshokPillar");
	Person p3=new Person("Ganesh",23,"22/32, Tirunelveli");
	
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	
	//Lab4
	System.out.println("count of the person is"+Person.count);
	

}
}

package coreJavaAssignment;

import java.util.*;

public class EmployeeManage {
	static ArrayList<Employee> emp = new ArrayList<>();
	static Scanner s = new Scanner(System.in);
	static EmployeeDetails ed = new EmployeeDetails();

	public static void main(String[] args) {

		emp.add(new Employee(1, "Ganesh", 23, "JuniorSoftwareDeveloper", 12500.0));
		emp.add(new Employee(2, "Naren", 25, "SeniorSoftwareEngineer", 18000));
		emp.add(new Employee(3, "Sreelash", 25, "JuniorSoftwareDeveloper", 19500.0));
		emp.add(new Employee(4, "Kamal", 23, "SoftwareEngineer", 17000));
		emp.add(new Employee(5, "Suraj", 22, "JuniorSoftwareDeveloper", 25200.0));
		emp.add(new Employee(6, "Prasanth", 25, "SeniorSoftwareEngineer", 100000));

		addEmployee(7, "hariharan", 21, "softwareDeveloper", 16000.0);
//displayEmployee();
//searchEmployee(6);
		
		System.out.println("1.Display employee \n2.Search emmployee \n3.Delete employee details");
		int input=s.nextInt();
		switch(input)
		{
		case 1:
		{
			ed.displayEmployee(emp);
		}
		break;
		
		case 2:
		{
			System.out.println("Enter the employee id");
			int id11 = s.nextInt();
			ed.searchEmployee(emp, id11);
		}
		break;
		
		case 3:
		{
			System.out.println("Enter the id of the employee");
			int iid=s.nextInt();
			List<Employee> result=ed.deleteEmployee1(emp, iid);
			for (Employee employee : result) {
				
				System.out.println(employee);
			}
		}
		}
	
	
	
	}

	public static void addEmployee(int id, String name, int age, String designation, double sal) {
		emp.add(new Employee(id, name, age, designation, sal));
	}

}

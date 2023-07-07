package coreJavaAssignment;

import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {
	static Scanner s = new Scanner(System.in);

	public void displayEmployee(List<Employee> emp) {
		for (Employee em : emp) {
			System.out.println(em);
		}
	}

	public void searchEmployee(List<Employee> emp, int id11) {

		for (Employee employee : emp) {

			if (employee.getId() == id11) {
				System.out.println("The employee name is : " + employee.getName());
				System.out.println("The employee id is : " + employee.getId());
				System.out.println("The employee salary is : " + employee.getSalary());
				System.out.println("The employee age is : " + employee.getAge());
				System.out.println("The employee designation is : " + employee.getDesignation());
			}
//			else {
//			System.out.println("there is no employee in this id");
//		}
		}
	}

	public List<Employee> deleteEmployee1(List<Employee> emp, int iid) {

		
		for (Employee employee : emp) {

			if (employee.getId() == iid) {
				emp.remove(iid - 1);
				return emp;
			}
		}

		return null;
	}

	public void updateEmployee(List<Employee> emp, int iid) {

		for (Employee employee : emp) {

			if (employee.getId() == iid) {

				System.out.println("1.Change Name \n2.Change Age \n3.Change salary" + " \n4.Change Designation ");

				System.out.println("old age is");
				employee.getAge();
				System.out.println("Enter the new age");
				employee.setAge(s.nextInt());
				employee.getAge();
			}
		}

	}

}

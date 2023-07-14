package Lab1_2_3_4;

public class Employee extends Person{
	private int employeeid;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", salary=" + salary + "]";
	}
	public Employee(int employeeid, double salary) {
		
		this.employeeid = employeeid;
		this.salary = salary;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public double getSalary() {
		return salary;
	}
	
}

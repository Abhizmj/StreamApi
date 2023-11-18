package StreamObjectInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static List<Employee> employeeList(){
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "tom", "IT", 26, "male", 25000));
		employee.add(new Employee(2, "john", "Hr", 37, "male", 35000));
		employee.add(new Employee(3, "david", "IT", 22, "male", 18000));
		employee.add(new Employee(4, "smith", "IT", 29, "male", 25980));
		employee.add(new Employee(5, "marry", "HR", 24, "female", 45000));
		employee.add(new Employee(6, "sarine", "IT", 28, "female", 42000));
		employee.add(new Employee(7, "root", "IT", 36, "male", 26100));
		employee.add(new Employee(8, "iris", "Finance", 37, "male", 27000));
		employee.add(new Employee(9, "robert", "Admin", 44, "male", 22000));
		employee.add(new Employee(10, "latham", "Hr", 34, "male", 30000));
		employee.add(new Employee(11, "lisa", "Admin", 43, "female", 29000));
		employee.add(new Employee(12, "harry", "Hr", 41, "male", 24000));
		
		return employee;
	}
}

package StreamObjectInterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

//Q1. Print the name of the employee whose salary is greater than 30000
public class SalaryGreaterThan {

	public static void main(String[] args) {
		 List<Employee> empList = EmployeeList.employeeList();
		 
		 empList.stream().filter(e->e.getSalary()>=30000)
		 					.map(e-> e.getName())
		 					.collect(Collectors.toList()).forEach(e-> System.out.println(e));

	}

}

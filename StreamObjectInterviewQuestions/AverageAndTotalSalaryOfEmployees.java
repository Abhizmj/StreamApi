package StreamObjectInterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

//Print the average salary and total salary 
public class AverageAndTotalSalaryOfEmployees {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeList.employeeList();
		
		Double avgSal = empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		Double totalSal = empList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Average Salary : "+avgSal);
		System.out.println("Total Salary : "+totalSal);
		
//		Average salary of employee in hr department
		Double avgHrSal = empList.stream()
						.filter(e->e.getDepartment()
								.equalsIgnoreCase("Hr")).collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Average salary in Hr department : "+avgHrSal);
	}

}

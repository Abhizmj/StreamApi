package StreamObjectInterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Calculate the average salary of male and female employee 
public class AverageSalaryMaleAndFemale {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeList.employeeList();
		
		Map<String, Double> avgSal = empList.stream()
								.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(avgSal);
	}

}

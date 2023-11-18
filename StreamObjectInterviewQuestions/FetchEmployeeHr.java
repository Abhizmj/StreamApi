package StreamObjectInterviewQuestions;

import java.util.List;
//Print the name of all employee from HR department
public class FetchEmployeeHr {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeList.employeeList();
		empList.stream().filter(e-> e.getDepartment().equalsIgnoreCase("Hr")).map(Employee::getName).forEach(System.out::println);

	}

}

package StreamObjectInterviewQuestions;

import java.util.Comparator;
import java.util.List;
//Find the older employee's name ,age and salary
public class FetchOlderEmployee {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeList.employeeList();
		 String olderName = empList.stream().max(Comparator.comparingInt(Employee::getAge)).map(e->e.getName()).get();
		  Integer olderAge = empList.stream().max(Comparator.comparingInt(Employee::getAge)).map(e->e.getAge()).get();
		 Double sal = empList.stream().max(Comparator.comparingInt(Employee::getAge)).map(e->e.getSalary()).get();
		System.out.println("Older employee name is: "+olderName+" ,age = "+olderAge+" ,Salary = "+sal);
	}

}

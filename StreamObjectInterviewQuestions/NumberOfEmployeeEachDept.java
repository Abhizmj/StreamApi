package StreamObjectInterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Count the no.of employees in each department
public class NumberOfEmployeeEachDept {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeList.employeeList();
		
		Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(collect);
		System.out.println("======================================");
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
						.entrySet().stream().forEach(e-> System.out.println("department "+e.getKey()+" ="+e.getValue()));
	}

}

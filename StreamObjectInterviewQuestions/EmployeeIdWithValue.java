package StreamObjectInterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Create a map with the list where empid is key and rest will be value
public class EmployeeIdWithValue {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeList.employeeList();
		
		Map<Integer, Employee> collect = empList.stream().collect(Collectors.toMap(Employee::getId, e->e));
		System.out.println("========================================================================================================");
		 empList.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.toList()))
		 		.entrySet()
		 		.stream()
		 		.forEach(e->System.out.println("Employee id: "+e.getKey()+"--> Employee Detalis : "+e.getValue() ));
//		System.out.println(collect);
		 System.out.println("======================================================================================================");
		empList.stream()
				.collect(Collectors.toMap(Employee::getId, e->e))
				.entrySet()
				.stream()
				.forEach(e->System.out.println("Employee id: "+e.getKey()+"--> Employee Detalis : "+e.getValue() ));
		
	}

}

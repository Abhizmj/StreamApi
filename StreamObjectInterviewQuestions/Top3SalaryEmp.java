package StreamObjectInterviewQuestions;

import java.util.Comparator;
import java.util.List;
//Find top 3 salaries of employee and thier name names
public class Top3SalaryEmp {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeList.employeeList();
		
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.limit(3)
				.forEach(e-> System.out.println(e.getName()+" = Rs. "+e.getSalary()));
	}

}

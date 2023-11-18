package StreamObjectInterviewQuestions;

import java.util.Comparator;
import java.util.List;

// Print the name of the employee who is getting maximum and minimum salary
public class MaxAndMinSalary {

	public static void main(String[] args) {
		 List<Employee> empList = EmployeeList.employeeList();
		 
//		Q3.Print the name of the employee who is getting maximum salary
		 
		String emp = empList.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).map(e-> e.getName()).findFirst().get();
		System.out.println("Employee Whose have maximum salary : "+emp);
		
//		Q4.Print the name of the employee who is getting minimum salary			
		
		String emp2 = empList.stream().sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).map(e-> e.getName()).findFirst().get();
		System.out.println("Employee Whose have minimum salary : "+emp2);
		
		System.out.println();
		System.out.println("=============================================================");
//		or 
		String nameMaxSal =	empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).map(e->e.getName()).get();
		System.out.println("Employee Whose have maximum salary : "+nameMaxSal);
		
		String nameMinSal = empList.stream().min(Comparator.comparingDouble(Employee::getSalary)).map(e->e.getName()).get();
		System.out.println("Employee Whose have minimum salary : "+nameMinSal);

	}

}

package StreamObjectInterviewQuestions;

import java.util.List;
//Q2.Print the number employee who is male and female

public class NumberOfMaleFemale {

	public static void main(String[] args) {
		 List<Employee> empList = EmployeeList.employeeList();

		 long maleCount = empList.stream().filter(e-> e.getGender()=="male").count();
			System.out.println("1.Number of male present: "+maleCount);
			long maleCount2 = empList.stream().filter(e-> e.getGender().equals("male")).count();
			System.out.println("2.Number of male present: "+maleCount2);
			long maleCount3 = empList.stream().filter(e-> e.getGender().equalsIgnoreCase("Male")).count();
			System.out.println("3.Number of male present: "+maleCount3);
			
			System.out.println();
			long femaleCount = empList.stream().filter(e-> e.getGender()=="female").count();
			System.out.println("Number of female present: "+femaleCount);
	}

}

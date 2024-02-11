package StreamApiInterviewQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

	static List<Employee> employeeList = new ArrayList<Employee>();
	public static void main(String[] args) {

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Product Development", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		//  1 : How many male and female employees are there in the organization?
			Map<String, Long> count = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			System.out.println(count);
			System.out.println("2.========================================================");
			
		//  2 : Print the name of all departments in the organization?
			employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
			System.out.println("3.========================================================");
		//  3 : What is the average age of male and female employees?
			Map<String, Double> avgAge = employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
			System.out.println(avgAge);
			System.out.println("4.========================================================");
			
		//  4 : Get the details of highest paid employee in the organization?
				 Employee emp = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
				 System.out.println(emp);
				 String nameHighestSal = employeeList.stream()
						 .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get().getName();
				 System.out.println("Name of the employee who have highest Salary : "+nameHighestSal);
				 System.out.println("5.========================================================");
				 
		//  5 : Get the names of all employees who have joined after 2015?
				 employeeList.stream().filter(e-> e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
				 System.out.println("6.========================================================");
				 
		//  6 : Count the number of employees in each department?
				employeeList.stream()
						.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
						.entrySet().stream().forEach(e-> System.out.println("Department "+e.getKey()+" have---> "+e.getValue()+" employee"));
				System.out.println("7.========================================================");
				 
		//  7 : What is the average salary of each department?
				employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
					.entrySet().stream()
					.forEach(e-> System.out.println("Department "+e.getKey()+" have Average Salary : "+e.getValue()));
				System.out.println("8.========================================================");
				 
		//  8 : Get the details of youngest male employee in the product development department?
				 Employee youngEmp = employeeList.stream()
				 	.filter(e->e.getGender().equalsIgnoreCase("Male") && e.getDepartment().equals("Product Development"))
				 	.min(Comparator.comparingInt(Employee::getAge)).get();
				 System.out.println(youngEmp);
				 System.out.println("=============================OR========================");
				 	
//				 	when we have two or morw young employees in our list
				 	
			 employeeList.stream()
				 	.filter(e->e.getGender().equalsIgnoreCase("Male") && e.getDepartment().equals("Product Development"))
				 	.collect(Collectors.groupingBy(Employee::getAge,Collectors.mapping(Employee::getName, Collectors.toList())))
				 	.entrySet().stream().limit(1).forEach(e->System.out.println(e));
//				  
				 System.out.println(youngEmp);
				 System.out.println(youngEmp.getName());
				 System.out.println("9.========================================================");
				 
		//  9 : Who has the most working experience in the organization?
				 
				 Employee expEmp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();	
				  	System.out.println(expEmp.getName());
				  	System.out.println("10.========================================================");
				 
		//  10 : How many male and female employees are there in the sales and marketing team?
				 
				 Map<String, Long> salesCount = employeeList.stream().filter(e-> e.getDepartment().equals("Sales And Marketing"))
				 					.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
				 System.out.println(salesCount);
				 System.out.println("11.========================================================");
				 
		//  11 : What is the average salary of male and female employees?
				 
				 Map<String, Double> avgSalMaleFemale = employeeList.stream()
				 	.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
				 System.out.println(avgSalMaleFemale);
				 System.out.println("12.========================================================");
				 
		//  12 : List down the names of all employees in each department?
				 
				 employeeList.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())))
				 		.entrySet().stream()
				 		.forEach(e-> System.out.println("Employee in : "+e.getKey()+" Department : "+e.getValue()));
				 System.out.println("13.========================================================");

		//  13 : What is the average salary and total salary of the whole organization?
				 
				 DoubleSummaryStatistics sal = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
				 System.out.println("Average salary : "+sal.getAverage());
				 System.out.println("Total salary : "+sal.getSum());
				 System.out.println("14.========================================================");
		//  14 :  Employees who are older than 25 years.
				  employeeList.stream()
				 	.filter(e->e.getAge()>25)
				 	.collect(Collectors.groupingBy(Employee::getAge,Collectors.mapping(Employee::getName, Collectors.toList())))
				 	.entrySet().stream().forEach(e-> System.out.println(e.getValue()));
				  System.out.println("15.=========================================================================================");
//				
		//  15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
//				  same as Question number 9
				  System.out.println("16.========================================================");
		//  16 : Compare Salary based on each department,Find the highest paid salary of employee and its name from an department?
				   employeeList.stream()
				  	.collect(Collectors.groupingBy(Employee::getDepartment,
				  			Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))))
				  			.entrySet().stream()
				  	.forEach(e-> System.out.println("In "+e.getKey()+" Department employee having Highest salary :"+e.getValue().get().getName()));
				  System.out.println("================================OR====================================================");
				   employeeList.stream()
				   .collect(Collectors.groupingBy(Employee::getDepartment,
						   Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
				   .entrySet().stream()
				   .forEach(e-> System.out.println("In "+e.getKey()+" Department employee having Highest salary :"+e.getValue().get().getName()));
			  
	
	}

}

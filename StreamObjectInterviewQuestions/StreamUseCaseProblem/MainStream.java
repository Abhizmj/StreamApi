package StreamUseCaseProblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStream {

	
	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(new Employee(101,200,"Abhishek"),
				new Employee(102,201,"Rahul"),
				new Employee(103,203,"Somiya"),
				new Employee(104,204,"Tushar"),
				new Employee(106,200,"Ritesh"));
		  Map<Integer, String> collect = empList.stream().filter(e->e.getMgrId()==200)
					.collect(Collectors.toMap(Employee::getEmpId,Employee::getName));
					
		 
//					.entrySet().stream().forEach(e->System.out.println("Employee who is manager :"+e));
		System.out.println("Employee who is manager :"+collect);
				
	}

}

package StreamObjectInterviewQuestions;

public class Employee {

	private int id;
	private String name;
	private String department;
	private int age;
	private String gender;
	private double salary;
	public Employee(int id, String name, String department, int age, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + ", gender="
				+ gender + ", salary=" + salary + "]";
	}
	
	
}

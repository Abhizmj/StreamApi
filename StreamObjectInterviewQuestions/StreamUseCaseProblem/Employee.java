package StreamUseCaseProblem;

public class Employee {

	private int empId;
	private int mgrId;
	private String name;
	
	Employee(int empId, int mgrId, String name) {
		super();
		this.empId = empId;
		this.mgrId = mgrId;
		this.name = name;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", mgrId=" + mgrId + ", name=" + name + "]";
	}
	
}

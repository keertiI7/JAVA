package PROGRAMS;
class person{
	String firstname;
	String lastname;
	public person(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}

	public void getFirstname() {
		System.out.println("Firstname : "+ firstname);
	}
	public void getLastname() {
		System.out.println("Lastname : "+ lastname);
	}
}
class Employee extends person{
	int employee_id;
	String jobtitle;
	public Employee(String firstname,String lastname,int employee_id,String jobtitle) {
		super(firstname,lastname);
		this.employee_id=employee_id;
		this.jobtitle=jobtitle;
	}
	public void getEmployeeId() {
		System.out.println("EmployeeId : "+ employee_id);
	}
	public void getLastname() {
		super.getLastname();
		System.out.println("JobTitle: "+ jobtitle);
	}
}
public class persons {	
	public static void main(String[]args) {
		Employee e=new Employee("Golla","keerti",14,"CEO");
		e.getFirstname();
		e.getEmployeeId();
		e.getLastname();
	}
}

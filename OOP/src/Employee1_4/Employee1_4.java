package Employee1_4;

public class Employee1_4 {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee1_4(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return lastName + firstName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int getRaiseSalary(int precent) {
		return (salary * precent)/100;
	}

	@Override
	public String toString() {
		return "Employee1_4 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

}

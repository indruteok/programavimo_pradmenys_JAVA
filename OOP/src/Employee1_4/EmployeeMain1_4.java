package Employee1_4;

public class EmployeeMain1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1_4 e1 = new Employee1_4(10, "Adomas", "Adomaitis", 930);

		System.out.println("id " + e1.getId());
		System.out.println("First Name " + e1.getFirstName());
		System.out.println("Last Name " + e1.getLastName());
		System.out.println("Salary " + e1.getSalary() +" eu");
		System.out.println("Annual Salary " + e1.getAnnualSalary() +" eu");
		System.out.println("Rzise Salary 10%  is  " + e1.getRaiseSalary(10) +" eu");
		System.out.println(e1.toString());
		
		

	}

}

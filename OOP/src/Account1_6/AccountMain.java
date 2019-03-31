package Account1_6;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		z1, z2
//		
//		z1, transfer(20, z2)

		Account z1 = new Account("Petras1", "Petras");
		Account z2 = new Account("Antanas2", "Antanas");

		System.out.println("id " + z1.getId());
		System.out.println("Name " + z1.getName());
		System.out.println("Balance " + z1.getBalance());
		System.out.println("Credit " + z1.credit(500));
		System.out.println("Balance " + z1.getBalance());
		System.out.println("Debit " + z1.debit(100));
		System.out.println("transferTo " + z1.transferTo(z2, 70));

		System.out.println(z1);
		System.out.println(z2);

	}

}

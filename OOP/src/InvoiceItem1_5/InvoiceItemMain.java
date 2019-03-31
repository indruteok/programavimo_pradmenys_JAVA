package InvoiceItem1_5;

import Employee1_4.Employee1_4;

public class InvoiceItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InvoiceItem i1= new InvoiceItem("piestukas", "juodos spalvos", 15, 2.5);

		
		System.out.println("id " + i1.getId());
		System.out.println("Desc " + i1.getDesc());
		System.out.println("Qty " + i1.getQty());
		System.out.println("Unit Price " + i1.getUnitPrice() +" eu");
		System.out.println("Total " + i1.getTotal() +" eu");
		System.out.println(i1.toString());
		
	}

}

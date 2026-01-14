package chapter07;

public class CompanyMain {

	public static void main(String[] args) {
		Company com1 = new Company();
		Company com2 = new Company();
		
		System.out.println(com1);
		System.out.println(com2);
		
		System.out.println("-----------------------");
		
		Company mycom1 = Company.getInstance();
		Company mycom2 = Company.getInstance();
		
		System.out.println(mycom1);
		System.out.println(mycom2);
		System.out.println(mycom1 == mycom2);

	}

}

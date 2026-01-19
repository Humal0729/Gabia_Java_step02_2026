package chapter16;

public class ExceptionMain02 {

	public static void main(String[] args) {
		int var =50;
		int data = 0;
		
		try {
			System.out.println(var/data);
		} 
		catch (NumberFormatException | ArithmeticException nae) {
			System.out.println("0아닌걸로");
			System.out.println(nae.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");

	}

}

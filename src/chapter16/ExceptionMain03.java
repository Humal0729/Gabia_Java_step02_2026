package chapter16;

public class ExceptionMain03 {

	public static void main(String[] args) {
		String arr[] = {"soldesk", "developer", "course"};
		
		for(int i=0; i<arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("무조건 실행");
			}
		}
		
		System.out.println("End");

	}

}

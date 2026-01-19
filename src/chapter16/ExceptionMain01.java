package chapter16;

public class ExceptionMain01 {

	public static void main(String[] args) {
		String arr[] = {"soldesk", "developer", "course"};
		for(int i=0; i<arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}

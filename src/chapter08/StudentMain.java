package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student(null, null, 0);
		
		st.name = "박혁환";
		st.ssn = "01029651852";
		st.stNo = 1001;
		
		System.out.println(st.name);
		System.out.println(st.ssn);
		System.out.println(st.stNo);

	}

}

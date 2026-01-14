package chapter08;

public class Student extends People{
	public int stNo;
	
	public Student(String name, String ssn, int stNo) {
		super(name, ssn);
		this.stNo = stNo;
	}

}

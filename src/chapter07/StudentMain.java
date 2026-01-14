package chapter07;

public class StudentMain {

	public static void main(String[] args) {
		// studentLee에 이수정으로 설정후 serialNum과 StudentName 출력
		Student03 studentLee = new Student03();
		studentLee.setStudentName("이수정");
		
		System.out.println("이름: " + studentLee.getStudentName() + " | 학번: " + studentLee.getSerialNum());
		
		Student03 studentKim = new Student03();
		studentKim.setStudentName("김범성");
		
		System.out.println("이름: " + studentKim.getStudentName() + " | 학번: " + studentKim.getSerialNum());
		
		Student03 studentPark = new Student03();
		studentPark.setStudentName("박정우");
		
		System.out.println("이름: " + studentPark.getStudentName() + " | 학번: " + studentPark
				.getSerialNum());

	}

}

package chapter08;

public class CompanyMain{

	public static void main(String[] args) {
		Employee em = new Employee("박혁환", 4000);
		em.work();
		System.out.println("------------------");
		
		Manager ma = new Manager("머스크", 9000, "인사과");
		ma.work();
		ma.approveLeave("마케팅부");
		System.out.println("------------------");
		
		Employee em2 = new Manager("이재용", 9000, "재무부");
		em2.work();
		em2.getInfo();
		

	}

}

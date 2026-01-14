package chapter08;

public class Manager extends Employee{
	String department;
	
	public Manager(String name, int salary, String deparment) {
		super(name, salary);
		this.department = deparment;
	}

	@Override
	public void work() {
		System.out.println(name + " 팀장이 " + department + " 부서 관리 중");
	}
	
	public void approveLeave(String employeeName) {
		System.out.println(name + " 팀장이 " + employeeName + " 부서 휴가 승인 완료");
	}

}

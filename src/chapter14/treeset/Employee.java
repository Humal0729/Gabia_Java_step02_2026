package chapter14.treeset;

//record : 멤버변수 선언, 생성사 오버로딩
public record Employee(String name, int age) {

	@Override
	public String toString() {
		return name + ": " + age;
	}
	

}

package chapter18.lambda;

public class StringConCatImpleMain04 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		System.out.println("---인스턴스 변수 => 객체--");
		StringConCatImple concat1 = new StringConCatImple();
		concat1.makeString(s1, s2);
		
		System.out.println();
		
		StringConcat str = (a,b) -> System.out.println(a+", " +b);;
		str.makeString(s1, s2);
		
	}

}

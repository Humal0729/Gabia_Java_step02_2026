package chapter12.hashcode;

public class KeyMain {

	public static void main(String[] args) {
		Key hash = new Key(0);
		Key hash2 = new Key(0);
		Key hash3 = new Key("김자바");
		Key hash4 = new Key("김자바");
		
		System.out.println(hash);
		System.out.println(hash2);
		
		if(hash.equals(hash2)) System.out.println("True");
		else System.out.println("False");

	}

}

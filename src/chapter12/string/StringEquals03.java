package chapter12.string;

public class StringEquals03 {

	public static void main(String[] args) {
		String strVar1 = new String("홍길동");
		String strVar2 = "홍길동";
		
		if(strVar1==strVar2) System.out.println("같은 String 객체 참조");
		else System.out.println("다른 String 객체");
		
		
		if(strVar1.equals(strVar2)) System.out.println("같은 String 객체 참조");
		else System.out.println("다른 String 객체");
		
		
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		if(str1==str2) System.out.println("같은 String 객체 참조");
		else System.out.println("다른 String 객체");
		
		
		if(str1.equals(str2)) System.out.println("같은 String 객체 참조");
		else System.out.println("다른 String 객체");
		
		
		
		String str3 = "test";
		String str4 = "test";
		
		if(str3==str4) System.out.println("같은 String 객체 참조");
		else System.out.println("다른 String 객체");
		
		
		if(str3.equals(str4)) System.out.println("같은 String 객체 참조");
		else System.out.println("다른 String 객체");
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		

	}

}

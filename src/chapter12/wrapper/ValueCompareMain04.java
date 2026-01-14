package chapter12.wrapper;

public class ValueCompareMain04 {

	public static void main(String[] args) {
		// 오토박싱의 범위
		System.out.println("[-128 ~ 127초과할 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("==결과: " + (obj1.intValue() == obj2.intValue()));
		
		
		System.out.println("[-128 ~ 127 범위 내 경우]");
		Integer obj3 = 100;
		Integer obj4 = 100;
		
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("==결과: " + (obj3.equals(obj4)));

	}

}

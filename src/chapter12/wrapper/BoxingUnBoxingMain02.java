package chapter12.wrapper;

public class BoxingUnBoxingMain02 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf(300);
		
		Integer total1 = obj1+obj2;
		Integer total2 = obj2+obj3;
		
		System.out.println(total1);
		System.out.println(total2);
		
		Integer obj=100;
		System.out.println(obj);
		
		int v1=obj1.intValue();
		int v2=obj2.intValue();
		int v3=obj3.intValue();
		
		Integer vtotal1 = v1+v2;
		Integer vtotal2 = v2+v3;
		
		System.out.println(vtotal1);
		System.out.println(vtotal2);

	}

}

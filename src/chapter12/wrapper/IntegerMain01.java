package chapter12.wrapper;

public class IntegerMain01 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		
		Integer num = 100;
		
		int iNum=num.intValue();
		int jNum=200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
		Integer x=jNum;
		Integer y=Integer.valueOf(jNum);
		System.out.println(x);
		System.out.println(y);

	}

}

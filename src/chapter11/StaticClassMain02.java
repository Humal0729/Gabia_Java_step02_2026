package chapter11;

class Out2{
	static int a=1;
	int b;
	
	public static class In{
		String Infun() {
			return a + "번째 static 내부 클래스";
		}
	}
}

public class StaticClassMain02 {

	public static void main(String[] args) {
		Out2.In o = new Out2.In();
		String str = o.Infun();
		System.out.println(str);
	}

}

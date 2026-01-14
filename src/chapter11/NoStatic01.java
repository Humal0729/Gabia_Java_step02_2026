package chapter11;

class Out{
	static int a=1;
	
	public class In{
		public String Infun() {
			return a + "번째 Non Static 내부";
		}
	}
}

public class NoStatic01 {

	public static void main(String[] args) {
		Out o = new Out();
		Out.In i = o.new In();
		String str = i.Infun();
		System.out.println(str);

	}

}

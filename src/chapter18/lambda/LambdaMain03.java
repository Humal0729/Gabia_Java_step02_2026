package chapter18.lambda;

interface MyFunctionInterFace{
	void showMsg(String msg);
}

public class LambdaMain03 {

	public static void main(String[] args) {
		
		MyFunctionInterFace f = s -> System.out.println(s);
		f.showMsg("Lambda");
		showMyMsg(f);

	}
	
	public static void showMyMsg(MyFunctionInterFace f) {
		f.showMsg("매개 변수로 사용하는 람다");
		
	}

}

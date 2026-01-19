package chapter18.lambda;

public class AddMain01 {

	public static void main(String[] args) {
		// Lambda: 메서드 이름이 없음, = 매개변수를 통한 수행문만 존재함
		Add addF = (x,y) -> x+y;
		System.out.println(addF.add(3, 5));

	}

}

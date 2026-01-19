package chapter18.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class LambdaMain05 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f1 = (x,y) -> x+y;
		System.out.println("15 + 24 = " + f1.apply(15, 24));

		BiFunction<String, String, String> f2 = (s1,s2) -> s1.concat(s2);
		System.out.println(f2.apply("람다","식"));

		BiConsumer<Integer, Integer> f3 = (x, y) -> System.out.println(x>y ? x:y);
		f3.accept(10,9);
		
		// 매개변수(인자)로 받은 문자열과 숫자가 동일한 크기 인지 판별
		BiPredicate<String, Integer> f4 = (x, y) -> x.length() == y;
		System.out.println("apple은 5글자인가? " + f4.test("apple", 5));

	}

}

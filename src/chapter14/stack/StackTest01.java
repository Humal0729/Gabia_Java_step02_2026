package chapter14.stack;

import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
		Object obj = new Object();
		
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) {
			for(int i=0; i<3; i++) {
				st.push(new String("hi"+i));
				System.out.println(i+"번째 " + st.peek());
			}
		}
		System.out.println("출력: "+st.pop());
		System.out.println("제일위: "+st.peek());
		System.out.println("출력: "+st.pop());
		System.out.println("제일위: "+st.peek());
		st.push(new String("Every DAy"));
		System.out.println("제일위: "+st.peek());

	}

}

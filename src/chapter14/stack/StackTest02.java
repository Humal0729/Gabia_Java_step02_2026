package chapter14.stack;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrStack = new ArrayList<String>();
	
	public void push(String data) {
		arrStack.add(data);
	}
	
	public String pop() {
		int len = arrStack.size();
		
		if(len == 0) {
			System.out.println("빈 스택");
			return null;
		}
		return (arrStack.remove(len-1));
	}

	@Override
	public String toString() {
		return arrStack.toString();
	}
	
	
}

public class StackTest02 {
	
	public static void main(String[] args) {
		MyStack st = new MyStack();
		
		st.push("A");
		st.push("B");
		st.push("C");
		
		System.out.println(st.pop());
		
	}

}

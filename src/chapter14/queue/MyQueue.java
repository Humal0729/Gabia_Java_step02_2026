package chapter14.queue;

import java.util.ArrayList;

public class MyQueue {
	String q;
	
	private ArrayList<String> queue = new ArrayList<String>();
	
	public void enQueue(String q) {
		queue.add(q);
	}
	
	public String deQueue() {
		return queue.remove(0);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return queue.toString();
	}
	

}

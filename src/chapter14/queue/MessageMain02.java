package chapter14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain02 {

	public static void main(String[] args) {
		Queue<Message> messageQ = new LinkedList<Message>();
		
		Message lee = new Message("sendmail", "이씨");
		messageQ.offer(lee);
		messageQ.offer(new Message("sendSNS", "김씨"));
		messageQ.offer(new Message("sendkako", "박씨"));
		
		while (!messageQ.isEmpty()) {
			Message msg = messageQ.poll();
			switch (msg.command){
			case "sendmail": System.out.println(msg.to + "에게 전송"); break;
			case "sendSNS": System.out.println(msg.to + "에게 전송"); break;
			case "sendkako": System.out.println(msg.to + "에게 전송"); break;
			default:return;
			}
		}

	}

}

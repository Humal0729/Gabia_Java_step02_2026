package chapter08;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		// 11 Java폰 블랙
		DmbCellPhone dcp = new DmbCellPhone(11, "Java", "black");
		System.out.println("모델: " + dcp.model);
		System.out.println("색상: " + dcp.color);
		
		System.out.println("채널: " + dcp.channel);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("hello");
		dcp.receiveVoice("bye");
		dcp.hangUp();
		

	}

}

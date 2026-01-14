package chapter14.hashset;

public class SoldeskMemeberMain03 {

	public static void main(String[] args) {
		SoldeskMemeberManager manager = new SoldeskMemeberManager();
		SoldeskMemeber m1 = new SoldeskMemeber(1000, "박혁환");
		SoldeskMemeber m2 = new SoldeskMemeber(1001, "김혁환");
		SoldeskMemeber m3 = new SoldeskMemeber(1002, "이혁환");
		SoldeskMemeber m4 = new SoldeskMemeber(1003, "최혁환");
		
		manager.add(m1);
		manager.add(m2);
		manager.add(m3);
		manager.add(m4);
		manager.showAllMemeber();
		manager.add(new SoldeskMemeber(1002, "자바"));
		manager.showAllMemeber();

	}

}

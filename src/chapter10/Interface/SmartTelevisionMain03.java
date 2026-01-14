package chapter10.Interface;

public class SmartTelevisionMain03 {
	
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.search("www.naver.com");
		tv.turnOff();
		
		System.out.println();
		
		Remote rt = tv;
		rt.turnOn();
		rt.setVolume(-9);
		rt.turnOff();
		
		System.out.println();
		
		Searchable sc = tv;
		sc.search("www.google.com");
	}

}

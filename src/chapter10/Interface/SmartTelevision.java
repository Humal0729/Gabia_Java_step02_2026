package chapter10.Interface;

public class SmartTelevision implements Remote, Searchable{
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색");
	}

	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV OFF");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) this.volume = Remote.MAX_VOLUME;
		if(volume < Remote.MIN_VOLUME) this.volume = Remote.MIN_VOLUME;
		else this.volume = volume;
		System.out.println("TV 볼륨: " + this.volume);
	}
	

}

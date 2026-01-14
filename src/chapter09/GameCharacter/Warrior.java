package chapter09.GameCharacter;

public class Warrior extends GameCharacter{

	@Override
	protected void atack() {
		System.out.println("전사의 공격");
		
	}

	@Override
	protected void useUItimate() {
		System.out.println("후려치기 스킬");
		
	}
	

}

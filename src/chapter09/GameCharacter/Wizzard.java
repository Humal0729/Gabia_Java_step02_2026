package chapter09.GameCharacter;

public class Wizzard extends GameCharacter{
	
	@Override
	protected void atack() {
		System.out.println("마법사의 공격");
		
	}

	@Override
	protected void useUItimate() {
		System.out.println("파이어볼 스킬");
		
	}

}

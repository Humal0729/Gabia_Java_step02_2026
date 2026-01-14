package chapter09.GameCharacter;

public class GameMain06 {

	public static void main(String[] args) {
		
		System.out.println("전사 전투");
		fight(new Warrior());
		
		System.out.println("법사 전투");
		fight(new Wizzard());

	}
	
	public static void fight(GameCharacter gc) {
		gc.fight();
	}

}

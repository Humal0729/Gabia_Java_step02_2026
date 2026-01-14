package chapter08.Example2;

import java.util.Scanner;

public class CharacterMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Character rpg[] = {new Warrior(), new Mage()};
		
		System.out.print("공격력을 입력하십시오: ");
		int power = s.nextInt();
		
		for(Character c: rpg) {
			String cName = c.getClass().getSimpleName();
			int attack = c.attack(power);
			System.out.println(cName + "의 공격력: " + attack);
		}

	}

}

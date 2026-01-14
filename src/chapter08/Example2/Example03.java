package chapter08.Example2;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("공격력을 입력하십시오: ");
		int power = s.nextInt();
		
		System.out.println("전사의 스킬: " + useSkill(new Warrior(), power));
		System.out.println("마법사의 스킬: " + useSkill(new Mage(), power));

	}
	public static int useSkill(Character ch, int power) {
		return ch.attack(power);
	}

}

package chapter08;

public class Paprika extends Vegetable{
	private String color;
	private int price;
	private String name;

	public void set2(String a, int b, String c) {
		color = a;
		price = b;
		name = c;
	}
	
	public void Disp1() {
		System.out.println("-----파프리카-----");
		System.out.println("분류: " + sort);
		System.out.println("계절: " + season);
		System.out.println("이름: " + super.name);
		System.out.println();
	}
	public void Disp2() {
		System.out.println("-----파프리카-----");
		System.out.println("색깔: " + color);
		System.out.println("가격: " + price);
		System.out.println("이름: " + name);
		System.out.println();
	}

}

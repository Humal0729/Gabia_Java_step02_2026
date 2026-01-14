package chapter09.Animal;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println("멍멍");
		
	}

}

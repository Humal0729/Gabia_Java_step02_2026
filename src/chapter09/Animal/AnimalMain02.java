package chapter09.Animal;

public class AnimalMain02 {

	public static void main(String[] args) {
		
		AnimalSound(new Dog());
		AnimalSound(new Cat());

	}
	public static void AnimalSound(Animal ani) {
		ani.sound();
	}

}

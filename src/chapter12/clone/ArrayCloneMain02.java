package chapter12.clone;

public class ArrayCloneMain02 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle c = new Circle(10, 20, 30);
		Circle cc = (Circle)c.clone();
		
		System.out.println(c);
		System.out.println(cc);

	}

}

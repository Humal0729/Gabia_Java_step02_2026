package chapter13;

public class GenericContainerMain04 {

	public static void main(String[] args) {
		//문자열 아이템 저장 객체
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		stringContainer.printItems();
		
		GenericContainer<Integer> intContainer = new GenericContainer<Integer>(5);
		intContainer.addItem(1);
		intContainer.addItem(3);
		intContainer.addItem(5);
		intContainer.printItems();
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);
		doubleContainer.addItem(1.1);
		doubleContainer.addItem(3.1);
		doubleContainer.addItem(5.1);
		doubleContainer.printItems();
			
		System.out.println(doubleContainer.sum(doubleArray));

	}

}

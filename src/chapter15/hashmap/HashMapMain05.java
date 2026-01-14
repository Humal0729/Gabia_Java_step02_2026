package chapter15.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class HashMapMain05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Integer> Inventory = Collections.synchronizedMap(new HashMap<>());
		
		Inventory.put("apple", 50);
		Inventory.put("banana", 30);
		Inventory.put("grape", 20);
		Inventory.put("orange", 10);
		
		for(Map.Entry<String, Integer> entry: Inventory.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue()+"개");
		}
		
		
		System.out.print("\n재고를 확인할 상품명을 입력하세요: ");
		String product = s.nextLine();
		
		if(Inventory.containsKey(product)) System.out.println(product + "의 재고: " + Inventory.get(product));
		else System.out.println("해당 상품 없음");
		
		
		System.out.print("\n재고를 업데이트할 상품명을 입력하세요: ");
		String updateProduct = s.nextLine();
		
		if(Inventory.containsKey(updateProduct)) {
			System.out.print("\n추가할 수량을 입력하세요: ");
			int addValue = Integer.parseInt(s.nextLine());
			Inventory.put(updateProduct, Inventory.get(updateProduct) + addValue);
			System.out.println(updateProduct + "의 재고: " + Inventory.get(updateProduct));
		}
		else {
			System.out.print("\n상품의 수량을 입력하세요: ");
			int addValue = Integer.parseInt(s.nextLine());
			Inventory.put(updateProduct, addValue);
			System.out.println(updateProduct + "의 재고: " + Inventory.get(updateProduct));
		}

	}

}

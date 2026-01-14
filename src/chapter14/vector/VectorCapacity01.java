package chapter14.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorCapacity01 {

	public static void main(String[] args) {
		//동기화 - 멀티스레드에서 사용, ArrayList 기본으로 synchronizedList 추가하여 사용
		//List<String> sysList = Collections.synchronizedList(new ArrayList<>());
		
		Vector<String> vector = new Vector<String>();
		
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());
		
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");
		
		System.out.println();
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());
		
		for(int i=0; i<8; i++) {
			vector.add("Fruit" + (i+1));
		}
		
		// 용량 초과 시 기존 크기 2배 증가
		System.out.println("------------데이터 11개 증가 후 크기------------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());
		

	}

}

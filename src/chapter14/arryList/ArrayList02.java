package chapter14.arryList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayList02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size: " + list.size());
		
		list.add(100);
		list.add(50);
		System.out.println("list.size: " + list.size());
		
		for(int i=0; i<list.size(); i++) System.out.print(list.get(i) + " ");
		
		System.out.println();
		System.out.println("-------Iterator-------");
		
		Iterator<Integer> it = list.iterator(); // 일반데이터를 반복구조로 형변환 > hasNext() 사용
		while(it.hasNext()) {
			int v = it.next();
			System.out.println(v);
		}

	}

}

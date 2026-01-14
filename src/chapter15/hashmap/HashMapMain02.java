package chapter15.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		while(true) {
			System.out.print("아이디: ");
			String ID = s.next();
			
			if(map.containsKey(ID)) {
				System.out.print("비밀번호: ");
				String PW = s.next();
				if(map.get(ID).equals(PW)) {
					System.out.println("로그인 성공");
					return;
				}
				else System.out.println("비밀번호 불일치");
			}
			else System.out.println("입력하신 아이디는 없습니다");
			
		}
		
	}

}

package chapter14.arryList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 생성(exit입력 시 종료): ");
			String id = s.nextLine();
			
			if(id.equals("exit")) {
				System.out.println("프로그램 종료");
				return;
			}
			else {
				UserInfo user = new UserInfo();
				System.out.print("패스워드 입력: ");
				int pwd = Integer.parseInt(s.nextLine());
				
				user.setId(id);
				user.setPwd(pwd);
				arr.add(user);
			}
			
			Iterator<UserInfo> it = arr.iterator();
			while(it.hasNext()) {
				UserInfo info = it.next();
				System.out.println("ID: " + info.getId() + ", pwd: " + info.getPwd());
			}
			
		}

	}

}

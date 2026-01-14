package chapter14.arryList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager{
	
	public void personMgr() {
		Scanner s= new Scanner(System.in);
		int select;
		Person p;
		
		ArrayList<Person> personarr = new ArrayList<Person>();
		
		while(true) {
			System.out.print("(1)회원가입, (2)정보삭제,(3)정보검색,(4)종료:");
			select = Integer.parseInt(s.nextLine());
			
			switch (select) {
			case 1: {
				p = new Person();
				System.out.println("회원 가입 선택");
				
				System.out.print("이름을 입력하십시오 ");
				p.setName(s.nextLine());
				
				System.out.print("나이 입력하십시오 ");
				p.setAge(Integer.parseInt(s.nextLine()));
				
				System.out.print("전화번호를 입력하십시오 ");
				p.setTel(s.nextLine());
				
				personarr.add(p);
				System.out.println("회원 가입 완료");
				break;
			}
			case 2: {
				Iterator<Person> it = personarr.iterator();
				Boolean check=false;
				System.out.println("회원 삭제 선택");
				System.out.print("삭제할 사람의 이름을 입력하십시오: ");
				String del = s.nextLine();
				
				while(it.hasNext()) {
					Person info = it.next();
					if(info.getName().equals(del)) {
						it.remove(); 
						check=true;
						System.out.println("회원 삭제 완료");
					}
				}
				
				if(!check) System.out.println("해당하는 정보가 없습니다");
				break;
			}
			case 3: {
				System.out.println("회원 정보 검색");
				Iterator<Person> it = personarr.iterator();
				while(it.hasNext()) {
					Person info = it.next();
					System.out.print(info.getName() + " ");
					System.out.print(info.getAge() + " ");
					System.out.println(info.getTel());
				}
				System.out.println("회원 정보 검색 완료");
				break;
			}
			case 4: {
				System.out.println("프로그램 종료");
				return;
			}
			default: System.out.println("잘못된 입력");;
			}
			
		}
		
	}
	

}

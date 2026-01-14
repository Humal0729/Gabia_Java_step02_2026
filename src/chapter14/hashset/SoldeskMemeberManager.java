package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class SoldeskMemeberManager {
	private Set<SoldeskMemeber> members;
	
	public SoldeskMemeberManager() {
		members = new HashSet<SoldeskMemeber>();
	}

	public void add(SoldeskMemeber member) {
		if(members.add(member)) {
			System.out.println(member.getMemberId() + "님 회원가입 완료");
		}
		else System.out.println(member.getMemberId() + "님은 이미 가입한 회원");
	}
	
	public void showAllMemeber() {
		for(SoldeskMemeber m: members) {
			System.out.println(m);
		}
	}

}

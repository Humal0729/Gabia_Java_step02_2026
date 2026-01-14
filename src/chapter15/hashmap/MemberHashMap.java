package chapter15.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class MemberHashMap {
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	
	public void addMember(Member member) {
		hashMap.put(member.memberId(), member.memberName());
	}
	
	public void removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
	}

	public void showAllMember() {
		System.out.println("=======================");
		for(Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}



	
}

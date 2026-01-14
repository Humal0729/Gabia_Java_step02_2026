package chapter14.arryList;

import java.util.ArrayList;
import java.util.List;

public class List01 {
	
	public static void main(String[] args) {
		List<String> std = new ArrayList<String>();
		
		std.add("Alice");
		std.add("Bob");
		std.add("Charlie");
		std.add("Diana");
		
		for(String stds: std) System.out.print(stds + " ");
		System.out.println();
		
		std.remove("Bob");
		for(String stds: std) System.out.print(stds + " ");
		
	}

}

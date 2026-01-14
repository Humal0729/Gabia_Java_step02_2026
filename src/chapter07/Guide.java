package chapter07;

import java.util.Scanner;

public class Guide {
	static String point;
	Guest[] guest;
	Scanner s;
	
	public Guide() {
		// TODO Auto-generated constructor stub
	}
	
	public Guide(int n) {
		point = "발리";
		guest = new Guest[n];
		
		for(int i=0; i<n; i++) {
			guest[i] = new Guest();
		}
	}
	
	public static String getPoint() {
		return point;
	}

	public static void setPoint(String point) {
		Guide.point = point;
	}
	
	
	

}

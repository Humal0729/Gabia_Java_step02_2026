package chapter08;

public class InheritanceMain {

	public static void main(String[] args) {
		StrawBerry st = new StrawBerry();
		
		st.Set1("Berry", "여름");
		st.Set2("딸기", "중");
		st.Set3("빨강", 12000);
		
		st.Disp1();
		System.out.println();
		st.Disp2();
		System.out.println();
		st.Disp3();
		System.out.println();

	}

}

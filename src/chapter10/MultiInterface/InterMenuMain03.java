package chapter10.MultiInterface;

public class InterMenuMain03 implements Inter_Menu3{

	public static void main(String[] args) {
		InterMenuMain03 im = new InterMenuMain03();
		
		Inter_Menu1 im1 = im;
		Inter_Menu2 im2 = im;
		Inter_Menu3 im3 = im;
		System.out.println("INTERMENU1");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();
		
		System.out.println("INTERMENU2");
		System.out.println(im2.tangsuyuk());
		
		System.out.println("INTERMENU3");
		System.out.println(im3.boggembab());

	}

	@Override
	public String jajang() {
		return "짜장";
	}

	@Override
	public String jjambbong() {
		return "짬뽕";
	}

	@Override
	public String tangsuyuk() {
		return "찹쌀";
	}

	@Override
	public String boggembab() {
		return "볶음";
	}

}

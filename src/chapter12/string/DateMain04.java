package chapter12.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain04 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		String str = now.toString();
		System.out.println(str);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String str2 = sdf.format(now);
		System.out.println(str2);

	}

}

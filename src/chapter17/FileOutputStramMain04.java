package chapter17;

import java.io.FileOutputStream;

public class FileOutputStramMain04 {

	public static void main(String[] args) {
		// 파일 경로 설정
		String filePath = "outputstream.txt";
		String data = "Hello, this is a test of FileOutputStream.";
		
		try (FileOutputStream fos = new FileOutputStream(filePath)){
			fos.write(data.getBytes());
			System.out.println("저장 성공");
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 쓰는 도중 오류 발생: " + e.getMessage());
		}
		
	}

}

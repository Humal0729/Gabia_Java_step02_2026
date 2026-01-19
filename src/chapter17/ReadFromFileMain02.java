package chapter17;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFileMain02 {
	
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("output.text"))){
			String line;
			System.out.println("내용.");
			while ((line=reader.readLine()) != null) {
				System.out.println(line);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 오류 발생" + e.getMessage());
		}
	}

}

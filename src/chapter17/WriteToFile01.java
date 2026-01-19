package chapter17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile01 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		System.out.print("파일에 저장할 내용: ");
		String cont = s.nextLine();
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.text"))){
			writer.write(cont);
			System.out.println("저장 성공");
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 쓰는 도중 오류 발생" + e.getMessage());
		}
		finally {
			s.close();
		}
		

	}

}

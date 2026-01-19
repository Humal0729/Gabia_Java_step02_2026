package chapter17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStream09 {

	public static void main(String[] args) {
		String filePath = "datastream_output.dat";
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))){
			dos.writeUTF("Hello, DataOutputStream!");
			dos.writeInt(123);
			dos.writeDouble(45.67);
			System.out.println("저장성공");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//---------------------------------------------------
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))){
			String message = dis.readUTF();
			int num = dis.readInt();
			double dou = dis.readDouble();
			System.out.println("내용.");
			System.out.println("msg : " + message);
			System.out.println("num : " + num);
			System.out.println("dou : " + dou);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

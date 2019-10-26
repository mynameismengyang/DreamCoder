package study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("D:/aa.txt");
			System.out.println("Step1");
			char c1 = (char)reader.read();
			System.out.println(c1);
		} catch (FileNotFoundException e) {//子类异常在父类异常的前面
			// TODO Auto-generated catch block
			System.out.println("Step2");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Step3");
			e.printStackTrace();
		}finally {
			System.out.println("Step4");
			try {
				if(reader!=null) {
					reader.close();
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


import java.util.*;


public class TextScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//io流对象
		System.out.println("请输入名字：");
		String name = scanner.nextLine();
		
		System.out.println("请输入你的爱好：");
		String favor = scanner.nextLine();
		
		System.out.println("请输入你的年龄：");
	    int age = scanner.nextInt();
	    
	    System.out.println("############");
	    System.out.println(name);
	    System.out.println(favor);
	    System.out.println(age);
	    
	    
		
		
	}
	
}


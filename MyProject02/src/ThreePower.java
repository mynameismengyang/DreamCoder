import java.util.Scanner;

public class ThreePower {
	public static void main() {
		System.out.println("请输入数字:\n");
		Scanner input = new Scanner(System.in);
		Integer num = input.nextInt();
		boolean c = is3Power(num);
		System.out.println(num + "是3的幂次方是：" +c);
	}
	
	static boolean is3Power(int a) {
		if(a <3) 
			return false;
		if(a == 3) {
			return true;
		}else if(a %3 == 0) {
			return is3Power(a/3);
			
		}else
			return false;
	}
}

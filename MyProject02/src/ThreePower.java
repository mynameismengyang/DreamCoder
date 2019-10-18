import java.util.*;

public class ThreePower {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer num = input.nextInt();
		int c = is3Power(num);
		System.out.println(c);
	}
	
	static int is3Power(int a) {
		
		if(a %3 == 0) {
			
			return is3Power(a/3);
			
		}else
			return 1;
	}
}

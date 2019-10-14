/**
 * while(布尔表达式){
 * 	循环体；
 * }；
 * @author my
 *
 */
public class TestWhile {
	public static void main() {
		//计算1+2+3+.....+100的累加的和，5050
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}

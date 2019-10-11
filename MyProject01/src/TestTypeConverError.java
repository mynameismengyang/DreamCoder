/**
 * 溢出问题
 * @author my
 *
 */
public class TestTypeConverError {
	public static void main(String[] args ) {
		int money = 1000000000;//10亿
		int year = 20;
		//返回的total是负数超过int的范围
		int total = money *year;
		System.out.println(total);
	}
}

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
		int total = money * year;
		System.out.println(total);
		//返回的total仍然是负数。默认是int，因此结果会转成int值，再转成log。但是已经发生了数据丢失。
		long total1 = money * year;
		System.out.println(total1);
		//返回total2正确：先将一个因子变成long,整个表达式发生提升，全部用long来计算。
		long total2 = money*((long)year);
		System.out.println(total2);
		
		long total3 = 34L*233*year*223423;
		System.out.println(total3);
		//命名问题
		int l=2;//分不清是L还是1，
		long a = 2345L;//建议使用大写L
		System.out.println(l+1);
	}
}

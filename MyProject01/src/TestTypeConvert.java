/**
 * 测试类型转换
 * @author my
 *
 */
public class TestTypeConvert {

	public static void main(String[] args) {
		double x = 3.14;
		float y = 3.22F;
		int ny = (int)y;
		int nx = (int)x;
		System.out.println(ny);//cast强制转换，精度损失，将小数部分舍去
		
		
		System.out.println(nx);//cast强制转换为整型
		char c = 'a';
		int d = c + 1;
		System.out.println(d);
		System.out.println((char)d);

	}

}

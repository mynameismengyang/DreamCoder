/**
 * 方法的重载，实际是完全不同的方法，只是名称相同而已
 * 构成方法重载的条件：
 * 1.不同的含义：形参类型、形参个数、形参顺序不同
 * 2.只有返回值不同不构成方法的重载
 * @author my
 *
 */
public class TestReloadMethod {
	public static void main(String[] args) {
		//调用static修饰的add方法
		System.out.println(add(3,5));
		
		
		//调用没有static修饰的add方法
		TestReloadMethod trm = new TestReloadMethod();
		int c = trm.add(6, 7, 8);
		System.out.println(c);
		
	}
	
	//两个参数  static修饰在main方法中可以直接调用
	public static int add(int n1, int n2) {//修饰符，返回值类型，方法名，参数列表
		int sum = n1 + n2;
		return sum;//return作用1：终止程序。2：确定返回值类型
		
	}
	
	//三个参数
	 public int add(int n1, int n2, int n3) {
		 int sum = n1 + n2 + n3;
		 return sum;
	 }
}

/**
 * 测试方法的基本使用
 * 方法的声明语法：
 * [修饰符1，修饰符2...] 返回值类型 方法名(形式参数列表){
 * 方法体；
 * }
 * @author my
 *
 */
public class TestMethod {
	//主方法(所有的方法都在主方法中调用)
	public static void main(String[] args) {
		TestMethod tm = new TestMethod();
		tm.prinSxt();
		tm.add1(1,2,3);//方法中有形参，调用的时候加入实参
		int c = tm.add2(5, 6, 7) + 1000;
		System.out.println(c);//因为有返回值类型，所以可以做加减、赋值操作
	}
	
	//该方法只是执行简单的打印操作，没有返回值，所以返回值类型为void,没有形式参数
	void prinSxt() {
		System.out.println("北京尚学堂");
		System.out.println("上海尚学堂");
		System.out.println("广州尚学堂");
	}
	
	//该方法无返回类型，但是有参数
	void add1(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}
	
	//该方法有返回，有参数
	int add2(int a,int b,int c) { //返回值的类型，顾名思义
		int sum = a + b + c;
		System.out.println(sum);
		return sum;//return 的作用1：终止程序运行。2：指定返回类型。
	}
	
	
}

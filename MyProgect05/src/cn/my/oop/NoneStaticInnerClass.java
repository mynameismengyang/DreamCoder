package cn.my.oop;
/**
 * 测试内部非静态类,非静态内部类必须放在外部类的内部
 * @author my
 *
 */
public class NoneStaticInnerClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.helloWorld();
	}
}


//定义一个外面的类：Outer 只能是内部类访问外部类
class Outer{
	private int age = 30;
	class Inner{//普通的内部类对象
		int age = 18;
		public void helloWorld() {
			int age = 10;
			System.out.println("调用外部类Outer中的成员变量age:"+ Outer.this.age);
			System.out.println("调用内部类Inner中的成员变量age:"+ Outer.Inner.this.age/*this.age*/);
			System.out.println("调用内部类Inner中的局部变量age:"+ age);
		}
	}
}



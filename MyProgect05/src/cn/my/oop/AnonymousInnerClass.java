package cn.my.oop;
/**
 * 匿名内部类
 * 语法：
 * new 父类构造器（实参类表\实现接口(){
 *	    匿名内部类类体；
 * }
 * @author my
 *
 */
public class AnonymousInnerClass {
	public static void test01(a b) {
		b.aa();
	}

	public static void main(String[] args) {
		AnonymousInnerClass.test01(new a() {

			@Override
			public void aa() {
				System.out.println("AnonymousInnerClass.main().aa()");
				
			}
			
		});
	}
}

interface a{
	void aa();
}
package cn.my.oo;
/**
 * 私有可以修饰属性、方法和类
 * @author my
 *
 */

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
		//h.age = 12;//报错，因为private修饰后不可在类外访问
		h.name = "无限";
	}
}

class Human{
	private int age;//私有方法：只能被自己类中访问
	String name;//没有访问控制权限，就默认为protected
	
	void sayAge() {
		System.out.println(age);//自己类中的方法可以访问该类中的私有属性
	}
}

class Boy extends Human{
	void sayHello() {
		//System.out.println(age);//子类不能调用父类的私有属性和方法
	}
}

package cn.my.oo;

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
		//h.age = 12;//报错，因为private修饰后不可在类外访问
		h.name = "无限";
	}
}

class Human{
	private int age;
	String name;
	
	void sayAge() {
		System.out.println(age);
	}
}

class Boy extends Human{
	void sayHello() {
		//System.out.println(age);//子类不能调用父类的私有属性和方法
	}
}

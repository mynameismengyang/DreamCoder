package cn.my.ex;

public class TestExtends {
	public static void main(String[] args) {
		
	}
}

class Person{
	String name;//名字
	int height;//身高
	
	public void rest() {
		System.out.println("休息一下！！！");
	}
}

class Student{
	String name;
	int height;
	String major;
	
	public void rest() {
		System.out.println("休息一下！！！");
	}
	
	public void study() {
		System.out.println("我的愿望就是进字节跳动！！！");
	}
}

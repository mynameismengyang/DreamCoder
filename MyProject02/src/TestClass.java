/**
 * 深入理解类
 * @author my
 *
 */

public class TestClass {
	//属性
	int id;
	String name;
	int age;
	
	//方法
	void study() {
		System.out.println("我学习用的是联想笔记本电脑！");
	}
	
	void play() {
		System.out.println("我们玩的游戏叫做老鹰捉小鸡！");
	}
	
	//new 系统自动创建构造方法。方法名和类名一样
	TestClass(){
		
	}
	public static void main(String[] args) {
		TestClass stu = new TestClass();//创建学习类的一个对象
		System.out.println(stu);
		System.out.println(stu.age = 18);//调用并打印类中的属性
		stu.play();//调用该类的玩方法
		stu.study();//调用该类的学习方法
	}
}
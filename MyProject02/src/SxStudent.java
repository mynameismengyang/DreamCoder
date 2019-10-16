/**
 * 类中包括属性和方法，主函数用来调用类的属性和方法
 * @author my
 *
 */
public class SxStudent {
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
	
	public static void main(String[] args) {
		SxStudent stu = new SxStudent();//创建学习类的一个对象
		System.out.println(stu.age = 18);//调用并打印类中的属性
		stu.play();//调用该类的玩方法
		stu.study();//调用该类的学习方法
	}
}

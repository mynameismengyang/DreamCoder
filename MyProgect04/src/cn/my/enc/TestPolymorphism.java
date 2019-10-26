package cn.my.enc;
/**
 * 测试多态
 * 多态指的是同一个方法的调用，方法的多态
 * 方法重写：方法的返回值、方法名、参数列表必须完全一致(子类重写父类的方法)
 * 子类抛出的异常下不能超过父类相应方法抛出的异常(子类异常不能大于父类异常)
 * 子类方法的访问级别不能低于父类相应方法的访问级别(子类访问级别不能低于父类访问级别)
 * @author my
 *
 */

public class TestPolymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		/*Dog d = new  Dog();//Dog可以变为Animal
		animalCry(d);*/
		
		Animal d = new Dog();//自动向上转型
		Dog d2 = (Dog)d;//强制向下转型
		
		//d.seeDoor();//报错，找不到dog类中的seeDoor方法
		d2.seeDoor();//只有强制向下转型后才可以找到Dog中的方法seeDoor
		animalCry(new Cat());
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
}

class Animal{//多态要同时具备重写和继承
	public void shout() {
		System.out.println("叫了一声！！！");
	}
}

class Dog extends Animal{//
	public void shout() {
		System.out.println("旺旺旺旺旺旺！！！");
	}
	
	public void seeDoor() {
		System.out.println("The dog is watching the door.");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵喵喵喵！！！");
	}
}
package cn.my.oop;
//抽象类的意义就在于：为子类提供统一的、规范的模板。子类必须实现相关的抽象方法
public abstract class AnimalAbstract {
	
	//第一：没有方法体=没有实现。 第二：子类必须实现
	abstract public void shout();
	
	
	//abstract类中定义的普通方法
	public void run() {
		System.out.println("跑跑跑！");
	}
}


class Cat extends AnimalAbstract{

	@Override
	//子类要重写父类中的abstract方法
	public void shout() {
		System.out.println("汪汪汪！");
		
	}
	
}
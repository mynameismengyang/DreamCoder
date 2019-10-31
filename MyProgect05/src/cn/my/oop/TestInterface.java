package cn.my.oop;

public class TestInterface {//这个类是包含main方法的主类，在主方法里调用相应的函数
	public static void main(String[] args) {
		Volant v = new BirdMan();
		v.fly();
		Honest h = new GoodMan();
		h.helpOther();

	}
}

//Volant接口(其实也是类)： public static int FLY_HEIGHT = 1000; public abstract void fly();
interface Volant{
	int FLY_HEIGHT = 1000;
	void fly();
}

//Honest接口(其实也是类)：public abstract void helpOther();
interface Honest{
	void helpOther();
}

//Angel类：继承了接口Volant和接口Honest,所以要重写每个接口中的abstract方法，快捷方式将鼠标放在类的名称上，右键
class Angel implements Volant,Honest{

	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther");
	}

	@Override
	public void fly() {
		System.out.println("Angel.fly()");
	}
	
}

//GoodMan这个类只是继承了Honest这个接口，只需要重写Honest下面的方法就可以了
class GoodMan implements Honest{

	@Override
	public void helpOther() {
		// TODO Auto-generated method stub
		System.out.println("GoodMan.helpOther");
	}
	
}


//BirdMan这个类只是继承了Volant
class BirdMan implements Volant{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("BirdMan.fly()");
	}
	
}

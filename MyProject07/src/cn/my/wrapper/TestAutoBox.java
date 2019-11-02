package cn.my.wrapper;

public class TestAutoBox {
	public static void main(String[] args) {
		Integer a = 123;//自动装箱，Integer a = Integer.valueOf(123);
		Integer aa = new Integer(3);
		System.out.println(aa);
		int b = a;//自动拆箱，编译器会修改：int b = a.intValue();
		
		//缓存[-128,127]之间的数字。实际就是系统初始的时候，船舰了[-128,127]之间的 一个缓存数组。
		//当我们调用valueOf()的时候，首先检查是否在[-128,127]之间，如果在这个范围则直接从缓存数组中拿出来已经存好的数组元素
		//如果不在这个范围，则创建新的Integer对象
		Integer in1 = Integer.valueOf(127);
		Integer in2 = 127;
		System.out.println(in1 == in2);
		System.out.println(in1.equals(in2));
		
		System.out.println("****************");
		
		Integer in3 = Integer.valueOf(27222);
		Integer in4 = 27222;
		System.out.println(in3 == in4);
		System.out.println(in3.equals(in4));
	}
	
	
	
}

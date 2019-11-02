package cn.my.wrapper;
/**
 * 测试包装类：
 * byte Byte
 * short Short
 * boolean Boolean
 * char Character  不一样
 * int Integer  不一样
 * long Long
 * float Float
 * double Double
 * 
 * @author my
 *
 */
public class TestWrappedClass {
	public static void main(String[] args) {
		//基本数据类型转换成包装类
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(3);
		System.out.println(a);
		
		//包装类转换成基本数据类型
		int c = b.intValue();
		double d = b.doubleValue();
		
		//把字符串转成包装类对象
		Integer e = new Integer("9999");
		Integer f = Integer.parseInt("78799");
		System.out.println(e);
		
		//把包装类字符串转换成基本字符串类型
		String g = e.toString();
		System.out.println(g);
		
		//常见的常量
		System.out.println("int类型最大的整数：" + Integer.MAX_VALUE);
		System.out.println("int类型最大的整数：" + Integer.MIN_VALUE);

	}
}

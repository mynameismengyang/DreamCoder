package cn.my.commen;


/**
 * String字符串类的基本用法
 * String类又称作不可变字符序列
 * String类的常用方法，怎么阅读API文档S
 * @author my
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		System.out.println(str1.equals(str2));//equals比较的是每个字符
		System.out.println(str2.equals(str3));
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
	}
}
 
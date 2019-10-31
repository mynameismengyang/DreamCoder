package cn.my.commen;
/**
 * 测试String的常用方法
 * @author my
 *
 */
public class TestString2 {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "hello world";
		System.out.println(s1.charAt(6));
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));//对两个字符忽略大小写的比较
		
		System.out.println(s1.indexOf("World"));
		System.out.println(s1.indexOf("world"));//如果不一样结果返回-1
		
		String s = s1.replace('H', 'h');
		System.out.println(s1);
		System.out.println(s);
		
		System.out.println(s1.startsWith("How"));//s1是否以字符串How开头
		System.out.println(s1.endsWith("World"));//s1是否以字符串World结尾
		String ss = s1.substring(4);//提取字符串：从下标为4的开始到字符串结尾为止
		System.out.println(ss);
		
	}
}

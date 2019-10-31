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
		System.out.println(s1.charAt(6));//返回索引所指向的字符
		System.out.println(s2.length());//返回字符串的长度
		System.out.println(s1.equals(s2));//字符串中的字符一一做比较，相同返回true,否则返回false
		System.out.println(s1.equalsIgnoreCase(s2));//对两个字符忽略大小写的比较
		
		System.out.println(s1.indexOf("World"));//6返回World第一次出现的索引的位置
		System.out.println(s2.indexOf("wo"));//如果没有与之匹配的字符串就返回-1
		
		String s = s1.replace('H', 'h');
		System.out.println(s1);
		System.out.println(s);
		
		System.out.println(s1.startsWith("How"));//s1是否以字符串How开头
		System.out.println(s1.endsWith("World"));//s1是否以字符串World结尾
		String ss = s1.substring(4);//提取字符串：从下标为4的开始到字符串结尾为止
		System.out.println(ss);

		String s3 = " Hello World ";
		String sss = s3.trim();//去掉首尾的空格
		System.out.println(sss);
		
		String s4 = "Hello world";
		String ssss = s4.toLowerCase();//将所有字符转换成小写
		System.out.println(ssss);
		
		String s5 = ssss.toUpperCase();//将所有字符转换成大写
		System.out.println(s5);
	}
}

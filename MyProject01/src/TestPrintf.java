/**
 * 测试printf
 * @author my
 *
 */
public class TestPrintf {
	public static void main(String[] args) {
		//定义一些变量，用来格式化输出
		double d = 2354.678;
		String s = "你好！";
		int i = 1234;
		
		//"%"表示进行格式化输出，"%"之后的内容为格式的定义。
		System.out.printf("%f",d);//result 2354.678000
		System.out.println();
		System.out.printf("%9.2f",d);//result space/space2345.68
		System.out.println();
		System.out.printf("%+9.2f",d);//result space/+2354.68
		System.out.println();
		System.out.printf("%-9.2f",d);//result 2354.68
		System.out.println();
		System.out.printf("%+-9.2f",d);//+2354.68
		System.out.println();
		System.out.printf("%d",i);//d 表示输出十进制整数
		System.out.println();
		System.out.printf("%o",i);//o 表示输出八进制整数
		System.out.println();
		System.out.printf("%x",i);//x 表示输出十六进制整数 
		System.out.println();
		System.out.printf("%#x",i);//#x 表示输出带有十六进制标志的整数
		System.out.println();
		System.out.printf("%s",s);//s 表示输出字符串
		System.out.println();
		System.out.printf("输出一个浮点数：%f,一个整数：%d,一个字符串：%s",d,i,s);
        System.out.println();
		System.out.printf("%d,%s,%f",i,s,d);		
				
	}
}

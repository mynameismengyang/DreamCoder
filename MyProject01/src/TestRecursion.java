

public class TestRecursion {
	public static void main(String[] args) {
		//system.out.printf()指定格式字符串和参数，将格式化的字符串写入此输出流的便捷方法。
		long d1 = System.currentTimeMillis();
		System.out.printf("%d结成的结果：%s%n", 10, factorial(10));//调用递归函数
		long d2 = System.currentTimeMillis();
		System.out.println(factorialLoop(4));
	}
	
	//递归原理分析：
	static long factorial(int n) {
		if(n ==1) {//递归头
			return 1;
		}else {
			return n * factorial(n-1);//递归体
		}
	}
	
	static long factorialLoop(int a) {
		int result = 1;
		while(a > 1) {
			result *= a*(a-1);
			a -= 2; 
		}
		System.out.println(result);
		return result;
	}
	
	
}

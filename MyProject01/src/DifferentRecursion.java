
public class DifferentRecursion {
	public static void main(String[] args) {
		/*System.out.printf("%d的阶乘是：%d%n",10,f1(10));
		System.out.printf("%d的阶乘是：%d%n",5,f2(5));*/
		int are = 1;
		for(int i=1;i<=10;i++) {
			
			are = are * i;
		}
		System.out.println(are);
		
	}
	
	/*static long f1(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n * f1(n-1);
		}
	}
	
	
	static long f2(int n) {
		long result = 1;
		while(n >1) {
			result *= n * (n-1);
			n -= 2;
		}
		return result;
		
	} */
	
	
}

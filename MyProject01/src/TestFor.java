
public class TestFor {
	public static void main(String[] args) {
		//1--100求和
		/*int sum = 0;
		for (int i = 0; i <= 100; i ++) {
			sum = sum +i;
		}
		System.out.println(sum);*/
		
		//
		/*for(int i =1;i<=5;i++) {
			for(int j=1;j<=  5;j++) {
				System.out.print(i+ "\t");
			}
		System.out.println();
		}*/
		
		//九九乘法表
		/*for(int i=1; i<=9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "="+ j*i + "\t");
			}
			System.out.println();
		}*/
		
		//1--100之间的奇数求和，偶数求和
		/*int sum1 = 0;//奇数
		int sum2 = 0;//偶数
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				sum2 = sum2 + i;
			}else {
				sum1 = sum1 + i;
			}
			
		}
		System.out.println("1--100之间的偶数的和为：" + sum2);
		System.out.println("1--100之间的奇数的和为：" + sum1);*/
		
		int n = 0;
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				System.out.print(i + "\t");
				n = n + 1;
				if(n % 5 ==0) {
					System.out.println();
				}
				
			}

		}
	}
}

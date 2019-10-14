
public class TestOuter {
	public static void main(String[] args) {
		//打印101-150之间所有的质数
		outer:for (int i = 101; i < 150; i++) {
			for(int j = 2; j<=i/2;j++) {//一个数一般
				if(i%j == 0) {
					continue outer;
				}
			}
			System.out.print(i + " ");
		}
	}
}

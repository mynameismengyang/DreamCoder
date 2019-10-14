/**
 * continue
 * continue语句：把100~150之间不能被3整除的数输出，并且每行输出5个
 * @author 
 *
 */
public class TestContinue {
	public static void main(String[] args) {
		int n = 0;
		for(int i = 100; i<=150; i++) {
			if(i%3==0) {
				continue;
			}
			//不是3的倍数，则跳过本次循环，继续进行下一次循环
			System.out.print(i + "、");//前一个用print
			n ++;
			if(n % 5 == 0) {
				System.out.println();//后一个用println
			}
		}
	}
}

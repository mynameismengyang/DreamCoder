/**
 * 测试break,碰到break，整个循环结束
 * Math.round()是四舍五入的计算
 * Math.floor()向下取整
 * @author my
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int total = 0;
		System.out.println("begin");
		while(true) {
			total = total + 1;
			int i = (int)Math.round(100*Math.random());
			System.out.println(i);
			if(i == 88) {
				break;//break就是退出整个循环
				      //continue语句立刻跳到循环首部，越过当前循环的其余部分。
			}
		}
		//输出循环的次数
		System.out.println("Game over,used " + total + " times.");
	}
}

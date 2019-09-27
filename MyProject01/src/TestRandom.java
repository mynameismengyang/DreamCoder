/**
 * Random
 * 1.java.util.Random类中实现的随机算法是伪随机，也就是有规则的随机，所谓有规则的就是在给定种子(seed)的区间内随机生成数字；
 * 2.相同种子数的Random对象，相同次数生成的随机数字是完全相同的；
 * 3.Random类中各方法生成的随机数字都是均匀分布的，也就是说区间内部的数字生成的机率均等。
 * @author my
 *
 */
import java.util.*;
public class TestRandom {
	public static void main(String[] args) {//I am always make error in main to mian
		Random r1 = new Random(10); //使用random时，需要导入库 import java.util.*;
		int i = r1.nextInt(50);
		int j = r1.nextInt(20);
		System.out.println(i);
		System.out.println(j);
	}
}

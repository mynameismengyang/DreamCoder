package cn.my.commen;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 测试java.util.Arrays工具类的使用
 * @author my
 *
 */
public class TestArrays {
	public static void main(String[] args) {
		int[] a = {34,66,35,22,99};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//paixu
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 66));
		System.out.println("***************************");

		
		int[][] b = new int[3][];
		b[0] = new int[]{10,20,30};
		b[1] = new int[]{34,46,1,35,66};
		b[2] = new int[]{33,92,99};
		System.out.println(b[0][2]);//30
		System.out.println(b[1][3]);//35
		System.out.println(b[2][0]);//33
		
		int[][] c = {
				{10,20,30},
				{34,46,1,35,66},
				{33,92,99}
		};
		System.out.println("***************************");
		System.out.println(b[0][2]);//30
		System.out.println(b[1][3]);//35
		System.out.println(b[2][0]);//33
	}
}

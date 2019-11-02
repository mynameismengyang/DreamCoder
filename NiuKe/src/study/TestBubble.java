package study;

import java.util.Arrays;

/**
 * 练习冒泡算法
 * 思路：
 * 1.定义一个数组
 * 2.先比较找出最大的数，规则：array[j]>array[j+1],change
 * 3.外嵌套，共需要array.lenth-1次同2的操作，将数组中的元素全部排好顺序
 * @author my
 *
 */
public class TestBubble {
	public static void main(String[] args) {
		int[] array = {1,3,2,0,5,7,9,6,8,4};
		int temp;
		for(int i = 0;i<=array.length-1;i++) {//一个数组有10个元素，需要循环9次
			for (int j=0;j<=array.length-2-i;j++) {//每循环y
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				System.out.println(Arrays.toString(array));
			}
		
		}
		System.out.println(Arrays.toString(array));
	}
}

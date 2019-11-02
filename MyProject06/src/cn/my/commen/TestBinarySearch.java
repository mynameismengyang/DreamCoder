package cn.my.commen;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 测试二分法查找一个元素的位置
 * @author my
 *
 */
public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//以字符串的形式打印数组
		
		System.out.println(myBinarySearch(arr,10));
		
	}
	
	public static int myBinarySearch(int[] arr,int value) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {//前提条件是low<high
			int mid = (low+high)/2;//设置mid是low和high的一半
			if(value==arr[mid]) {
				return mid;
			}
			
			if(value>arr[mid]) {
				low = low+1;
			}
			
			if(value<arr[mid]) {
				high = mid-1;
			}
		}
		return -1;
	}
}

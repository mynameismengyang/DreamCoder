package cn.my.commen;

import java.util.Arrays;

public class TestBubble {
	public static void main(String[] args) {
		int[] value = {3,1,6,2,9,0,7,4,5,8};
		int temp = 0;
		for(int i = 0;i<value.length-1;i++) {
			for(int j = 0;j<value.length-1-i;j++) {
				if(value[j]>value[j+1]) {
					
					temp = value[j];
					value[j] = value[j+1];
					value[j+1] = temp;
				}
				System.out.println(Arrays.toString(value));
			}
		}
		System.out.println("*********************");
	}
}

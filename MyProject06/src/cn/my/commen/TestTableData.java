package cn.my.commen;

import java.util.Arrays;

/**
 * 测试数组存储表格数据
 * @author my
 *
 */
public class TestTableData {
	public static void main(String[] args) {
		Object[] em0= new Object[] {1000,"孟洋",18,"程序员"};
		Object[] em1= new Object[] {1001,"无限",20,"最帅的人"};
		Object[] em2= new Object[] {1002,"风息",80,"我不太喜欢的人"};
		
		Object[][] tableData = new Object[3][];
		tableData[0] = em0;
		tableData[1] = em1;
		tableData[2] = em2;
		
		for(Object[] temp:tableData) {//循环元素
			System.out.println(Arrays.toString(temp));
		}
	}
}

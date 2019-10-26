package cn.my.enc;
import java.util.ArrayList;

public class TestInit {
	/*static int i;
	static char s;
	public static void main(String[] args) {
		System.out.println(i);//默认初始值为0
		System.out.println("----------------------");
		System.out.println(s);//默认初始值为空，一个空格
	}*/
	public static void main(String[] args) {
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(6);
		list.add(0,4);//list(int index, Object obj)
		list.remove(1);//删除位置1上的元素

		
		for(int i  = 0; i<list.size();i++) {
			System.out.println(list.get(i));*/
		
		int i = 0;
		for(foo('A');foo('B')&&(i<2);foo('C'))
		{
			i++;
			foo('D');
		}
	}
		
		
	
	static boolean foo(char c)
	{
		System.out.println(c);
		return true;
	}
	
}

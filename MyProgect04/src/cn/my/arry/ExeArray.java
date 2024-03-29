package cn.my.arry;
/**
 * 测试数组的三种
 * @author my
 *
 */
public class ExeArray {
	public static void main(String[] args) {
		//静态初始化
		int[] a = {2,3,4};
		for(int m:a) {
			System.out.println(m);
		}//for-each即对数组进行遍历，只是读取不能修改
		/**
		 * for(String temp:ss){
		 * 
		 * }
		 */
		User[] u = {new User(1001,"无限"),
				    new User(1002,"罗小黑"),
				    new User(1003,"风息"),
				    new User(1004,"孟洋")};//这个是调用了同一个包下面的User.java的类中的构造函数
		for(int i=0; i<u.length;i++) {
			System.out.println(u[i].toString());
		}//打印出现如下情况：
		
		//默认初始化
		int[] b = new int[3];//默认跟数组的元素赋值。赋值的规则和成员变量的赋值规则一致
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		
		//动态初始化
		int[] b1 = new int[2];//动态初始化数组，先分配空间，再赋值。
		b1[0]=1;//给数组元素赋值；
		b1[1]=2;//给数组元素赋值；
		for(int i=0; i<b1.length;i++) {
			System.out.print(b1[i]);
		}
	}
	
}


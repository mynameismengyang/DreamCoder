/**
 * 方法的重载，实际是完全不同的方法，只是名称相同而已
 * 构成方法重载的条件：
 * 1.不同的含义：形参类型、形参个数、形参顺序不同
 * 2.只有返回值不同不构成方法的重载
 * @author my
 *
 */
public class TestReloadMethod {
	public static void main(String[] args) {
		//调用static修饰的add方法
		System.out.println(add(3,5));
		
		
		//调用没有static修饰的add方法
		TestReloadMethod trm = new TestReloadMethod();
		int c = trm.add(6, 7, 8);
		System.out.println(c);
		
		double d = trm.add(2, 3.14);
		System.out.println(d);
		
		double d2 = trm.add(3.14, 2);
		System.out.println(d2);
		
	}
	
	//原始  两个参数  static修饰在main方法中可以直接调用
	public static int add(int n1, int n2) {//修饰符，返回值类型，方法名，参数列表
		int sum = n1 + n2;
		return sum;//return作用1：终止程序。2：确定返回值类型
		
	}
	
	//三个参数,参数个数不同的方法重载
	 public int add(int n1, int n2, int n3) {
		 int sum = n1 + n2 + n3;
		 return sum;
	 }
	 
	 //参数类型不同
	 public double add(int n1,double n2) {  //
		 double sum = n1  + n2;
		 return sum;
	 }
	 
	 //参数顺序不同 只是看类型的顺序，而不是后面的名称
	 public double add(double n1, int n2) {
	 	double sum = n1 + n2;
	    return sum;
	 
     }
	 
	 
	 //返回值类型不同，不是方法重载
	 /*public double add(int n1, int n2) {
		 double sum = n1 + n2;
		 return sum;
	 }*/
	 
	 //参数名称不同，不构成方法的重载
	 
	 
}

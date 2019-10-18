/**
 * 构造方法用于对象的初始化；
 * 静态初始化块，用于类的初始化操作。
 * @author my
 *
 */
public class TestStaticBlock {
	int id;
	String name;
	String pwd;
	static String company;
	
	static {
		company = "我的梦想是进字节跳动";
		//name = "哈哈哈"; 报错不是static的变量
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {//此时执行类的时候，就会执行static静态块
	}
}

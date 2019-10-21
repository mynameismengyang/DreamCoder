/**
 * 测试参数传值机制
 * @author my
 *
 */
public class User4 {
	//属性
	int id;
	String name;
	String pwd;
	
	//有参数的构造方法
	public User4(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParaTransfer01(User4 u) {
		u.name = "";
		System.out.println(u);
		       
	}
	
	public void testParaTransfer02(User4 u) {
		u = new User4(200,"高三");
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(100,"高小七");
		System.out.println(u1);
		
		
		u1.testParaTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParaTransfer02(u1);
		System.out.println(u1.name);
		
	}
}

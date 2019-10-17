//定义User类
/**
 * 构造方法
 * (1)通过new关键字调用！！！只要有new在栈的内存里就有方法生成
 * (2)构造器虽然有返回值，但不能定义返回值类型()
 * @author my
 *
 */
public class User {
	//属性
	int id;
	String name;
	String pwd;
	
	//构造方法
	public User() {
		
	}
	
	//构造方法重载
	public User(int id, String name) {//此处的id 和name 是User构造器里的
		//super();  //构造方法的第一句总是super()
		this.id = id;  //this表示创建好对象
		this.name = name;  
	}
	
	//
	public User(int id,String name,String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(20145518,"孟洋"); 
		User u3 = new User(20145518,"孟洋","mengyang19941019");
	}
}

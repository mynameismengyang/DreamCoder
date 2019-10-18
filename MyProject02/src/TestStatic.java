/**
 * 测试Static
 * 
 * @author my
 *
 */
public class TestStatic {
	int id;
	String name;
	String pwd;
	
	static String company;
	
	public TestStatic(int id, String name,String company) {
		this.id = id;
		this.name = name;
		this.company = company;
	}
	
	public void login() {
		System.out.println("登录："+ name);
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		TestStatic t = new TestStatic(101,"孟洋","字节跳动");
		t.printCompany();
	}
}

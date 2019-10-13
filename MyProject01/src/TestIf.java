
public class TestIf {
	public static void main(String[] args) {
		double d = Math.random();//return [0,1)
		System.out.println(d);
		System.out.println("************************");
		
		int i = (int)(6*d+1);
		System.out.println(i);
		if(i<3) {
			System.out.println("小");
		}
		System.out.println("************************");
		
		int a = (int)(6*d+1);
		System.out.println(a);
		int b = (int)(6*d+1);
		System.out.println(b);
		int c = (int)(6*d+1);
		System.out.println(c);
		int count = a + b + c;
		
		if(count > 15) {
			System.out.println("今天手气不错");
		}
		
		if(count >= 10 && count <= 15) {
			System.out.println("今天手气一般");
		}
		
		if(count <10) {
			System.out.println("今天手气很差");
		}
		
	
	}

}

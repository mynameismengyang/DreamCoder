/**
 * 条件运算符()
 * @author my
 *
 */
public class TestOperator {
	public static void main(String[] args) {
		int score = 80;
		int x = -100;
		String s = score < 60?"不及格":"及格";//score < 60为布尔表达式，true is 不及格，false is 及格.
		System.out.println(s);
		
		if(score < 60) {
			System.out.println("不及格");
		}else {
			System.out.println("及格");
		}
		
	}

}

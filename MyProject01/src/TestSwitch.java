
public class TestSwitch {
	public static void main(String[] args) {
		/*int d = (int)(1 + 12 * Math.random());
		System.out.println(d);
		*/
		/*switch(d) {
		case 1:
			System.out.println("一月份，春节！");
			break;
		case 2:
			System.out.println("二月份，开春！");
			break;
		default:
			System.out.println("这是其他月份！");
			break;

		}*/
		
		char c = 'a';
		int rand = (int)(c + 26 * Math.random());
		System.out.println(rand);
		char c2 = (char)rand; 
		System.out.println(c2);

		switch (c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c2 + "是元音！");
			break;
		case 'y':
		case 'w':
			System.out.println(c2 + "半元音！");
			break;
		default:
			System.out.println(c2 + "这是辅音！");
			break;
		}
			
			
	}
}

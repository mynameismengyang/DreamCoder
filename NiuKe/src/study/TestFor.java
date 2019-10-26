package study;

public class TestFor {
	public static void main(String[] args) {
		for (char c = 0; c<128; c++) {
			if(Character.isLowerCase(c)) {//isLowerCase方法用于判断指定字符是否为小写字母。
				System.out.println("value:" + (int)c + "\t" +"character:" + c);
			}
		}
	}
}

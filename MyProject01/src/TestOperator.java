/**
 * ���������()
 * @author my
 *
 */
public class TestOperator {
	public static void main(String[] args) {
		int score = 80;
		int x = -100;
		String s = score < 60?"������":"����";//score < 60Ϊ�������ʽ��true is ������false is ����.
		System.out.println(s);
		
		if(score < 60) {
			System.out.println("������");
		}else {
			System.out.println("����");
		}
		
	}

}

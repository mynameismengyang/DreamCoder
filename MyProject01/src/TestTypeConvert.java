/**
 * ��������ת��
 * @author my
 *
 */
public class TestTypeConvert {

	public static void main(String[] args) {
		double x = 3.14;
		float y = 3.22F;
		int ny = (int)y;
		int nx = (int)x;
		System.out.println(ny);//castǿ��ת����������ʧ����С��������ȥ
		
		
		System.out.println(nx);//castǿ��ת��Ϊ����
		char c = 'a';
		int d = c + 1;
		System.out.println(d);
		System.out.println((char)d);

	}

}

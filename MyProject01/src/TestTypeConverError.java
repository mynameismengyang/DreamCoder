/**
 * �������
 * @author my
 *
 */
public class TestTypeConverError {
	public static void main(String[] args ) {
		int money = 1000000000;//10��
		int year = 20;
		//���ص�total�Ǹ�������int�ķ�Χ
		int total = money * year;
		System.out.println(total);
		//���ص�total��Ȼ�Ǹ�����Ĭ����int����˽����ת��intֵ����ת��log�������Ѿ����������ݶ�ʧ��
		long total1 = money * year;
		System.out.println(total1);
		//����total2��ȷ���Ƚ�һ�����ӱ��long,�������ʽ����������ȫ����long�����㡣
		long total2 = money*((long)year);
		System.out.println(total2);
		
		long total3 = 34L*233*year*223423;
		System.out.println(total3);
		//��������
		int l=2;//�ֲ�����L����1��
		long a = 2345L;//����ʹ�ô�дL
		System.out.println(l+1);
	}
}

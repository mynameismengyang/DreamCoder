/**
 * Random
 * 1.java.util.Random����ʵ�ֵ�����㷨��α�����Ҳ�����й�����������ν�й���ľ����ڸ�������(seed)������������������֣�
 * 2.��ͬ��������Random������ͬ�������ɵ������������ȫ��ͬ�ģ�
 * 3.Random���и��������ɵ�������ֶ��Ǿ��ȷֲ��ģ�Ҳ����˵�����ڲ����������ɵĻ��ʾ��ȡ�
 * @author my
 *
 */
import java.util.*;
public class TestRandom {
	public static void main(String[] args) {//I am always make error in main to mian
		Random r1 = new Random(10); //ʹ��randomʱ����Ҫ����� import java.util.*;
		int i = r1.nextInt(50);
		int j = r1.nextInt(20);
		System.out.println(i);
		System.out.println(j);
	}
}

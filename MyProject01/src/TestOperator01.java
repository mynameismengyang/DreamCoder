/**
 * �������������
 * @author my
 * ��������
 * 1.���������������һ��Ϊlong,����ҲΪlong.
 * 2.û��longʱ�����Ϊint.���ǲ�����ȫΪshort,byte,���Ҳ��int.
 * ��������
 * 3.���������������һ��Ϊdouble,����Ϊdouble.
 * 4.ֻ��������������float,������Ϊfloat.
 */
public class TestOperator01 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		byte b1 = 1;
//		byte b2 = 2;
//		short s1 = 3;
//	    //byte b3 = b1 + b2;error
//		//short s2 = b1 + b2;error
//		int n1 = b1 + b2;
//		
//		
//		float f1 = 3.145F;
//        float f2 = 4.123F;
//        double d1 = 6.258;
//        float f3 = f1 + f2;
//        double d2 = f1 +d1;
//        
//        /**
//         * �������Լ��Ĳ���
//         */
//        int a = 3;
//        int b = ++a;
//        System.out.println(a);//a�ȼӣ�Ȼ���ٸ�ֵ��b
//        System.out.println(b);
//	    int a2 = 4;
//	    int a3 = a2++;
//	    System.out.println(a2);//���Ƚ�a2��ֵ��ֵ��a3,Ȼ��a2���Լ�
//	    System.out.println(a3);
		
	    //���1
//	    int x = 5;
//	    int y = 6;
//	    int z = ++x + ++x;
//	    System.out.println(z);//13
//	    System.out.println(x);//7
		
        //���2
//		int x = 5;
//  	int y = 6;
//  	int z = ++x + x++;
//  	System.out.println(z);//12
//	    System.out.println(x);//7
		
		//���3
//		int x = 5;
//		int y = 6;
//		int z = x++ + x++;
//		System.out.println(z);//11
//		System.out.println(x);//7
	    
		//���4
//		int x = 5;
//		int y = 6;
//		int z = x++ + ++x;
//		System.out.println(z);//12
//		System.out.println(x);//7
		
		//���5
//		int x = 5;
//		int y = 6;
//		int z = x++ + y++;
//		System.out.println(z);//11
		
		//���6
//		int x = 5;
//		int y = 6;
//		int z = ++x + y++;
//		System.out.println(z);//12
		
		//���7
//		int x = 5;
//		int y = 6;
//		int z = y++ + x++;
//		System.out.println(z);//11
		
		//���8
//		int x = 5;
//		int y = 6;
//		int z = y++ + ++x;
//		System.out.println(z);//12
		
		//attention1
//		int x = 5;
//		int y = 6;
//		x = x++ + ++x;
//		System.out.println(x);//12
		
		//attention2
//		int x = 5;
//		int y = 6;
//		x = x++ + x++;
//		System.out.println(x);//11
		
		//attention3
//		int x = 5;
//		int y = 6;
//		x = ++x + ++x;
//		System.out.println(x);//13
		
		//attention4
		int x = 5;
		int y = 6;
		x = ++x + x++;
		System.out.println(x);//12
		
		//complete:happy
	    	    
	}

}

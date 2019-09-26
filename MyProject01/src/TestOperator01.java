/**
 * 测试算数运算符
 * @author my
 * 整数运算
 * 1.如果两个操作数有一个为long,则结果也为long.
 * 2.没有long时，结果为int.计是操作数全为short,byte,结果也是int.
 * 浮点运算
 * 3.如果两个操作数有一个为double,则结果为double.
 * 4.只有两个操作数是float,则结果才为float.
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
//         * 自增和自减的测试
//         */
//        int a = 3;
//        int b = ++a;
//        System.out.println(a);//a先加，然后再赋值给b
//        System.out.println(b);
//	    int a2 = 4;
//	    int a3 = a2++;
//	    System.out.println(a2);//首先将a2的值赋值给a3,然后a2再自加
//	    System.out.println(a3);
		
	    //情况1
//	    int x = 5;
//	    int y = 6;
//	    int z = ++x + ++x;
//	    System.out.println(z);//13
//	    System.out.println(x);//7
		
        //情况2
//		int x = 5;
//  	int y = 6;
//  	int z = ++x + x++;
//  	System.out.println(z);//12
//	    System.out.println(x);//7
		
		//情况3
//		int x = 5;
//		int y = 6;
//		int z = x++ + x++;
//		System.out.println(z);//11
//		System.out.println(x);//7
	    
		//情况4
//		int x = 5;
//		int y = 6;
//		int z = x++ + ++x;
//		System.out.println(z);//12
//		System.out.println(x);//7
		
		//情况5
//		int x = 5;
//		int y = 6;
//		int z = x++ + y++;
//		System.out.println(z);//11
		
		//情况6
//		int x = 5;
//		int y = 6;
//		int z = ++x + y++;
//		System.out.println(z);//12
		
		//情况7
//		int x = 5;
//		int y = 6;
//		int z = y++ + x++;
//		System.out.println(z);//11
		
		//情况8
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

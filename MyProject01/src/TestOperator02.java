/**
 * 逻辑运算符(logical operators)
 * @author my
 *
 */
public class TestOperator02 {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = false;
		System.out.println("0."+(a&b));//false
		
		System.out.println("1."+(a^b));//true two values are not same
		System.out.println("2."+(b^c));//false
		
		System.out.println("3."+(a|b));//true two values ,one of them is true, the result is true
		System.out.println("4."+(!a));//false
		
		/**
		 * 短路与&&
		 */
		//int c =3/0;
		boolean d = 1>2 && 2<(3/0);//no error Description, short circuit && operation, if the previous is false, the operation will not continue later/.
		System.out.println(d);
		
		/**
		 * 短路或||
		 */
		boolean d2 = 1<2 || 2<(3/0);
		System.out.println(d2);//true+
		
		//char bb = '3';
		String bb = "3";//String is ""
		int nn = 4;
		int cc = 5;
		System.out.println(bb+nn+cc);
		System.out.println(nn+cc+bb);
		
		/**
		 * 移位(shift)
		 * During the interview, the interviewer will ask, 3*2 is the fastest way to calculate.
		 */
		int mul=3<<1;
		System.out.println(mul);
		int division= 21>>1;
		System.out.println(division);
		
		/**
		 * 关系操作符(relational operator)
		 * ==、!= 比较的是对象的引用，对象的引用就是别名
		 */
		
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2);//false
		System.out.println(n1 != n2);//true
		System.out.println(n1.equals(n2));//true
		
		/**
		 * revise
		 */
		int i = 1;
		System.out.println("i:" + i);//1
		System.out.println("++i:" + ++i);//2
		System.out.println("i++:" + i++);//2
		System.out.println("i:" + i);//3
		System.out.println("--i:" + --i);//2
		System.out.println("i--:" + i--);//2
		System.out.println("i:" + i);//1
		
	}

}

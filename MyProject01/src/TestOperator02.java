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
		
	}

}

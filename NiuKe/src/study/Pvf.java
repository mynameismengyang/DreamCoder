package study;

public class Pvf {
	static boolean Paddy;
	public static void main(String[] args) {
		//System.out.println(Paddy);//false
		Integer i = 42;
		Long l = 42L;
		Double d = 42.0;
		//System.out.println(i.equals(d));//false
		//System.out.println(d.equals(l));//false
		//System.out.println(i.equals(l));//false
		System.out.println(l.equals(42L));//true
	}
}

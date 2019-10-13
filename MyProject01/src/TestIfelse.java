
public class TestIfelse {
	public static void main(String[] args) {
		
		double r = 4 * Math.random();
		double area = Math.PI*Math.pow(r,2);
		double circle = 2*Math.PI*r;
		System.out.println(area);
		System.out.println(circle);
		if(area > circle) {
			System.out.println("面积大于周长");
		}
		if(area < circle) {
			System.out.println("面积小于周长");
		}
	}
}

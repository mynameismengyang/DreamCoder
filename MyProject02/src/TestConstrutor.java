
//关于点的类：属性、方法
class Point{
	double x,y;
	
	//构造方法名称和类名必须保持一致
	public Point(double a, double b) {
		x = a;//x表示上面定义的double类型的x
		y = b;//y表示上面定义的double类型的y
	}
	
	//
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}

//测试构造方法的类
public class TestConstrutor {
	public static void main(String[] args) {
		Point p1 = new Point(3.0,4.0);
		Point p2 = new Point(0.0,0.0);
		System.out.println(p2.getDistance(p1));
	}
}

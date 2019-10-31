package cn.my.game;

import javax.swing.JFrame;
import java.awt.Color;//竟然也需要导入
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyGameFrame extends JFrame {
	Image bj = GameUtil.getImage("image/bj.png");
	Image planeImage = GameUtil.getImage("image/plane.png");
	
	//int planeX=250,planeY=900;//全局变量
	
	Plane plane = new Plane();
	
	@Override
	public void paint(Graphics g) {//自动被调用，在窗口上画东西。画的内容是通过画笔g来画的。
		// TODO Auto-generated method stub
		super.paint(g);
		Plane plane  = new Plane();
		/*Color c = g.getColor();//本身画笔就有颜色，所以要先保存一下颜色***
		Font f = g.getFont();//与颜色的操作一样
*/	
		g.setColor(Color.BLUE);
		g.drawLine(100,100,300,300);
		g.setFont(new Font("黑体",Font.BOLD,50));//
		g.setColor(Color.pink);
		g.drawString("无限", 150, 150);
		
		g.drawImage(bj, 0, 0, null);
		g.drawImage(planeImage,planeX,planeY,null);
		planeY--;//更改飞机图片的Y坐标就是垂直运动，更改飞机图片的X坐标就是水平运动

		
		/*g.setColor(c);//保存完颜色需要还原回去***
		g.setFont(f);//与颜色一样
*/	}
	
	//添加双缓冲技术
	private Image offScreenImage;
		
	public void update(Graphics g) {
		if(offScreenImage == null)
			offScreenImage = this.createImage(631,993);
			Graphics goff = offScreenImage.getGraphics();
			paint(goff);
			g.drawImage(offScreenImage, 0, 0, null);
			
	}
	
	//内部类可以直接使用外部类的属性,反复重画窗口
	class PaintThread extends Thread{//alt+?可以实现重写一个类
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				System.out.println("显示窗口重画");
				repaint();//重画窗口，repaint在JFrame类中
				
				try {
					Thread.sleep(60);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void launchFrame() {
		this.setTitle("小飞机游戏");
		this.setVisible(true);//窗口是否可视的语句
		this.setSize(631,993);
		this.setLocation(600,0);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {//此处用到windowClosing方法的重写
				System.exit(0);
			}
			
		});
		
		new PaintThread().start();//启动线程
		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}

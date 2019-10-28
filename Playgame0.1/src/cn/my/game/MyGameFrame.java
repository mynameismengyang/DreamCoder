package cn.my.game;

import java.awt.Color;//竟然也需要导入
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame {
	Image plane = GameUtil.getImage("cn.my.image/plane.jpg");
	Image bj = GameUtil.getImage("cn.my.image/bj.jpg");
	
	@Override
	public void paint(Graphics g) {//自动被调用，在窗口上画东西。画的内容是通过画笔g来画的。
		// TODO Auto-generated method stub
		super.paint(g);
		
		Color c = g.getColor();//本身画笔就有颜色，所以要先保存一下颜色***
		Font f = g.getFont();//与颜色的操作一样
	
		g.setColor(Color.BLUE);
		g.drawLine(100,100,300,300);
		g.setFont(new Font("黑体",Font.BOLD,50));//
		g.setColor(Color.pink);
		g.drawString("无限", 150, 150);
		
		g.drawImage(plane, 250, 250, null);
		
		g.setColor(c);//保存完颜色需要还原回去***
		g.setFont(f);//与颜色一样
	}
	
	
	public void launchFrame() {
		this.setTitle("小飞机游戏");
		this.setVisible(true);//窗口是否可视的语句
		this.setSize(500,500);
		this.setLocation(600,300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {//此处用到windowClosing方法的重写
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}

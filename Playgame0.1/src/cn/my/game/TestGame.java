package cn.my.game;

import java.awt.*;
import javax.swing.JFrame;

public class TestGame extends JFrame{
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		Font f = g.getFont();
		Color c = g.getColor();
		
		
		g.setColor(Color.GREEN);
		g.drawLine(100,100,300,300);
		g.draw3DRect(10,10,200,100,true);
		
		g.setColor(Color.blue);
		g.setFont(new Font("plain",Font.PLAIN,30));
		g.drawString("实例化对象",100,100);
		
	
		g.setFont(f);
		g.setColor(c);
	}
	
	public void launchFrame() {
		this.setTitle("小飞机游戏");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(500, 500);
	}
	public static void main(String[] args) {
		TestGame tg = new TestGame();
		tg.launchFrame();
	}
}

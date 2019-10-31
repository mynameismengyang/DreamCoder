package cn.my.game;

import java.awt.Graphics;
import java.awt.Image;

/**
 * 游戏物体的父类
 * @author my
 *
 */
public class GameObject {
	Image img;
	double x,y;
	int speed;
	int width,height;
	
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
	}

	public GameObject(Image img, double x, double y) {//构造器
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}

	public GameObject() {//无参构造器
	}
	
	
	
	
}

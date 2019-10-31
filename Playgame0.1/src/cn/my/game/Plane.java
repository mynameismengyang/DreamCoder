package cn.my.game;

import java.awt.Graphics;

public class Plane extends GameObject{
	
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
		x++;
	}

}

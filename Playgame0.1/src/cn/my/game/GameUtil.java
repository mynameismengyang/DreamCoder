package cn.my.game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;//此处的URL是导入的net下面的URL

import javax.imageio.ImageIO;


/**
 * 实现图片的加载
 * @author my
 *
 */
public class GameUtil {
	//工具类最好将构造器私有化
	private GameUtil() {//私有后每个人都看不了了
		
	}
	
	public static Image getImage(String path) {
		BufferedImage bi = null;
		try {
			URL u = GameUtil.class.getClassLoader().getResource(path);
			bi = ImageIO.read(u);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return bi;
	}
}

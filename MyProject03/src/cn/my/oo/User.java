package cn.my.oo;//包的名称 非注释性语句的第一句

import cn.my.cc.UserOne;
import static java.lang.Math.*;
/**
 * jdk提供的默认的包：
 * java.lang 不用导入，直接使用 包括String、Math、Integer、System、Thread，提供常用功能
 * java.awt 包含了构成抽象窗口工具集，这些类用来构建和管理应用程序的图形用户界面(GUI);
 * java.net 包含执行与网络相关的操作的类
 * java.io  包含能提供多种输入/输出功能的类
 * java.util包含一些实用工具类，如定义系统特性，使用与日期日历相关的函数
 * 
 * @author my
 *
 */
public class User {
	public static void main(String[] args) {
		Human h = new Human();
		//h.age = 12;//
		h.name = "无限";//同一个包中可以调用protected修饰的属性和方法
	}
}

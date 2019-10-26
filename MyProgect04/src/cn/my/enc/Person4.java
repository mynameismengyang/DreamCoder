package cn.my.enc;



public class Person4 {//Alt+Shift+T
	private int age;
	private String name;
	private boolean flag;//一般将类的属性设置为私有
	
	

	public int getAge() {//get方法有返回值类型

		
		return age;
	}



	public void setAge(int age) {//set方法没有返回值类型
		if(age>=1&&age<=100) {
			this.age = age;
			System.out.println("年龄是正确的"+ age);
		}else {
			System.out.println("年龄怎么能是负数呢，长点心吧?");
		}
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isFlag() {
		return flag;
	}



	public void setFlag(boolean flag) {
		this.flag = flag;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


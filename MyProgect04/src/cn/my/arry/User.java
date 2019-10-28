package cn.my.arry;

public class User {

		private int id;
		private String name;
		
		public String toString() {
			
	        return "id:"+ id+" name:"+ name;
	    }
		public User(int id, String name) {
			
			this.id=id;
			this.name=name;
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		//Object类具有一个toString()方法，你创建的每个类都会继承该方法。它返回对象的一个String表示，并且对于调试非常有帮助。然而对于默认的toString()方法往往不能满足需求，需要覆盖这个方法。toString（）方法将对象转换为字符串。
}


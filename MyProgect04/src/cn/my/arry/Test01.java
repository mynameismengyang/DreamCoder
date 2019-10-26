package cn.my.arry;

public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];
		String[] arr02 = new String[5];
		User[] arr03 = new User[3];
		
		arr01[0]=13;
		arr01[1]=15;
		arr01[2]=20;
		
		for(int i=0;i<arr01.length;i++) {
			arr01[i] = 10*i;
			
		}
		
		for(int i=0;i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
	}
}


	
	

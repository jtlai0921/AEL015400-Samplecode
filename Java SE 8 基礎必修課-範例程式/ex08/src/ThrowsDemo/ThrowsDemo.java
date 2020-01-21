package ThrowsDemo;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			showSalary("王小明", 35000);
			showSalary("李小華", 50000);
		}
	    catch(IllegalArgumentException e) {  //捕捉自行抛出的例外
	    	System.out.println("例外內容：" + e.getMessage());
	    }
	}
	
	static void showSalary(String name, int money) throws IllegalArgumentException {
		if(money>=20000 && money<=40000)
			System.out.println("員工：" + name + "\t底薪：" + money +
	                           "\t獎金：" + (int)money * 0.08 + "\n");
		else
			throw new IllegalArgumentException("呼叫方法引數錯誤");    //自行抛出例外物件
	}
}
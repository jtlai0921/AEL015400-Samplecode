
public class Cal1 {
	static void add(int x, int y) { // 被呼叫方法主體
		System.out.print("呼叫Cal1類別的Add方法-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public static void main(String[] args) {
		int a = 20;
		// 呼叫同一類別的add方法
		add(a + 5, 3); // 呼叫敘述
		// 呼叫不同類別的add方法
		Cal2.add(a - 7, 2); // 呼叫敘述
	}
}

 class Cal2 {
	static void add(int x, int y) { // 被呼叫方法主體
		System.out.print("呼叫Cal2類別的add方法-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

}

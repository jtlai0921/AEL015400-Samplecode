public class MyClass {
	void add(int x, int y) {
		System.out.print(" 呼叫MyClass類別的add方法-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public static void main(String[] args) {
		int a = 20;
		MyClass c1 = new MyClass(); // 建立屬於MyClass類別的物件c1
		c1.add(a + 5, 3); // 呼叫物件c1的add方法
		MyCal c2 = new MyCal(); // 建立屬於MyCal類別的物件c2
		c2.add(a - 7, 2); // 呼叫物件c2的add方法
	}
}

class MyCal {
	void add(int x, int y) {
		System.out.print(" 呼叫MyCal  類別的add方法-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

}

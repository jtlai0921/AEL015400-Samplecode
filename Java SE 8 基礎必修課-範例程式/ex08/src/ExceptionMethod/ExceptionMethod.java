package ExceptionMethod;

public class ExceptionMethod {
	static int[] data = new int[10];
	public static void init() {
		data[50] = 120;
	}

	public static void main(String[] args) {
		try {
			init();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外內容：" + e.toString());
			System.out.println("為：超出陣列索引範圍");
		}
	}
}

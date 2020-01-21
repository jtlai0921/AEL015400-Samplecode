public class CallByValue {
	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println(" 傳值呼叫前\ta=" + a + "\tb=" + b);
		byVal(a, b);
		System.out.println(" 傳值呼叫後\ta=" + a + "\tb=" + b);
	}

	static void byVal(int x, int y) {
		x += 3;
		y += 2;
		System.out.println(" 傳值呼叫中\tx=" + x + "\ty=" + y);
	}

}

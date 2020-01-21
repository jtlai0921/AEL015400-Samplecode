public class Overloading {
	static int min(int x, int y) {
		if (x < y)
			return x;
		else
			return y;
	}

	static double min(double[] vArray) {
		double n = vArray[0];
		for (int i = 1; i < vArray.length - 1; i++) {
			if (vArray[i] < n)
				n = vArray[i];
		}
		return n;
	}

	public static void main(String[] args) {
		int a = 21, b = 14;
		System.out.println(a + "㎝" + b + "程计" + min(a, b));
		double f[] = new double[] { 12.1, 54.3, 7.2, 40 };
		System.out.println("皚じ [12.1,54.3,.2,0] い程计" + min(f));
	}

}

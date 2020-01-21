public class Method2 {
	public static void main(String[] args) {
		int tot1, tot2;
		tot1 = sum(1, 10);
		System.out.println("1加到10的總和為" + tot1 + "\n");
		tot2 = sum(5, 12);
		System.out.println("5加到12的總和為" + tot2 + "\n");
	}

	static int sum(int vStart, int vEnd) {
		int total = 0;
		for (int i = vStart; i <= vEnd; i++)
			total += i;
		return total;
	}

}

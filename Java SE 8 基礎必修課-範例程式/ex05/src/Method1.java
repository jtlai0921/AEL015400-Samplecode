public class Method1 {
	public static void main(String[] args) {
		sum(1, 10);
		sum(5, 12);
	}

	static void sum(int vStart, int vEnd) {
		int total = 0;
		for (int i = vStart; i <= vEnd; i++)
			total += i;
		System.out.println(vStart + "加到" + vEnd + "的總和為" + total);
	}

}

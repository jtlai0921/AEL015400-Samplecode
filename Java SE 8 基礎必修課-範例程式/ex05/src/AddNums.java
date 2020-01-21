public class AddNums {
	public static void main(String[] args) {
		System.out.printf("%d%n", add(1, 2));
		System.out.printf("%d%n", add(1, 2, 3));
		System.out.printf("%d%n", add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.printf("%d%n", add());
	}

	static int add(int... a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		return sum; // 傳回陣列a元素相加的結果
	}

}

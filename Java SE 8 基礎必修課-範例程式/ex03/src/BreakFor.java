public class BreakFor {
	public static void main(String[] args) {
		int i, num = 1;
		for (i = 0; i < 10; i++) {
			num *= 2;
			if (num > 20) // 執行 break 的條件
				break;
		}
		System.out.printf("break被執行,此時的i=%d ,num=%d", i, num);
	}
}
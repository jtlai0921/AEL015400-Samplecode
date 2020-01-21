public class NestWhile {
	public static void main(String[] args) {
		int i = 1, j = 1;
		while (i <= 9) // 外層迴圈1~9為被乘數
		{
			while (j <= 9) { // 內層迴圈1~9為乘數
				System.out.printf("%d*%d=%2d  ", i, j, i * j);
				j++; // j+1
			}
			i++; // i+1
			j = 1; // j=1重新開始
			System.out.println(); // 換行
		}
	}
}

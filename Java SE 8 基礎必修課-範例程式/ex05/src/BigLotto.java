public class BigLotto {
	// getRnd靜態方法可用來取得n~m之間的亂數，並傳給所設定的陣列
	static void getRnd(int[] vArray, int min, int max, int num) {
		int max_dim, rem_num, choice;
		max_dim = max - min + 1;
		int[] t = new int[max_dim];
		for (int i = 0; i <= max_dim - 1; i++) {
			t[i] = min + i;
		}
		rem_num = max_dim;
		for (int i = 0; i <= num - 1; i++) {
			choice = (int) (Math.random() * rem_num);
			vArray[i] = t[choice];
			for (int j = choice; j < rem_num - 1; j++) {
				t[j] = t[j + 1];
			}
			rem_num--;
		}

	}

	public static void main(String[] args) {
		int[] lot = new int[7];
		getRnd(lot, 1, 49, 7);
		System.out.println("本期大樂透開獎號碼如下：");
		for (int i = 0; i < 6; i++)
			System.out.print("  " + lot[i]);
		System.out.print("\n  特別號：" + lot[6]);
	}
}

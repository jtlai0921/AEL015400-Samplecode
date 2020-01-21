public class MyArray2 {
	public static void main(String[] args) {
		int[] n = new int[] { 56, 45, 68, 32 };
		int sum = 0;
		for (int i : n) { // 逐一讀取陣列n的元素值到變數i
			System.out.println(i);
			sum += i;
		}
		System.out.println(" n 陣列元素總和為 " + sum);
	}
}

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 1; // 輸入的整數
		int sum = 0; // 累計的總和
		String numLine = ""; // 紀錄輸入的整數
		while (num != 0) {
			System.out.print("請輸入整數累計總和 (輸入0結束計算 ):");
			num = scn.nextInt();
			sum += num; // 將輸入的數值num加到總和sum中
			numLine += (num); // 將數值num和"+"加到字串numLine中
			if (num != 0)
				numLine += ("+"); // 將數值num和"+"加到字串numLine中
		}
		System.out.printf(numLine + " = " + sum);
		scn.close();
	}
}
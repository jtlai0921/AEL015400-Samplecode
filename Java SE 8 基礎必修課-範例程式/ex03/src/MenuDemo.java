import java.util.Scanner;

public class MenuDemo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = 36, num2 = 12;
		String sel;
		do { // 只要輸入的不是大小寫的E，就繼續執行程式
			System.out.println("******** 四則運算選單  ********");
			System.out.println("\tA. 加(+)");
			System.out.println("\tB. 減(-)");
			System.out.println("\tC. 乘(*)");
			System.out.println("\tD. 除(/)");
			System.out.println("\tE. 離開系統");
			System.out.println("*************************");
			do { // 直到輸入A~E才離開迴圈
				System.out.print("請選擇功能: ");
				sel = scn.next().toUpperCase(); // 輸入字母轉成大寫
			} while ("ABCDE".indexOf(sel) == -1);
			switch (sel) {
			case "A":
				System.out.printf(" %d + %d = %d%n", num1, num2, num1 + num2);
				break;
			case "B":
				System.out.printf(" %d - %d = %d%n", num1, num2, num1 - num2);
				break;
			case "C":
				System.out.printf(" %d * %d = %d%n", num1, num2, num1 * num2);
				break;
			case "D":
				System.out.printf(" %d / %d = %d%n", num1, num2, num1 / num2);
				break;
			case "E":
				System.out.println("結束程式");
			}
		} while (!(sel.equals("E")));
		scn.close();
	}
}

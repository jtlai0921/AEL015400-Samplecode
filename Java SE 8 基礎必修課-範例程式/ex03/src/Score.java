import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("請輸入考試分數: ");
		int score = scn.nextInt();
		score = score / 10;
		switch (score) {
		case 10: // 以下是屬於甲級的分數
		case 9:
		case 8:
			grade = '甲';
			break;
		case 7: // 屬於乙級的分數
			grade = '乙';
			break;
		case 6: // 屬於丙級的分數
			grade = '丙';
			break;
		default:// 屬於丁級的分數
			grade = '丁';
		}
		System.out.println("這是屬於" + grade + "級的成績。");
		scn.close();
	}
}

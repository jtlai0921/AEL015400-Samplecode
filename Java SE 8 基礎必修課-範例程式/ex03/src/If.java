import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String vip;
		double money;
		System.out.print("請輸入購買金額: ");
		money = scn.nextDouble();// 取得輸入的金額並轉成double資料型別
		System.out.print("請告知是否為VIP(請輸入Y/N): ");
		vip = scn.next();
		if (vip.equals("Y") | vip.equals("y")) // vip等於"Y"或"y"時
			money = money * 0.85; // 如果輸入Y，則打85折
		System.out.printf("需支付金額: %.1f" , money);
		scn.close();
	}

}

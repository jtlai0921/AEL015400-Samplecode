import java.util.Scanner;

public class Ex02_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入您的姓名：");
		String name = scn.next(); // 讀入一字串並指定給name字串變數
		System.out.print("請輸入您的年齡：");
		int age = scn.nextInt(); // 讀入一個整數並指定給age變數
		System.out.printf("%s 您好!您的年齡為%d歲!!%n", name, age);
		System.out.print("請輸入您的座右銘：");
		String mot;		
		while( (mot = scn.nextLine()).equals("") ){} 
		System.out.println("您的座右銘是：" + mot);
		scn.close();
	}

}

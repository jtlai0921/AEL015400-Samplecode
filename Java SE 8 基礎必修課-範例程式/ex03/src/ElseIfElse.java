import java.util.Scanner;

public class ElseIfElse {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字元:");
		char c = scn.next().charAt(0);
		if (Character.isDigit(c)) //(c>='0' && c<='9')
			System.out.println("您輸入的字元是數字。");
		else if (Character.isUpperCase(c))//(c>='A' && c<='Z')
			System.out.println("您輸入的字元是大寫的字母。");
		else if (c>='a' && c<='z')
			System.out.println("您輸入的字元是小寫的字母。");
		else
			System.out.print("您輸入的是其它的字元符號。");
		scn.close();
	}
	
}


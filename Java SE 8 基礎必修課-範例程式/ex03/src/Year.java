import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.print("請輸入要測試的年份(比如:1900): ");
	  int year = scn.nextInt();
	  if (year % 400 == 0) // 如果可以被400整除就是閏年
	      System.out.print("您輸入的是閏年。");
	  else if ((year % 4 == 0) && (year % 100 != 0)) 
	  //可被4整除且不被100整除就是閏年
		  System.out.print("您輸入的年份是閏年。");
	  else
		  System.out.print("您輸入的年份不是閏年。");
	  scn.close();
	}
}


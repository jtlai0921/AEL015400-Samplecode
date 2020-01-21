package ExtendDemo;    //宣告程式檔的類別置於extendDemo套件內
 
class CMath {
	public void getMax(int a, int b) {
		int bigNum;
		if (a>b) bigNum = a;
		else bigNum = b;
		System.out.println(a + "與" + b + "的最大數為" + bigNum);
	}
}

class SonCMath extends CMath {  // SonCMath繼承CMath類別
	public void getFabonacci(int a) {
		int firstNum = 0, secondNum = 1;
		System.out.print("費式數列：") ;
		System.out.print(firstNum + ", " +secondNum);
		int ans;
		for(int i=2; i<=a; i++) {
			ans = firstNum + secondNum;
			System.out.print(", " +ans);
			firstNum = secondNum;
			secondNum = ans;
		}
	}
}

public class ExtendDemo {
	public static void main(String[] args) {
		SonCMath math1 = new SonCMath();
		math1.getMax(10,20);        //使用子類別繼承父類別的方法
		System.out.println();
		math1.getFabonacci(10);     //使用子類別自己的方法
	}
}

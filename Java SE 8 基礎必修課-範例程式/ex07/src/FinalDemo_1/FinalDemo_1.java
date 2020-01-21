package FinalDemo_1;

final class Cdog  {    //無法被繼承
	int weight ;
}

/* 因為Cdog類別為final，所以Ccat無法繼承Cdog
class Ccat extends Cdog { }
*/

class Ccar {
	private final int speed = 140 ;
	//private final int speed;   //錯誤,須指定初值
	public final void showBigSpeed(String s) {
		System.out.println(s + " 最大速度是 " + speed + " 公里！");
	}
}

class PiliCcar extends Ccar {
	/* 父類別的showBigSpeed方法為final，所以子類別無法覆寫
  	public void showBigSpeed(String s) {
		System.out.println(s + " 最大速度是 " + speed + " 公里！");
  	}
	*/
}

public class FinalDemo_1 {
	public static void main(String[] args) {
		Ccar car1 = new Ccar();
		car1.showBigSpeed("car1");
		PiliCcar car2 = new PiliCcar();
		car2.showBigSpeed("car2");
	}
}

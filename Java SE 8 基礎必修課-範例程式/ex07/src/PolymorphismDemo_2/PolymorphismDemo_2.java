package PolymorphismDemo_2;

interface IAttack {        //定義IAttack介面
	void showAttack();     //宣告IAttack介面的showAttack()方法
}

class CSpider implements IAttack {  //CSpider類別實作IAttack介面
	public void showAttack() {
		System.out.println("蜘蛛人的攻擊力：60");
		System.out.println("攻擊方式會發射蜘蛛網！\n");
	}
}

class CSuperMan implements IAttack { //CSuperMan類別實作IAttack介面
	public void showAttack() {
		System.out.println("超人的攻擊力：100");
		System.out.println("攻擊方式使用拳頭！\n");
	}
}

public class PolymorphismDemo_2 {
	public static void main(String[] args) {
		IAttack flag;
	    CSpider Bill = new CSpider();
	    CSuperMan clark = new CSuperMan();
	    flag = Bill;
	    flag.showAttack();
	    flag = clark;
	    flag.showAttack();
	}
}

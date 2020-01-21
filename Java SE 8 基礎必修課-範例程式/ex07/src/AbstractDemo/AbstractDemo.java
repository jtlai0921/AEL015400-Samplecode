package AbstractDemo;

abstract class Ccar {    //抽象類別
	int speed;
	public abstract void addSpeed(int s);  //抽象方法沒有實作內容
	public static void showData() {        //靜態方法
		System.out.println("所有的車子都可以加速!!\n");
	}
}

class PiliCar extends Ccar {
	//繼承Ccar抽象類別，必須實作Ccar類別的addSpeed抽象方法
	public void addSpeed(int s) {
		System.out.println("霹靂車目前速度：" + speed);
		speed += s;
		System.out.println("霹靂車  加速後：" + speed);
	}
}

class BMWCar extends Ccar {
	//繼承Ccar抽象類別，必須實作Ccar類別的addSpeed抽象方法
	public void addSpeed(int s) {  //實作addSpeed抽象方法
		System.out.println("BMW目前速度：" + speed);
		speed += s ;
		if(speed <= 200) {
			System.out.println("BMW  加速後：" + speed);
		}
		else {
			System.out.println("BMW最大速度 200 無法再加速了");
		}
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Ccar.showData();   //呼叫Ccar抽象類別的showData()靜態方法
	    PiliCar car1 = new PiliCar();
	    car1.addSpeed(150);
	    car1.addSpeed(120);
	    System.out.println();
	    BMWCar car2 = new BMWCar();
	    car2.addSpeed(150);
	    car2.addSpeed(120);
	    //Ccar car3 = new Ccar();  //錯誤，抽象類別無法產生實體
	}
}

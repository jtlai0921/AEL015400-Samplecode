public class BuildObject {                    //主類別
	public static void main(String[] args) {  //主程式
		Ccar car1;                            //宣告car1物件
	    car1 = new Ccar();                    //建立car1物件
	    car1.gas = 40.7;                      //設定car1物件的屬性值
	    car1.tbo = 13.6;
	    car1.MaxDist();                       //呼叫car1物件的方法
	    double distance = car1.Dist(10);      //呼叫car1物件的方法,並取得傳回值

	    Ccar car2 = new Ccar();               //宣告並建立car2物件
	    car2.gas = 60;                        //設定car2物件的屬性值
	    car2.tbo = 9.5;

	    System.out.println("car1汽車資訊：");
	    System.out.println("最大載油量：" + car1.gas + " L");
	    System.out.println("平均耗油量：" + car1.tbo + " km/L");
	    System.out.println("加滿油可行駛 " + car1.max_dist + " km");
	    System.out.println("加油10L可行駛 " + distance + " km");
	}
}
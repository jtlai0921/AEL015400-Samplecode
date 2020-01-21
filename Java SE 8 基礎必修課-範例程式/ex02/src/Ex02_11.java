
public class Ex02_11 {

	public static void main(String[] args) {
		int a,d;
		byte b = 100;
		long c = 200;
		a = b;			//資料型別自動轉換
		System.out.println("a = " + a);
		d = (int) c;		//資料型別強制轉換
		System.out.println("d = " + d); 
		d=(int)(b+c);		//資料型別強制轉換
		System.out.println("b + c = " + d);
	}

}

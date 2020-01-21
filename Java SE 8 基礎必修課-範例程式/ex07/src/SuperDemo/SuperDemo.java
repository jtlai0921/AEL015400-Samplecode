package SuperDemo;

class CStu {
	private int weight, height;
	CStu() {
		weight = 0; height = 0;
	}
	CStu(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	public void showData() {
		System.out.print("身高：" + this.weight + "\t體重：" + this.height);
	}
}

class SonCStu extends CStu {
	private int score;
	SonCStu() {
		super();     //呼叫CStu父類別的CStu()建構式
		score = 0;
	}
	SonCStu(int weight, int height, int score) {
		//呼叫CStu父類別的CStu(int weight, int height)建構式
		super(weight, height);
		this.score = score;
	}
	public void showData() {
		super.showData();   //呼叫父類別的showData方法
		System.out.print("\t成績：" + this.score);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
	    CStu Peter = new CStu(50, 170);
	    Peter.showData();
	    System.out.println("\n");
	    SonCStu Tom = new SonCStu(65, 164, 99);
	    Tom.showData();
	}
}
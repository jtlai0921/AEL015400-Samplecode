class Person {
	int weight, height;

	Person() {
		weight = 65;
		height = 165;
	}
}

public class CallByRef {

	public static void main(String[] args) {
		Person Jack = new Person();
		System.out.println("參考呼叫前\tJack體重=" + Jack.weight + "\tJack身高="
				+ Jack.height);
		byRef(Jack);
		System.out.println("參考呼叫後\tJack體重=" + Jack.weight + "\tJack身高="
				+ Jack.height);
	}

	static void byRef(Person p) {
		p.weight += 3;
		p.height += 2;
		System.out
				.println("參考呼叫中\tJack體重=" + p.weight + "\tJack身高=" + p.height);
	}
}

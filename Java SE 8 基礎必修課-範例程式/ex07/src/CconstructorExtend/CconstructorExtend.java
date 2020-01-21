package CconstructorExtend;

class CStu {
	CStu() {
		System.out.println("執行 CStu 的建構式！ \n");
	}
}

class SonCStu extends CStu {
	SonCStu() {
		System.out.println("執行 SonCStu 的建構式！ \n");
	}
}

class GrandsonCStu extends SonCStu {
	GrandsonCStu() {
		System.out.println("執行 GrandsonCStu 的建構式！ \n");
	}
}

public class CconstructorExtend {
	public static void main(String[] args) {
		new GrandsonCStu();
	}
}

public class Recursive {
	static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("費氏f(6)第六項為" + fib(6));
		System.out.println("費氏f(10)第十項為" + fib(10));
	}

}

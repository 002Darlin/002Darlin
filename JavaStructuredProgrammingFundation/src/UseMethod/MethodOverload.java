package UseMethod;

public class MethodOverload {

	public static void main(String[] args) {
		System.out.println("The square of integer 7 is " + square(7));
		System.out.println("The square of double 7.5 is " + square(7.5));
	}

	public static int square(int x) {
		return x * x;
	}

	public static double square(double y) {
		return y * y;
	}
}


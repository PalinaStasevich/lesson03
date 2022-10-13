package lt.lhu.unit03.main;

public class Task30 {

	public static void main(String[] args) {
		double a = 16.7;
		double b = 2.6;
		double c = -4.5;
		if (a > b & b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
			System.out.print("a = " + a + "\nb = " + b + "\nc = " + c );
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.print("a = " + a + "\nb = " + b + "\nc = " + c );
		}

	}

}

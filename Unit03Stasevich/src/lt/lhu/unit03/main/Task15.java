package lt.lhu.unit03.main;

public class Task15 {

	public static void main(String[] args) {
		double a = 38.7;
		double b = 19.9;
		if (a < b) {
			a = (a + b) / 2;
			b = (a * b) * 2;
			System.out.println("a = " + a + "\nb = " + b);
		} else {
			b = (a + b) / 2;
			a = (a * b) * 2;
			System.out.println("a = " + a + "\nb = " + b);
		}

	}

}

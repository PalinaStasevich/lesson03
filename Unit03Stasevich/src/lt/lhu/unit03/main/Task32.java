package lt.lhu.unit03.main;

public class Task32 {

	public static void main(String[] args) {
		double a = 13.0;
		double b = 12.5;
		double c = 7.0;
		if (a + b >= 0) {
			System.out.println("a + b = " + (a + b));
			if (a + c >= 0) {
				System.out.println("a + c = " + (a + c));
			}
			if (b + c >= 0) {
				System.out.println("b + c = " + (b + c));
			}
		}
		if ((a + b < 0) & (a + c < 0) & (b + c < 0)) {
			System.out.println("Нет положительной суммы");
		}

	}

}

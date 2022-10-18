package lt.lhu.unit03.main;

public class Task20 {

	public static void main(String[] args) {
		double e = 0.0;
		double a;
		double sum = 0;
		int n = 10;
		for (double x = 1.0; x <= n; x++) {
			a = 1 / ((3 * x - 2) * (3 * x + 1));
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("sum = " + sum);
	}

}

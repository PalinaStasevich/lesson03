package lt.lhu.unit03.main;

public class Task18 {

	public static void main(String[] args) {
		double e = 0.2;
		double a;
		double sum = 0;
		int n = 20;
		for (int x = 1; x <= n; x++) {
			a = Math.pow(-1, x - 1) / x;
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("sum = " + sum);
	}

}

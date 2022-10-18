package lt.lhu.unit03.main;

public class Task14 {

	public static void main(String[] args) {
		double n = 9.0;
		double x = 1.0;
		double sum = 0;
		while (x <= n) {
			sum = sum + (1 / x);
			x = x + 1;
		}
		System.out.println("sum = " + sum);

	}

}

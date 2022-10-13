package lt.lhu.unit03.main;

public class Task37 {

	public static void main(String[] args) {
		double fx;
		double x = 21.6;
		if (x < 3) {
			fx = 1 / (Math.pow(x, 3) - 6);
		} else {
			fx = -x * x + 3 * x + 9;
		}
		System.out.println("fx = " + fx);

	}

}

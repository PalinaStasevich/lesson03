package lt.lhu.unit03.main;

public class Task39 {

	public static void main(String[] args) {
		double fx;
		double x = 24.5;
		if (x < 8) {
			fx = 1 / (Math.pow(x, 4) - 6);
		} else {
			fx = -x * x + x - 9;
		}
		System.out.println("fx = " + fx);

	}

}

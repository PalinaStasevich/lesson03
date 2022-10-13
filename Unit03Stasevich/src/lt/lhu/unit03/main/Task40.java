package lt.lhu.unit03.main;

public class Task40 {

	public static void main(String[] args) {
		double fx;
		double x = 13.0;
		if (x > 13) {
			fx = - 3 / (x + 1);
		} else {
			fx = - Math.pow(x, 3) + 9;
		}
		System.out.println("fx = " + fx);

	}

}

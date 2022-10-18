package lt.lhu.unit03.main;

public class Task21 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;
		a = 3.0;
		b = 5.0;
		h = 0.2;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for (double x = a; x <= b; x = x + h) {
			y = x - Math.sin(x);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}

}

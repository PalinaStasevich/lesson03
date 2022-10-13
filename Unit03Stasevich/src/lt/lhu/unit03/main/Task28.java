package lt.lhu.unit03.main;

public class Task28 {

	public static void main(String[] args) {
		double a = 13.2;
		double b = 14.0;
		double c = -13.65;
		double d = 16.0;
		double x = d - a;
		double y = d - b;
		double z = d - c;
		double result = Math.max(x, Math.max(y, z));
		if (a == d) {
			System.out.println("a = d");
		} else if (b == d) {
			System.out.println("b = d");
		} else if (c == d) {
			System.out.println("c = d");
		} else {
			System.out.println("max(d-a,d-b,d-c) = " + result);
		}

	}

}

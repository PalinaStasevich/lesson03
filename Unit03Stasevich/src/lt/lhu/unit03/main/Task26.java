package lt.lhu.unit03.main;

public class Task26 {

	public static void main(String[] args) {
		double a = 13.4;
		double b = -15.5;
		double c = 17.0;
		double max = 0;
		double min = 0;
		double sum = 0;
		if ((a > b) & (a > c)) {
			max = a;
		} else if ((b > a) & (b > c)) {
			max = b;
		} else if ((c > a) & (c > b)) {
			max = c;
		}
		if ((a < b) & (a < c)) {
			min = a;
		} else if ((b < a) & (b < c)) {
			min = b;
		} else if ((c < a) & (c < b)) {
			min = c;
		}
		sum = max + min;
		System.out.println("sum = " + sum);

	}

}

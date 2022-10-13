package lt.lhu.unit03.main;

public class Task07 {

	public static void main(String[] args) {
		double a = 13.0;
		double b = 12.6;
		double c = -14.5;
		double x = 3.0;
		double result = a * x * x + b * x + c;
		if (result >= 0) {
			System.out.println(result);
		} else {
			System.out.println(Math.abs(result));
		}
		
	}

}

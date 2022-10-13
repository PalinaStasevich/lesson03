package lt.lhu.unit03.main;

public class Task10 {

	public static void main(String[] args) {
		int r1 = 4;
		int r2 = 9;
		double s1 = Math.PI * r1 * r1;
		double s2 = Math.PI * r2 * r2;
		if (s1 < s2) {
			System.out.println("Площадь первого круга больше");
		} else {
			System.out.println("Площадь второго круга больше");
		}

	}

}

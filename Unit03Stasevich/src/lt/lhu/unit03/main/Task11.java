package lt.lhu.unit03.main;

public class Task11 {

	public static void main(String[] args) {
		int a1 = 13;
		int a2 = 16;
		int h1 = 8;
		int h2 = 3;
		double s1 = (a1 * h1) / 2;
		double s2 = (a2 * h2) / 2;
		if (s1 < s2) {
			System.out.println("Площадь первого треугольника больше");
		} else {
			System.out.println("Площадь второго треугольника больше");
		}

	}

}

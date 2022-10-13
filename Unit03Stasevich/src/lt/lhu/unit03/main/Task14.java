package lt.lhu.unit03.main;

public class Task14 {

	public static void main(String[] args) {
		int a = 90;
		int b = 30;
		int c = 180 - b - a;
		int sum = a + b + c;
		if ((a > 0) & (b > 0) & (c > 0) & (sum == 180)) {
			System.out.println("Треугольник существует");
			if ((a == 90) | (b == 90) | (c == 90)) {
				System.out.println("И он прямоугольный");
			}
		} else {
			System.out.println("Такого треугольника не существует");
		}

	}

}

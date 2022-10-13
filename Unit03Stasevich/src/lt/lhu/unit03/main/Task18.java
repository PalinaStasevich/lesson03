package lt.lhu.unit03.main;

public class Task18 {

	public static void main(String[] args) {
		int a = -13;
		int b = -15;
		int c = 90;
		boolean a0 = a <= 0;
		boolean b0 = b <= 0;
		boolean c0 = c <= 0;
		if (a0 & b0 & c0) {
			System.out.println("3 отрицательных числа");
		} else if ((a0 & b0) | (a0 & c0) | (b0 & c0)) {
			System.out.println("2 отрицательных числа");
		} else if (a0 | b0 | c0) {
			System.out.println("1 отрицательное число");
		} else {
			System.out.println("нет отрицательных чисел");
		}
	}

}

package lt.lhu.unit03.main;

public class Task07 {

	public static void main(String[] args) {
		int a = -12;
		int b = 12;
		int h = 2;
		int y;
		for (int x = a; x <= b; x = x + h ) {
			System.out.print("x = " + x);
			if (x > 2) {
				y = x;
				System.out.println("\ty = " + y);
			} else {
				y = -x;
				System.out.println("\ty = " + y);
			}
		}

	}

}

package lt.lhu.unit03.main;

public class Task08 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 2;
		int h = 1;
		int y;
		for (int x = a; x <= b; x = x + h ) {
			System.out.print("x = " + x);
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("\ty = " + y);
			} else {
				y = (x - c) + 6;
				System.out.println("\ty = " + y);
			}
		}

	}

}

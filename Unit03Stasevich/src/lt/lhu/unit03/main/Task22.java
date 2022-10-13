package lt.lhu.unit03.main;

public class Task22 {

	public static void main(String[] args) {
		int x = 13;
		int y = 31;
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		if ((x > y) | (y > x)) {
			x = max;
			y = min;
			System.out.println("x = " + max + "\ny = " + min);
		} else {
			System.out.println("x = y");
		}

	}

}

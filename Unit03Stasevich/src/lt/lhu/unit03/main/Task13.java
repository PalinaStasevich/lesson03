package lt.lhu.unit03.main;

public class Task13 {

	public static void main(String[] args) {
		int x1 = 13;
		int y1 = 26;
		int x2 = 16;
		int y2 = 30;
		double oa = Math.sqrt(x1 * x1 + y1 * y1);
		double ob = Math.sqrt(x2 * x2 + y2 * y2);
		if (oa < ob) {
			System.out.println("Точка A ближе к началу координат");
		} else if (ob < oa) {
			System.out.println("Точка B ближе к началу координат");
		} else {
			System.out.println("Точки находятся на одинаковом расстоянии");
		}

	}

}

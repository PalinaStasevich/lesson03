package lt.lhu.unit03.main;

public class Task17 {

	public static void main(String[] args) {
		int m = 34;
		int n = 12;
		if (m == n) {
			m = n = 0;
			System.out.println("m = n = " + m);
		} else {
			m = n = Math.max(m, n);
			System.out.println("m = n = " + m);
		}

	}

}

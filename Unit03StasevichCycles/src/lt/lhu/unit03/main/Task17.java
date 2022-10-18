package lt.lhu.unit03.main;

public class Task17 {

	public static void main(String[] args) {
		int a = 5;
		int n = 5;
		int comp = 1;
		int result = 1;
		for (int x = 0; x <= n - 1; x++) {
			comp = (a + x);
			result *= comp;
		}
		System.out.println(result);
	}

}

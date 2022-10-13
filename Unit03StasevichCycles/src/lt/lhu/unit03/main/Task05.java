package lt.lhu.unit03.main;

public class Task05 {

	public static void main(String[] args) {
		int a = 1;
		int b = 99;
		int sum = 0;
		while (a <= b) {
			sum = sum + a;
			a = a + 2;
		}
		
		System.out.println("sum = " + sum);

	}

}

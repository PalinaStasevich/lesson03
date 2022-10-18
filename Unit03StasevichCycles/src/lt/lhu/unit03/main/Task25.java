package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int factorial = 1;
		System.out.print("> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("> ");
		}
		a = sc.nextInt();
		for (int x = 2; x <= a; x++) {
			factorial = factorial * x;
		}
		System.out.print("Факториал числа " + a + " = " + factorial);

	}

}

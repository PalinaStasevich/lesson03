package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y = 1;
		System.out.print("> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("> ");
		}
		x = sc.nextInt();
		int sum = 0;
		while (y <= x) {
			sum = sum + y;
			y++;
		}
		System.out.print("sum = " + sum);

	}

}

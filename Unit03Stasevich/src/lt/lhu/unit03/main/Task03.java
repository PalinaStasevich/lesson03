package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc;
		int a;
		sc = new Scanner(System.in);
		System.out.print("a = ");
		a = sc.nextInt();
		if (a < 3) {
			System.out.println("yes");
		} else if (a == 3) {
			System.out.println("a = 3");
		} else {
			System.out.println("no");
		}

	}

}

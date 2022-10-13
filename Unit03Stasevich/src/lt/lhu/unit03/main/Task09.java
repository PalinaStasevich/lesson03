package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc;
		int a,b,c;
		sc = new Scanner(System.in);
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		System.out.print("c = ");
		c = sc.nextInt();
		if ((a == b) & (b == c)) {
			System.out.print("Треугольник равносторонний");
		} else {
			System.out.print("Треугольник не является равносторонним");
		}

	}

}

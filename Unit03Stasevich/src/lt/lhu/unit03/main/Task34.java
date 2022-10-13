package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		Scanner sc;
		double cost;
		double cash;
		double change;
		sc = new Scanner(System.in);
		System.out.println("Введите стоимость книги = ");
		cost = sc.nextDouble();
		System.out.println("Введите внесенную сумму = ");
		cash = sc.nextDouble();
		if (cash > cost) {
			change = cash - cost;
			System.out.println("Возьмите сдачу = " + change);
		} else if (cost > cash) {
			change = cost - cash;
			System.out.println("Денег недостаточно, нужно еще " + change);
		} else {
			System.out.println("Спасибо");
		}

	}

}

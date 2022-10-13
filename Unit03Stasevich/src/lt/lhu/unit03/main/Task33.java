package lt.lhu.unit03.main;

public class Task33 {

	public static void main(String[] args) {
		int password = 7922;
		String dostup;
		String dostup1 = "A,B,C";
		String dostup2 = "B,C";
		String dostup3 = "C";
		switch (password) {
		case 9583:
		case 1747:
			dostup = dostup1;
			break;
		case 3331:
		case 7922:
			dostup = dostup2;
			break;
		case 9455:
		case 8997:
			dostup = dostup3;
			break;
		default:
			System.out.print("Неправильный пароль");
			return;
		}
		
		System.out.print("Доступны модули баз " + dostup);

	}

}

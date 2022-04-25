package ch02;

import java.util.Scanner;

public class Q_2525 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int c = scanner.nextInt();

		int a = h * 60 + m + c;
		h = a / 60;
		m = a % 60;

		if (h >= 24) {
			h = h - 24;
		}

		System.out.println(h + " " + m);
	}

}

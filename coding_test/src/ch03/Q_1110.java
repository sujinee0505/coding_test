package ch03;

import java.util.Scanner;

public class Q_1110 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		int r = a;
		int cnt = 0;
		while (true) {
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			cnt++;
			if (a == r) {
				break;
			}
		}
		System.out.println(cnt);
	}

}

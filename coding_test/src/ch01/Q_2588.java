package ch01;

import java.util.Scanner;

public class Q_2588 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a * (b % 100 % 10));
		System.out.println(a * (b % 100 / 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}
}

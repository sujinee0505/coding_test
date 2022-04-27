package ch05;

import java.util.Scanner;

public class Q_11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			sum += c - '0';
		}
		System.out.println(sum);
	}
}

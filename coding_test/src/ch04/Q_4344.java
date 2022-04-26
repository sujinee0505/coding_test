package ch04;

import java.util.Scanner;

public class Q_4344 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] arr;

		int total = scanner.nextInt();

		for (int i = 0; i < total; i++) {

			int n = scanner.nextInt();
			arr = new int[n];

			double sum = 0;

			for (int j = 0; j < n; j++) {
				int score = scanner.nextInt();
				arr[j] = score;
				sum += score;
			}

			double mean = (sum / n);
			double count = 0;

			for (int j = 0; j < n; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / n) * 100);

		}
		scanner.close();
	}
}

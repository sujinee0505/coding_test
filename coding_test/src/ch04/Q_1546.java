package ch04;

import java.util.Scanner;

public class Q_1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println((sum / n) / max * 100);
	}
}

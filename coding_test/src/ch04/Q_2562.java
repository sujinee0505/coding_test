package ch04;

import java.util.Scanner;

public class Q_2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = arr[0];
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] == max) {
				cnt = i + 1;
			}
		}
		System.out.println(max + "\n" + cnt);
	}
}

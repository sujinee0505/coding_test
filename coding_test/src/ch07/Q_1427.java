package ch07;

import java.util.Scanner;
import java.util.Arrays;

public class Q_1427 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[] arr = scanner.nextLine().toCharArray();

		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}

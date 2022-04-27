package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Q_10809 {

	public static void main(String[] args) {
		// 49~74

		int arr[] = new int[26];
		Arrays.fill(arr, -1);
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (arr[c - 'a'] == -1) {
				arr[c - 'a'] = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

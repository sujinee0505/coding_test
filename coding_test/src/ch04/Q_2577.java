package ch04;

import java.util.Scanner;

public class Q_2577 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = (scanner.nextInt() * scanner.nextInt() * scanner.nextInt());
		String s = String.valueOf(result);
		int[] arr = new int[10];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 48]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}

package ch05;

import java.util.Scanner;

public class Q_1157 {

	public static void main(String[] args) {
		int arr[] = new int[26];
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				arr[s.charAt(i) - 'A']++;
			} else {
				arr[s.charAt(i) - 'a']++;
			}
		}

		int max = 0;
		char c = '?';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				c = (char) (i + 65);
			} else {
				c = '?';
			}
		}
		System.out.println(c);
	}
}

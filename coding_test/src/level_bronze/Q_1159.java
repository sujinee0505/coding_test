package level_bronze;

import java.util.Scanner;

public class Q_1159 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[26];
		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			char c = s.charAt(0);
			arr[c - 97]++;
		}
		boolean check = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 5) {
				check = true;
				System.out.print((char) (i + 97));
			}
		}
		if (!check) {
			System.out.println("PREDAJA");
		}
	}
}

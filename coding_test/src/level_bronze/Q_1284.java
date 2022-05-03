package level_bronze;

import java.util.Scanner;

public class Q_1284 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String s = scanner.next();
			if (s.equals("0")) {
				scanner.close();
				break;
			}
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				int n = s.charAt(i) - '0';
				if (n != 1 && n != 0) {
					sum += 3;
				} else if (n == 1) {
					sum += 2;
				} else if (n == 0) {
					sum += 4;
				}
			}
			sum += (1 * (s.length() + 1));
			System.out.println(sum);
		}
	}
}

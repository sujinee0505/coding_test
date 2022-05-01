package level_bronze;

import java.util.Scanner;

public class Q_1212 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String arr[] = { "000", "001", "010", "011", "100", "101", "110", "111" };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int cur = s.charAt(i) - '0';
			if (i == 0 && cur < 4) {
				if (cur < 2) {
					sb.append(arr[cur].substring(2));
				} else {
					sb.append(arr[cur].substring(1));
				}

			} else {
				sb.append(arr[cur]);
			}
		}
		System.out.println(sb.toString());
	}
}

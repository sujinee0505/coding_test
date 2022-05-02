package level_bronze;

import java.io.*;

public class Q_1259 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String s = bf.readLine();
			int arr[] = new int[s.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.charAt(i) - '0';
			}
			if (s.length() % 2 != 0 && !s.equals("0")) {
				String a = "";
				for (int i = 0; i <= arr.length / 2; i++) {
					a += arr[i];
				}
				String b = "";
				for (int i = arr.length - 1; i >= arr.length / 2; i--) {
					b += arr[i];
				}
				if (a.equals(b)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			} else if (s.length() % 2 == 0 && !s.equals("0")) {
				String a = "";
				for (int i = 0; i <= (arr.length / 2) - 1; i++) {
					a += arr[i];
				}
				String b = "";
				for (int i = arr.length - 1; i >= arr.length / 2; i--) {
					b += arr[i];
				}
				if (a.equals(b)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			} else if (s.equals("0")) {
				break;
			}
		}
	}
}

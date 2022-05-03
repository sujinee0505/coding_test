package level_bronze;

import java.io.*;

public class Q_1264 {

	public static void main(String[] args) throws IOException {
		char arr[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String s = bf.readLine();
			int count = 0;

			if (s.equals("#"))
				break;

			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < arr.length; j++) {
					if (s.charAt(i) == arr[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

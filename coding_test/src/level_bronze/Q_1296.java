package level_bronze;

import java.io.*;
import java.util.Arrays;

public class Q_1296 {
	static int[] arr = new int[4];
	static int max = -1;
	static String love = "LOVE";
	static String win = "";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yeondu = br.readLine();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String other = br.readLine();

			for (int j = 0; j < 4; j++) {
				int sum = yeondu.length() - yeondu.replace(String.valueOf(love.charAt(j)), "").length();
				sum += other.length() - other.replace(String.valueOf(love.charAt(j)), "").length();
				arr[j] = sum;
			}

			int total = 1;

			for (int j = 0; j < 4; j++) {
				for (int k = (j + 1); k < 4; k++) {
					total *= (arr[j] + arr[k]);
				}
			}

			if (max == (total % 100) && win != "") {
				String[] arr2 = new String[2];
				arr2[0] = win;
				arr2[1] = other;
				Arrays.sort(arr2);
				win = arr2[0];
			}

			if (max < (total % 100)) {
				max = total % 100;
				win = other;
			}
		}
		System.out.println(win);
	}
}

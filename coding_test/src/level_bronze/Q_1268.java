package level_bronze;

import java.io.*;

public class Q_1268 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int history[][] = new int[t][5];
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			for (int j = 0; j < 5; j++) {
				history[i][j] = Integer.parseInt(s.split(" ")[j]);
			}
		}
		int count[] = new int[t];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < t; k++) {
					if (history[i][j] == history[k][j]) {
						if (i == k) {
							continue;
						} else {
							count[i]++;
						}
					}
				}
			}
		}
		int max = count[0];
		int num = 0;
		for (int i = 0; i < t; i++) {
			if (count[i] > max) {
				max = count[i];
				num = i + 1;
			} else if (count[i] == max) {
				if (num > i) {
					num = i + 1;
				}
			}
		}
		System.out.println(num);
	}
}

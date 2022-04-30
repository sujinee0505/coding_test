package level_bronze;

import java.io.*;

public class Q_1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char chess[][] = new char[8][8];
		for (int i = 0; i < 8; i++) {
			String s = bf.readLine();
			for (int j = 0; j < 8; j++) {
				chess[i][j] = s.charAt(j);
			}
		}
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0) && (j % 2 == 0) && (chess[i][j] == 'F')) {
					cnt++;
				} else if ((i % 2 == 1) && (j % 2 == 1) && (chess[i][j] == 'F')) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}

package level_bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1236 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char arr[][] = new char[N][M];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		int notRowGuard = 0;
		int notColumnGuard = 0;
		boolean hasGuard;
		for (int i = 0; i < N; i++) {
			hasGuard = false;
			for (int j = 0; j < M; j++) {
				if (arr[i][j] == 'X') {
					hasGuard = true;
					break;
				}
			}
			if (!hasGuard) {
				notRowGuard++;
			}
		}
		for (int i = 0; i < M; i++) {
			hasGuard = false;
			for (int j = 0; j < N; j++) {
				if (arr[j][i] == 'X') {
					hasGuard = true;
					break;
				}
			}
			if (!hasGuard) {
				notColumnGuard++;
			}
		}
		System.out.println(Math.max(notRowGuard, notColumnGuard));
	}
}

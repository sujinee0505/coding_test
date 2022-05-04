package level_bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_1333 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		ArrayList<Boolean> sec = new ArrayList<Boolean>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				sec.add(true);
			}
			if (i != n - 1) {
				for (int j = 0; j < 5; j++) {
					sec.add(false);
				}
			}
		}

		int result = 0;
		while (result < sec.size()) {
			if (sec.get(result) == false) {
				break;
			}
			result += d;
		}
		System.out.println(result);
	}
}

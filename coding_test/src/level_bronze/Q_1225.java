package level_bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1225 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		long sum = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				int n = a.charAt(i) - '0';
				int m = b.charAt(j) - '0';
				sum += n * m;
			}
		}
		System.out.println(sum);
	}
}

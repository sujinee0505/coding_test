package level_bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1085 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int temp1 = Math.min((w - x), (x - 0));
		int temp2 = Math.min((h - y), (y - 0));
		int result = Math.min(temp1, temp2);
		System.out.println(result);
	}
}

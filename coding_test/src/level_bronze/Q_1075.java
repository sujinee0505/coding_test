package level_bronze;

import java.io.*;

public class Q_1075 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int f = Integer.parseInt(bf.readLine());

		int temp = (n / 100) * 100;
		while (true) {
			if (temp % f == 0) {
				int result = temp % 100;
				if (result < 10) {
					System.out.println("0" + result);
				} else {
					System.out.println(result);
				}
				return;
			}
			temp++;
		}
	}
}

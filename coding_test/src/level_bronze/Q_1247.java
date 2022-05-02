package level_bronze;

import java.io.*;
import java.math.BigInteger;

public class Q_1247 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger zero = new BigInteger("0");
		for (int i = 0; i < 3; i++) {
			BigInteger s = zero;
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				BigInteger N2 = new BigInteger(br.readLine());
				s = s.add(N2);
			}
			if (s.compareTo(zero) == -1) {
				System.out.println("-");
			} else if (s.compareTo(zero) == 1) {
				System.out.println("+");
			} else {
				System.out.println(0);
			}
		}
	}
}

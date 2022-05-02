package level_bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1252 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();

		int a[] = new int[Math.max(s1.length(), s2.length())];
		int b[] = new int[Math.max(s1.length(), s2.length())];

		int index = a.length - 1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			a[index] = s1.charAt(i) - '0';
			index--;
		}
		index = b.length - 1;
		for (int i = s2.length() - 1; i >= 0; i--) {
			b[index] = s2.charAt(i) - '0';
			index--;
		}
		int c[] = new int[a.length + 1];
		for (int i = a.length - 1; i >= 0; i--) {
			int sum = 0;
			sum = a[i] + b[i];
			if (sum > 1 && i >= 1) {
				c[i + 1] = sum % 2;
				a[i - 1]++;
			} else if (sum > 1 && i == 0) {
				c[i] = 1;
				c[i + 1] = sum % 2;
			} else {
				c[i + 1] = sum;
			}
		}
		StringBuilder sb = new StringBuilder();
		if (c[0] == 0) {
			for (int i = 1; i < c.length; i++) {
				sb.append(c[i]);
			}
		} else {
			for (int i = 0; i < c.length; i++) {
				sb.append(c[i]);
			}
		}
		System.out.println(sb);
		
		/*
		 * import java.math.BigInteger; import java.util.Scanner;
		 * 
		 * public class Main { public static void main(String[] args) { Scanner sc = new
		 * Scanner(System.in);
		 * 
		 * BigInteger b1 = sc.nextBigInteger(); BigInteger b2 = sc.nextBigInteger();
		 * 
		 * String s1 = b1.toString(); String s2 = b2.toString();
		 * 
		 * // 2진수를 10진수로 변환 BigInteger a = new BigInteger(s1, 2); BigInteger b = new
		 * BigInteger(s2, 2);
		 * 
		 * // 10진수로 변환한 두 수를 더하고 BigInteger sum = a.add(b);
		 * 
		 * // 두 수를 더한 sum의 값을 2진수로 다시 변환 String result = sum.toString(2);
		 * System.out.println(result); } }
		 */
	}
}

package ch03;

import java.io.*;

public class Q_11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine());
		for (int i = 1; i <= t; i++) {
			String s = bf.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
		}
		bw.flush();
	}
}

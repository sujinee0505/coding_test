package ch03;

import java.io.*;

public class Q_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		int n = Integer.parseInt(s.split(" ")[0]);
		int x = Integer.parseInt(s.split(" ")[1]);
		String s2 = bf.readLine();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(s2.split(" ")[i]);
			if (a < x) {
				bw.write(a + " ");
			}
		}
		bw.flush();
	}
}

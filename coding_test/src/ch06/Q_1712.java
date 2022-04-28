package ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();

		int a = Integer.parseInt(s.split(" ")[0]);
		int b = Integer.parseInt(s.split(" ")[1]);
		int c = Integer.parseInt(s.split(" ")[2]);

		if (c <= b) {
			System.out.println("-1");
		} else {
			System.out.println((a / (c - b)) + 1);
		}
	}
}

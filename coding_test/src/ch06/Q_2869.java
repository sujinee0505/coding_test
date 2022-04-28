package ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		double a = Double.parseDouble((s.split(" ")[0]));
		double b = Double.parseDouble(s.split(" ")[1]);
		double v = Double.parseDouble(s.split(" ")[2]);
		int n = (int) Math.ceil((v - a) / (a - b)) + 1;
		System.out.println(n);
	}
}

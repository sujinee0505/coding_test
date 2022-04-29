package ch07;

import java.io.*;
import java.util.*;

public class Q_2751 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(list);
		for (int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}

package ch07;

import java.io.*;
import java.util.*;

public class Q_10989 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[Integer.parseInt(br.readLine())];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);
	}

}

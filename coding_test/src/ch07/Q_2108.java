package ch07;

import java.io.*;
import java.util.Arrays;

public class Q_2108 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		Arrays.sort(arr);

		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;

		for (int i = 0; i < arr.length; i++) {
			int jump = 0; // 동일한 수가 나온만큼 i 값 jump 시킬 변수
			int count = 1;
			int i_value = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}

			if (count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			} else if (count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}

			i += jump;
		}
		System.out.println(Math.round((double) sum / arr.length));
		System.out.println(arr[arr.length / 2]);
		System.out.println(mode);
		System.out.println(arr[arr.length - 1] - arr[0]);
	}
}

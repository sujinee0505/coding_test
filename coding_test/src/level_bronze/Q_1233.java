package level_bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q_1233 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		int s3 = Integer.parseInt(st.nextToken());
		int arr[] = new int[s1*s2*s3];
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int j2 = 1; j2 <= s3; j2++) {
					arr[i + j + j2]++;
				}
			}
		}
		int max = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = i;
			}
		}
		System.out.println(result);
	}
}

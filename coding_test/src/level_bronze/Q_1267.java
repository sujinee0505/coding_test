package level_bronze;

import java.io.*;

public class Q_1267 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[t];
		String s = br.readLine();
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(s.split(" ")[i]);
		}
		int y = 0, m = 0;
		for (int i = 0; i < arr.length; i++) {
			y += ((arr[i] / 30) + 1) * 10;
			m += ((arr[i] / 60) + 1) * 15;
		}
		if (y > m)
			System.out.println("M " + m);
		else if (y < m)
			System.out.println("Y " + y);
		else
			System.out.println("Y M " + y);
	}
}

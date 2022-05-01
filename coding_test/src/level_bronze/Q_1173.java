package level_bronze;

import java.io.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1173 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int cnt = 0;
		int time = 0;
		int current = m; // 현재 맥박
		while (cnt < N) {
			if (current + T <= M) { // 운동 후 맥박이 최대 맥박 보다 낮은 경우 > 운동
				cnt++;
				time++;
				current += T; // 초기 맥박 + 운동 백박
			} else { // 운동 후 맥박이 최대 맥박 보다 높은 경우 > 휴식
				if ((current - R) < m) { // 휴식 후 맥박이 최소 맥박보다 낮은 경우
					time++;
					current = m; // 현재 맥박을 최소 맥박으로 초기화
				} else { // 휴식 후 맥박이 최소 맥박보다는 높은 경우
					time++;
					current -= R; // 현재 맥박 - 휴식 맥박
				}
			}
			if (current + T > M && current == m) {
				// 운동할 수 없는 경우 : 맥박=초기맥박 && 운동후 맥박>최대맥박
				// → 처음 시작조차 할 수 없는 경우
				System.out.println("-1");
				return;
			}
		}
		System.out.println(time);
	}
}

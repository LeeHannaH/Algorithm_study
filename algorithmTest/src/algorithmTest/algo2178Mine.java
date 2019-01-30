package algorithmTest;

import java.util.Scanner;

public class algo2178Mine {

	public static void main(String[] args) {
		
		// 맵 입력받아서 map배열에 저장
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int map[][] = new int[N+1][M+1];
		boolean isvisited[][] = new boolean[N][M];
		for(int i=1; i<=N; i++) {
			String fullLine = sc.next();
			for(int j=1; j<=M; j++) {
				map[i][j] = (int)fullLine.charAt(j-1)-48;
			}
		}
		sc.close();

		
		
		
	}
}

/*
4 6
101111
101010
101011
111011 
*/
 
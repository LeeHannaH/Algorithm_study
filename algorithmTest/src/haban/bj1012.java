package haban;

import java.util.Scanner;

public class bj1012 {
	
	static int[][] locate;
	static boolean[][] isvisited;
	static int ans = 0;
	
	static int M;
	static int N;
	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int testCase = 0; testCase < T; testCase++) {
			
			
			M = sc.nextInt(); N = sc.nextInt(); int K = sc.nextInt();
			locate = new int[M][N];
			isvisited = new boolean[M][N];
			
			for(int i=0; i<K; i++) {
				locate[sc.nextInt()][sc.nextInt()]=1;
			}
			
			for(int y=0; y<N; y++) {
				for(int x=0; x<M; x++) {
					if(locate[x][y]==1 && !isvisited[x][y]) {
						dfs(x, y);
						ans += 1;
					}
				}
			}
			
			System.out.println(ans);
			ans=0;
		}
	}
	
	static void dfs(int x, int y) {
		
		isvisited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nX = x + dx[i];
			int nY = y + dy[i];
			
			if(nX<0 || nY<0 || nX>=M || nY >=N) continue;
			
			if(locate[nX][nY]==1 && !isvisited[nX][nY]) {
				dfs(nX, nY);
			}
		}
	}
}

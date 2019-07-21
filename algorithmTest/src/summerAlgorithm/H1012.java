package summerAlgorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import summerAlgorithm.Graph.Node;

	
public class H1012 {
	
	static int[][] locate;
	static int ans = 0;
	
	static int M;
	static int N;
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	
	
	static void dfs(int x, int y) {
	
		locate[x][y] = 2;
		
		
		for(int i=0; i<4; i++) {
			int nX = x + dx[i];
			int nY = y + dy[i];
			if(nX < 0 || nY < 0 || nX >= M || nY >= N) continue;
			
			if(locate[nX][nY] == 1) {
				dfs(nX, nY);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testCase = 0; testCase < T; testCase++) {
			
			
			M = sc.nextInt(); N = sc.nextInt(); int K = sc.nextInt();
			locate = new int[M][N];
			boolean[][] isvisited = new boolean[M][N];
			
			for(int i=0; i<K; i++) {
				locate[sc.nextInt()][sc.nextInt()]=1;
			}
			
			
			for(int j=0; j<N; j++) {
				for(int i=0; i<M; i++) {
					if(locate[i][j]==1) {
						ans++;
						dfs(i, j);
					
					}
				}
			}
			
			System.out.println(ans);
			ans = 0;
			
		}
	}
}

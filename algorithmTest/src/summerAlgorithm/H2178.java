package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class mPoint{
	int x;
	int y;
	int d;
	mPoint(int x, int y, int d){
		this.x = x;
		this.y = y;
		this.d = d;
	}
}
public class H2178 {
	
	static int N;
	static int M;
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<M; j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		bfs();
	}

	private static void bfs() {
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		
		int ans = 0;
		int min = N*M;
		
		mPoint p = new mPoint(0, 0, 1);
		boolean[][] isvisited = new boolean[N][M];
		Queue<mPoint> queue = new LinkedList<mPoint>();
		
		isvisited[0][0] = true;
		queue.add(p);
		while(!queue.isEmpty()) {
			mPoint r = queue.poll();
			for(int i=0; i<4; i++) {
				int nX = r.x + dx[i];
				int nY = r.y + dy[i];
				
				if(nX<0 || nY<0 || nX>=N || nY>=M) continue;
				if(nX==(N-1)&&nY==(M-1)) {
					ans = r.d+1;
					min = Math.min(min, ans);
				}
				if(arr[nX][nY] ==1 && isvisited[nX][nY]==false) {
					isvisited[nX][nY]=true;
					queue.add(new mPoint(nX, nY, r.d+1));
				}
			}
		}
		System.out.println(min);
	}
	
	
}

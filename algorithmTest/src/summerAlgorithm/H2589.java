package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class hPoint{
	int x;
	int y;
	int distance;
	hPoint(int x, int y, int distance){
		this.x = x;
		this.y = y;
		this.distance = distance;
	}
}

public class H2589 {
	static char[][] arr;
	static int K;
	static int S;
	static int max = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		S = sc.nextInt();
		arr = new char[K][S];
		
		
		for(int i=0; i<K; i++) {
			String str = sc.next();
			for(int j=0; j<S; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<K; i++) {
			for(int j=0; j<S; j++) {
				if(arr[i][j]=='L') {
					max = Math.max(max, bfs(i, j));
				}
			}
		}
		System.out.println(max);
	}

	private static int bfs(int i, int j) {
		boolean[][] isvisited = new boolean[K][S];
		Queue<hPoint> queue = new LinkedList<hPoint>();
		isvisited[i][j] = true;
		queue.add(new hPoint(i, j, 0));
		int d = 0;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		while(!queue.isEmpty()) {
			
			hPoint point = queue.poll();
			
			for(int m=0; m<4; m++) {
				int nX = point.x + dx[m];
				int nY = point.y + dy[m];
				
				if(nX<0 || nY<0 || nX>=K || nY >=S) continue;
				if(arr[nX][nY]=='W') continue;
				if(isvisited[nX][nY]) continue;
				isvisited[nX][nY] = true;
				queue.add(new hPoint(nX, nY, point.distance+1));
				d = point.distance+1;
			}
			
		}
		return d;
		
	}
	
}

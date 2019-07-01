package algorithmTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MPOINT{
	int x, y, depth;

	MPOINT(int x, int y, int depth) {
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
}

public class algo2178Mine {

	static int N;
	static int M;
	
	public static void main(String[] args) {
		
		// 맵 입력받아서 map배열에 저장
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int map[][] = new int[N+1][M+1];
		boolean isvisited[][] = new boolean[N+1][M+1];
		for(int i=1; i<=N; i++) {
			String fullLine = sc.next();
			for(int j=1; j<=M; j++) {
				map[i][j] = (int)fullLine.charAt(j-1)-48;
			}
		}
		sc.close();

		
		bfs(new MPOINT(1,1,0));
	}
	
	static void bfs(MPOINT point){
		int x = point.x;
		int y = point.y;
		int depth = point.depth;
		
		Queue<MPOINT> queue = new LinkedList<>();
		queue.offer(point);
		
		while(x!=N||y!=M) {
			
		}
	}
	
}

/*
4 6
101111
101010
101011
111011 
*/
 
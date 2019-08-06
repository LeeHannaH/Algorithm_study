package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H1743 {
	static int[][] trash;
	static boolean[][] isvisited;
	static int sero;
	static int garo;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sero = sc.nextInt();
		garo = sc.nextInt();
		int max = 0;
		trash = new int[sero][garo];
		int trashCount = sc.nextInt();
		for(int i=0; i<trashCount; i++) {
			trash[sc.nextInt()-1][sc.nextInt()-1] = 1;
		}
		
		for(int i=0; i<sero; i++) {
			for(int j=0; j<garo; j++) {
				if(trash[i][j] == 1) {
					max = Math.max(max, howbig(i, j));
				}
			}
		}
		System.out.println(max);
	}

	private static int howbig(int i, int j) {
		Queue<trashPoint> queue = new LinkedList<trashPoint>();
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int count = 1;
		queue.add(new trashPoint(i, j));
		trash[i][j] = 0;
		
		trashPoint p = queue.peek();
		
		while(!queue.isEmpty()) {
			p = queue.poll();
			for(int k=0; k<4; k++) {
				int nX = p.i + dx[k];
				int nY = p.j + dy[k];
				
				if(nX<0 || nY<0 || nX>=sero || nY>=garo) continue;
				if(trash[nX][nY]==1) {
					count++;
					queue.add(new trashPoint(nX, nY));
					trash[nX][nY] = 0;
				}
			}
		}
		return count;
	}
}

class trashPoint{
	int i;
	int j;
	trashPoint(int i, int j){
		this.i = i;
		this.j = j;
	}
}
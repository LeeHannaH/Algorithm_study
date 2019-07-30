package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H7576 {
	static int M;
	static int N;
	static int[][] arr;
	static int bad_tomato;
	static int ans = 0;
	static Queue<tPoint> queue = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		arr = new int[N][M];
		bad_tomato = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 0) bad_tomato++;
				if(arr[i][j] == 1) queue.add(new tPoint(i, j, 1));
			}
		}
		
		if(bad_tomato != 0) checkTomato();
	
		
		System.out.println(ans);
	}
	public static void checkTomato() {
		

			boolean ok = false;
			
			int[] dx = {-1,0,1,0};
			int[] dy = {0,1,0,-1};
			tPoint temp = queue.peek();
			
			while(!queue.isEmpty()) {
				temp = queue.poll();
				for(int i=0; i<4; i++) {
					int nX = temp.i + dx[i];
					int nY = temp.j + dy[i];
					if(nX<0||nY<0||nX>=N||nY>=M) continue;
					if(arr[nX][nY] == 0) {
						arr[nX][nY] = 1;
						queue.add(new tPoint(nX, nY, temp.days+1));
						bad_tomato--;
						ok = true;
					}
				}
			}
			if(ok==false || bad_tomato == 0) {
				if(ok==false) ans =-1;
				else ans = temp.days-1;
				return;
			} else {
				checkTomato();
			}
		
	}
}

class tPoint{
	int i;
	int j;
	int days;
	tPoint(int i, int j, int days){
		this.i = i;
		this.j = j;
		this.days = days;
	}
}
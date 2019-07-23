package summerAlgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class H2468 {
	static boolean[][] temp;
	static int N;
	
	public static void main(String[] args) {
		// 입력받고 제일 큰 수를 max에 넣음
		// count[N*N]
		// for문 돌려서 i가1부터 max까지 돌리는데
		// 		이중 포문으로 전체탐색
		//		arr가 i보다 작으면 temp[][]가 2 (잠김)
		//		여기서 부터 dx, dy dfs해서 1로 바꿈 dfs다 돌면 ans++ 해서 갯수카운트(count[]에)
		// for문 나와서 가장 큰 것 syso
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int max = 0;
		int[][] arr = new int[N][N];
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
				max = Math.max(max, arr[i][j]);
			}
		}
		
		int[] count = new int[max+1];
		for(int i=0; i<=max; i++) {  // 1부터 max인줄 알았는데 기준이 0이하인것도 포함해야 맞는거였음~~~~~~~~!
			
		 temp = new boolean[N][N];
			for(int x=0; x<N; x++) {
				for(int y=0; y<N; y++) {
					if(arr[x][y] <= i) temp[x][y] = true;
				}
			}
			
			
			for(int x=0; x<N; x++) {
				for(int y=0; y<N; y++) {
					if(temp[x][y]==false) {
						dfs(x, y);
						count[i]++;
						//System.out.println("기준 : "+i + " / " +x+" , "+ y +" 에서 추가됨");
					}
				}
			}//System.out.println();
		}
		
		Arrays.sort(count);
		System.out.println(count[max]);
	}

	private static void dfs(int x, int y) {
		Stack<wPoint> stack = new Stack<wPoint>();
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		wPoint p = new wPoint(x, y);
		temp[x][y] = true;		
		stack.push(p);
		while(!stack.isEmpty()) {
			wPoint nP = stack.pop();
			for(int i=0; i<4; i++) {
				int nX = nP.x + dx[i];
				int nY = nP.y + dy[i];
				
				if(nX<0 || nY<0 || nX >=N || nY >= N) continue;
				if(temp[nX][nY]==false) {
					temp[nX][nY] = true;
					stack.push(new wPoint(nX, nY));
				}
			}
			
		}
	}
}

class wPoint{
	int x;
	int y;
	wPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
}
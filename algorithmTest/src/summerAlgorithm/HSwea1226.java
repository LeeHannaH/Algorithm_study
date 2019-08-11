package summerAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class HSwea1226 {

	static miroPoint startPoint;
	static miroPoint endPoint;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int [][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			int ans = 0;
			int testCase = sc.nextInt();
			arr = new int[16][16];
			
			for(int i=0; i<16; i++) {
				String str = sc.next();
				for(int j=0; j<16; j++) {
					arr[i][j] = str.charAt(j)-'0';
					if(arr[i][j] == 2)
						startPoint = new miroPoint(i, j);
					if(arr[i][j] == 3)
						endPoint = new miroPoint(i, j);
				}
			}
			
			System.out.println("#"+testCase+" "+dfs(startPoint));
		}
	}

	private static int dfs(miroPoint startPoint) {
		int ans = 0;
		miroPoint start = startPoint;
		boolean[][] isvisited = new boolean[16][16];
		Stack<miroPoint> stack = new Stack<>();
		
		stack.push(start);
		isvisited[start.i][start.j] = true;
		
		while(!stack.isEmpty()) {
			miroPoint p = stack.pop();
			for(int d=0; d<4; d++) {
				int nI = p.i + dx[d];
				int nJ = p.j + dy[d];
				
				if(nI < 0 || nJ < 0 || nI >= 16 || nJ >= 16) continue;
				if(arr[nI][nJ] == 1) continue;
				if(isvisited[nI][nJ] == true) continue;
				if(arr[nI][nJ] == 3) return 1;
				
				stack.push(new miroPoint(nI, nJ));
				isvisited[nI][nJ] = true;
			
		}
	}return ans;
}
}
class miroPoint{
	int i;
	int j;
	miroPoint(int i, int j){
		this.i = i;
		this.j = j;
	}
}
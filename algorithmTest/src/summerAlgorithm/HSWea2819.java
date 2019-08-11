package summerAlgorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class HSWea2819 {
	// 처음에 했던 while문 어떻게 고쳐야하는지
	static Set<String> set = new HashSet<>();
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};
	static String[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=1; t<=testCase; t++) {
			set.clear();
			int ans = 0;
			int val = 0;
			arr = new String[4][4];
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					arr[i][j] = sc.next();
				}
			}
			
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					dfs(i, j, 0, arr[i][j]);
				}
			}
			
			System.out.println("#"+t+" "+set.size());
		}
	}
	
	private static void dfs(int i, int j, int cnt, String val) {

		if(cnt == 6) {
			set.add(val);
			return;
		}else {
			for(int d=0; d<4; d++) {
				int nI = i + dx[d];
				int nJ = j + dy[d];
				if(nI<0||nJ<0||nI>=4||nJ>=4) continue;
				
				dfs(nI, nJ, cnt+1, val+arr[nI][nJ]);
			}
		}
	}
}

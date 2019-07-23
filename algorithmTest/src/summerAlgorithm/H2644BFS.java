package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H2644BFS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int from = sc.nextInt();
		int to = sc.nextInt();
		int m = sc.nextInt();
		int[][] fromto = new int[101][101];
		int[] depth = new int[101];
		for(int k=0; k<m; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			fromto[i][j] = fromto[j][i] = 1;
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(from);
		while(!queue.isEmpty()) {
			int a = queue.poll();
			for(int i=1; i<=N; i++) {
				if(fromto[a][i] == 1 && depth[i]==0) {
					depth[i]=depth[a]+1;
					queue.add(i);
				}
			}
		}
		System.out.println(depth[to]==0?-1:depth[to]);
	}
}

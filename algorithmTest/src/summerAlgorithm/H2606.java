package summerAlgorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class H2606 {
	
	static int C;
	static int[][] edge;
	static Set<Integer> set = new HashSet<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		int N = sc.nextInt();
	
		edge = new int[C+1][C+1];
		for(int i=0; i<N; i++) {
			int a = sc.nextInt(); int b = sc.nextInt();
			edge[a][b] = edge[b][a] = 1;
		}
		virus(1);
		System.out.println(set.size()-1);
	}

	public static void virus(int i) {
		set.add(i);
		for(int j=1; j<=C; j++) {
			if(edge[i][j]==1) {
				edge[i][j]=edge[j][i]=2;
				virus(j);
			}
		}
	}
}

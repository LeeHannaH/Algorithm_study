package summerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class H1932 {
	static int[][] arr;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		dp(1);
		
		Arrays.sort(arr[N-1]);
		System.out.println(arr[N-1][N-1]);
	}

	private static void dp(int i) {
		if(i>=N) return;
		
		// arr[1][0] = arr[0][0] + arr[1][0] // arr[1][1] = arr[0][0] + arr[1][1]
		// arr[2][0] = arr[1][0] + arr[2][0] // arr[2][1] = min(arr[1][0], arr[1][1]) + arr[2][1] // arr[2][2] = arr[1][1] + arr[2][2]
		
		for(int d=0; d<=i; d++) {
			if(d==0)
				arr[i][0] = arr[i-1][0]+arr[i][0];
			else if(d==i)
				arr[i][d] = arr[i-1][d-1]+arr[i][d];
			else
				arr[i][d] = Math.max(arr[i-1][d-1], arr[i-1][d])+arr[i][d];
			
		}
	
		dp(i+1);
	}
}

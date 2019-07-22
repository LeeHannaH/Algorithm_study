package summerAlgorithm;

import java.util.Scanner;

public class Hdia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testcase=0; testcase<T; testcase++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int j=0; j<N; j++) {
					arr[i][j] = str.charAt(j)-'0';
				}
			}
			
		
		int midIndex = N/2;
		int ans = 0;
		for(int i=0; i<=midIndex; i++) { // i=2
			ans += arr[i][midIndex];
			for(int j=1; j<i+1; j++) { // j= 1 2 
				ans = ans + arr[i][midIndex+j] + arr[i][midIndex-j];
			}
		}
		for(int i=midIndex+1; i<N; i++) {
			ans += arr[i][midIndex];
			for(int j=(N-i)-1; j>0; j--) { // j= 2 1
				ans = ans + arr[i][midIndex+j] + arr[i][midIndex-j];
			}
		}
				
			System.out.println("#"+(testcase+1)+" "+ans);
			
		}
	}
}

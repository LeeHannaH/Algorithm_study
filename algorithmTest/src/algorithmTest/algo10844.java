package algorithmTest;

import java.util.Scanner;

public class algo10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long dp[][] = new long[11][101];
		
		dp[0][1] = 0;
		for(int j=1; j<=9; j++) {
			dp[j][1] = 1;
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=0; j<=9; j++) {
				dp[j][i] = 0;
				if(j==0) dp[0][i] = dp[1][i-1];
				else if(j==9) dp[9][i] =dp[8][i-1];
				else dp[j][i] = dp[j-1][i-1] + dp[j+1][i-1];
				
				dp[j][i] %= 1000000000; //숫자가 너무 커서 오버플로우, 미리 나눈 값을 저장한다.
			}
		}
		
		long sum = 0;
		for(int i=0; i<=9; i++) {
			sum += dp[i][N];
		}
		System.out.println(sum%1000000000);
	}

}

package algorithmTest;

import java.util.Scanner;

public class algo2293 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int coin_count = sc.nextInt();
		int sum = sc.nextInt();
		
		int coin[] = new int[coin_count];
		int dp[] = new int[sum+1];
		
		for(int i=0; i<coin_count;i++) {
			coin[i] = sc.nextInt();
		}
		sc.close();
		
		dp[0] = 1;
		for(int i=0; i<coin_count; i++) {
			for(int j=coin[i]; j<=sum; j++) {
				dp[j] += dp[j-coin[i]];
			}
		}
		
		System.out.println(dp[sum]);
	}

}

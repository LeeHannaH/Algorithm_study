package algorithmTest;

import java.util.Scanner;

public class algo2579 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int stair[] = new int[300];
		int sum[] = new int[300];
		for(int i=0; i<num; i++) {
			stair[i] = sc.nextInt();
		}
		sc.close();
		
		sum[0] = stair[0];
		sum[1] = Math.max(stair[0]+stair[1], stair[1]);
		sum[2] = Math.max(stair[1]+stair[2], stair[2]+stair[0]);
		
		for(int n=3; n<num; n++) {
			sum[n] = Math.max(stair[n]+stair[n-1]+sum[n-3], stair[n]+sum[n-2]);
		}

		System.out.println(sum[num-1]);
	}

}

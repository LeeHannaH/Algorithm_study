package summerAlgorithm;

import java.util.Scanner;

public class HSwea1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 1; t<=10; t++) {
			int testCase = sc.nextInt();
			int[][] arr = new int[100][100];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int max = 0; 
			
			// 행, 열
			for(int i=0; i<100; i++) {
				int hsum = 0;
				int ysum = 0;
				for(int j=0; j<100; j++) {
					hsum+=arr[i][j]; 
					ysum+=arr[j][i];
				}
				max =Math.max(max, Math.max(ysum, hsum));
			}
			
			// 대각선
			int lsum = 0;
			int rsum = 0;
			for(int i=0; i<100; i++) {
				lsum+=arr[i][i]; 
				rsum+=arr[99-i][99-i];
			}
			max = Math.max(max, Math.max(rsum, lsum));
			
			System.out.println("#"+testCase+" "+max);
			
		}
	}
}

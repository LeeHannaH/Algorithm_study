package summerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class H1182 {
	/*
5 0
-7 -3 -2 5 8 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int S = sc.nextInt();
		int arr[] = new int[n];
		 for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
		int ans = 0;
		// 비트마스크 써서 모든 경우의 수 출력
		// 그 인덱스들의 합이 S가 되면 cnt++
		
		for(int i=0; i<(1<<n); i++) {
			if(Integer.bitCount(i)>0) {
				int sum=0;
				for(int j=0; j<n; j++) {
					if(((1<<j)&i)>0) {
						sum += arr[j];
					}
				}
				if(sum == S) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);


	}
}

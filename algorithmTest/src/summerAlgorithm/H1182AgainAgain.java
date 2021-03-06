package summerAlgorithm;

import java.util.Scanner;

public class H1182AgainAgain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0;
	
		for(int i=0; i<(1<<N);i++) {
			int sum = 0;
			if(Integer.bitCount(i)>0) {
				for(int j=0; j<N; j++) {
					if((i&(1<<j))>0) {
						sum += arr[j];
					}
				}
				if(sum == S) cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}

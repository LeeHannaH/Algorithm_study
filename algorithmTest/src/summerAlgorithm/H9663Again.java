package summerAlgorithm;

import java.util.Scanner;

public class H9663Again {
	static int N;
	static int[] arr;
	static int ans=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		//arr[i] = j : i행 j열에 퀸이 있음
		
		Queen(0);
		System.out.println(ans);
	}

	private static void Queen(int i) {
		if(i==N) ans++;
		else {
			for(int j=0; j<N; j++) {
				arr[i] = j;
				if(check(i)) {
					Queen(i+1);
				}
			}
		}
	}

	private static boolean check(int i) {
		for(int j=0; j<i; j++) { //대각선,행열에 있으면
			if(arr[i] == arr[j] || Math.abs(arr[i]-arr[j])==i-j) {
			return false;
			}
		}
		return true;
	}
}

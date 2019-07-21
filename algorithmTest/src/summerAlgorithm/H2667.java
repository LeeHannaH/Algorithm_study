package summerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class H2667 {
	
	static int[][] arr;
	static int[] ans;
	static int count = 0;
	static int N;
	
	static void apart(int x, int y) {
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i=0; i<4; i++) {
			int nX = x + dx[i];
			int nY = y + dy[i];
			
			if(nX<0 || nY<0 || nX >=N || nY >= N) continue;
			
			if(arr[nX][nY] ==1) {
				arr[nX][nY] = 2;
				ans[count] ++;
				apart(nX, nY);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		ans = new int[N*N];
		
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<N; j++) {
				arr[j][i] = str.charAt(j)-'0'; 
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[j][i]==1) {
					arr[j][i] = 2;
					apart(j, i);
					count++;
				}
			}
		}
		
		// 이 부분 질문!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 배열 크기 못정할 때 어케 해야함 도대쳉
		
		int[] result = new int[count];
		for(int i=0; i<count; i++) {
			result[i] = ans[i]+1;
		}
		Arrays.sort(result);
		
		System.out.println(count);
		for(int a : result) {
			System.out.println(a);
		}
		
	}
}

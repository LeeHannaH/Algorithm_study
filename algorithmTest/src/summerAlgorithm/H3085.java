package summerAlgorithm;

import java.util.Scanner;

public class H3085 {
	static int n;
	static char[][] arr;
	static int max;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new char[n][n];
		for(int i=0; i<n; i++) {
			String str = sc.next();
			for(int j=0; j<n; j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		
		// 우,하 바꾸고 
		// 찾는 함수
		// 다시 돌려놓기
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				// 우 바꾸기
				char temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
				// 긴거찾기
				find();
				// 되돌리기
				temp = arr[i][j+1];
				arr[i][j+1] = arr[i][j];
				arr[i][j] = temp;
				
				// 하 바꾸기
				temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
				// 긴거찾기
				find();
				// 되돌리기
				temp = arr[j+1][i];
				arr[j+1][i] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		System.out.println(max);
	}
	
	static void find() {
		
		// 행에서 찾기
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n-1; j++) {
				if(arr[i][j] == arr[i][j+1]) {
					cnt++;
				}else {
					max = max(cnt, max);
					cnt = 1;
				}
			}
			max = max(cnt, max);
		}
		// 열에서 찾기
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n-1; j++) {
				if(arr[j][i] == arr[j+1][i]) {
					cnt++;
				}else {
					max = max(cnt, max);
					cnt = 1;
				}
			}
			max = max(cnt, max);
		}
	}
	static int max(int a, int b) {
		return a > b ? a : b;
	}
}

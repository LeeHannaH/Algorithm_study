package summerAlgorithm;

import java.util.Scanner;

public class HSwea1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			
			int N = sc.nextInt();
			char[][] arr = new char[8][8];
			for(int i=0; i<8; i++) {
				String str = sc.next();
					arr[i] = str.toCharArray();
			}
			
			// N = 4 : 0 1 2 3 -> 0-3, 1-2 (N/2개)
			// N = 5 : 0 1 2 3 4 -> 0-4, 1-3 (N/2개)
			int ans = 0;
			
			int point;
			if(N%2==0) {
				point = N/2;
			}else {
				point = N/2+1;
			}
			for(int i=0; i<8; i++) {
				for(int j=0; j<=8-N; j++) {
					// 오른쪽
					if(arr[i][j] == arr[i][j+N-1]) {
						for(int k=1; k<point; k++) {
							if(arr[i][j+k] == arr[i][j+N-1-k]) {
								if(k+1==point) ans++;
							}else break;
						}
					}
					// 아래
					if(arr[j][i] == arr[j+N-1][i]) {
						for(int k=1; k<point; k++) {
							if(arr[j+k][i] == arr[j+N-1-k][i]) {
								if(k+1==point) ans++;
							}else break;
						}
					}
					
				}
			}
			
		
			System.out.println("#"+t+" "+ans);
		}
	}
}

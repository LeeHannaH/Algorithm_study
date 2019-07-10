package summerAlgorithm;

import java.util.Scanner;

public class H1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int j=0; j<10; j++) { // testCase
			int apart = sc.nextInt();
			int[] arr = new int[apart];
			for(int i=0; i<apart; i++) {
				arr[i] = sc.nextInt();
			}
			
			int ans = 0;
	
			// 좌2개 우2개 중에 제일 큰거 .. 를 어케 찾지 
			// 만약 i일때 임시 arr만들어서 좌2우2개 넣고 
			// 이걸 for문돌려서 max를 찾으면 될듯
			
			for(int i=0; i<apart; i++) {
				int max = 0;
				for(int k=i-2; k<=i+2; k++) {
					if(k==i) continue; // 현재 i면 패스
					if(i>1&&i<apart-2) { // 양끝인 0,1, n-2,n-1 패스
					max = Math.max(max,arr[k]);
					}
				}
				if(arr[i]-max>0) {
					ans += (arr[i]-max);
				}
				
			}
			// 현재꺼 - 좌2개 우2개 중에 제일 큰거 > 0 이면
			// 답 += 현재꺼 - 좌2개 우2개 중에 제일 큰거
			
			System.out.println("#"+(j+1)+" "+ans);
			
		}
	}
}

//12
//0 0 3 5 2 4 9 0 6 4 0 6 0 0

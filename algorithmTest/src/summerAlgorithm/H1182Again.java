package summerAlgorithm;

import java.util.Scanner;

public class H1182Again {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		
		
		
		for(int i=0; i<(1<<N); i++) { // bit로 바꿔서
		  int sum = 0;
			if(Integer.bitCount(i)>0) { // 1개 이상 선택하면
				for(int j=0; j<N; j++) { // N개 중 i개를 고른 상태 - 어떤걸 골랐는지 알아내야함
					if((i&(1<<j))>0) { // 1 하나씩 옮겨가면서 1이 나오는 index 찾기 
						sum += arr[j]; // 해당 index값을 sum에 더함
					}
				}
				if(sum==S) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}

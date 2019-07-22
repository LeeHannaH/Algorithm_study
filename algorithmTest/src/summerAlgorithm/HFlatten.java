package summerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class HFlatten {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int T=0; T<10; T++) {
			int N = 100;
			int dumpCount = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			for(int i=0; i<dumpCount; i++) {
				arr[N-1] -= 1; arr[0] += 1;
				Arrays.sort(arr);
			}
			
			System.out.println("#"+(T+1)+" " +(arr[N-1]-arr[0]));
		}
	}
}

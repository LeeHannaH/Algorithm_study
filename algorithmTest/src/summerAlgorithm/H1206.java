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
			
			for(int i=0; i<apart; i++) {
				
				int maxNeigh = 0;
				
						if(maxNeigh < arr[i-2]) {
							maxNeigh = arr[i-2];
						}
						if(maxNeigh < arr[i-1]) {
							maxNeigh = arr[i-1];
						}
			
						if(maxNeigh < arr[i+1]) {
							maxNeigh = arr[i+1];
						}
						if(maxNeigh < arr[i+2]) {
							maxNeigh = arr[i+2];
						}
						
					if(arr[i]-maxNeigh >0) {
						ans += arr[i]-maxNeigh;
					}
				
			}
			System.out.println("#"+(j+1)+" "+ans);
		}
	}
}

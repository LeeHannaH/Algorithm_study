package summerAlgorithm;

import java.util.Scanner;

public class HSwea3431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=0; t<testCase; t++) {
			int ans=0;
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			if(X<L) {
				ans = L-X;
			}else if(X>U) {
				ans = -1;
			}
			
			System.out.println("#"+(t+1)+" "+ans);
		}
	}
}

package summerAlgorithm;

import java.util.Scanner;

public class HSwea1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int ans = 0;
			String str = sc.next();
			
			int current = 0;
			for(int i=0; i<str.length();i++) {
				int now = ((int)str.charAt(i)-48);
				if(now != current) {
					ans++;
					current = now;
				}
			}
			
			
			System.out.println("#"+t+" " +ans);
		}
	}
}

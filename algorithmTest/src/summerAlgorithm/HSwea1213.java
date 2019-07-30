package summerAlgorithm;

import java.util.Scanner;

public class HSwea1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			int ans = 0;
			int testCase = sc.nextInt();
			String standard = sc.next();
			String str = sc.next();
			
			for(int i=0; i<=str.length()-standard.length();i++) {
				if(str.substring(i, i+standard.length()).equals(standard)) ans++;
			}
			
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

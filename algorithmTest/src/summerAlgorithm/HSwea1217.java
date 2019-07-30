package summerAlgorithm;

import java.util.Scanner;

public class HSwea1217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			int ans = 0;
			int testCase = sc.nextInt();
			int num = sc.nextInt();
			int count = sc.nextInt();
			
			ans = recur(num, count);
			
			System.out.println("#"+testCase+" "+ans);
		}
	}

	private static int recur(int num, int count) {
		if(count==0) return 1;
		return num * recur(num, --count);
	}
}

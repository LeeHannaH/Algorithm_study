package summerAlgorithm;

import java.util.Scanner;

public class H10872Recur {
	
	static int fac(int N) {
		if(N==0 || N==1) return 1;
		return N*fac(N-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fac(N));
	}
}

package algorithmTest;

import java.util.Scanner;

public class algo2775 {
	
	static int cal(int k, int n) {
		int array[][] = new int[15][15];
		 
		for(int i=1; i<=14; i++) {
			array[0][i] = i;
		}
		
		for(int i=1; i<=14;i++) {
			array[i][1] = 1;
			for(int j=2; j<=14; j++) {
				array[i][j] = array[i][j-1] + array[i-1][j];
			}
		}
		return array[k][n];
	}
	
	public static void main(String[] args) {
		
		int k =0,n =0;
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			k = sc.nextInt();
			n = sc.nextInt();
			
			System.out.println(cal(k,n));
		}
	}

}

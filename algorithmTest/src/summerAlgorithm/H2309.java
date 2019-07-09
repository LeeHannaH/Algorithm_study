package summerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class H2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nan = new int[9];
		int a = 0, b = 0;
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			nan[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(nan);
		
		for(int n:nan) {
			sum += n;
		}
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum - nan[i] - nan[j]==100) {
					a = i; b = j;
					break;
				}
			}
		}

		for(int i=0; i<9; i++) {
			if(i!=a && i!=b) {
				System.out.println(nan[i]);
			}
		}
		
	}

}

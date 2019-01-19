package algorithmTest;

import java.util.Scanner;

public class algo1978 {

	static boolean isSosu(int n) {
		
		if(n<2) return false;
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		int sosu_count = 0;
		int[] array = new int[1000];
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		for(int i=0; i<total; i++) {
			array[i] = sc.nextInt();
			if(isSosu(array[i])) sosu_count ++;
		}
		sc.close();

		System.out.println(sosu_count);
	}
}

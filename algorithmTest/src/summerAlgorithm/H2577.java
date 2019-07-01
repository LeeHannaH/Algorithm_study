package summerAlgorithm;

import java.util.Scanner;

public class H2577 {
	public static void main(String[] args) {
		int A, B, C;
		int sum;
		int[] num = new int[10];
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		sum = A*B*C;
		String sumWord = Integer.toString(sum);
		
		for(int i=0; i<num.length; i++) {
			num[i] = 0;
		}
		
		for(int i=0; i<sumWord.length(); i++) {
			num[(int)sumWord.charAt(i)-48]++;
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}

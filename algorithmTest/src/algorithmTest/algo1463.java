package algorithmTest;

import java.util.Scanner;

public class algo1463 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		
		int minNum[] = new int[N+1];
		
		minNum[0] = minNum[1] = 0;
		
		for(int i=2; i<=N; i++) {
			minNum[i] = minNum[i-1]+1;
			if(i%2==0) {
				minNum[i] = Math.min(1+minNum[i/2],minNum[i]);
			}
			if(i%3==0){
				minNum[i] = Math.min(1+minNum[i/3],minNum[i]);
			}
		}
		
		System.out.println(minNum[N]);
		sc.close();
	}
}

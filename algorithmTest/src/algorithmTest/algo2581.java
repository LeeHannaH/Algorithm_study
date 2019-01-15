package algorithmTest;

import java.util.Scanner;

public class algo2581 {

	static boolean isSosu(int n) {
		
		if(n<2) return false;
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {

		int array[] = new int[10000];
		int array_count = 0;
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		for(int i=M; i<=N; i++) {
			if(isSosu(i)) {
				array[array_count] = i;
				array_count++;
			}
		}
		
		int temp;
		int sum = 0;
		for(int i=0; i<array_count; i++) {
			sum += array[i];
			for(int j=i+1; j<array_count; j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		
		if(array_count==0) {System.out.println("-1");}
		else {
		System.out.println(sum);
		System.out.println(array[0]);
		}
		
		
	}

}

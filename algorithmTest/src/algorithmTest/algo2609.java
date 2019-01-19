package algorithmTest;

import java.util.Scanner;

public class algo2609 {
	
	static int[] minAndMax(int S) {
		
		int i=2;
		int array[] = new int[10];
		int count = 1;
		
		do {
			if(S%i==0) {
				S=S/i;
				array[count]=i;
				count++;
			}else {
				i++;
			}
		}while(S>=i);
		
		array[0]=count;
		
		return array;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		int arrayN[] = minAndMax(N);
		int arrayM[] = minAndMax(M);
				
		int max=1; // 최대공약수
		int min=1; // 최소공배수
		for(int i=1; i<arrayN[0]; i++) {
			for(int j=1; j<arrayM[0]; j++) {
				if(arrayN[i]==arrayM[j]) {
					max *= arrayN[i];
					arrayN[i] = 1;
					arrayM[j] = 1;
				}
			}
		}
		
		for(int i=1; i<arrayN[0]; i++) {
			min *= arrayN[i];
		}
		for(int i=1; i<arrayM[0]; i++) {
			min *= arrayM[i];
		}
		
		System.out.println(max);
		System.out.println(min*max);
	}

}

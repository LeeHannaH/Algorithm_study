package algorithmTest;

import java.util.Scanner;

public class algo2750 {
	
	public static void main(String[] args) {
		
		int array[] = new int[1000];
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		int countNum = sc.nextInt();
		for(int i=0; i<countNum; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<countNum; i++) {
			for(int j=i+1; j<countNum; j++) {
				if(array[i]>array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}			
		}
		
		for(int i=0; i<countNum; i++) {
			System.out.println(array[i]);
		}
		
	}

}

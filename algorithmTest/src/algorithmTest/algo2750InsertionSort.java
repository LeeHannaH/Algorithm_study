package algorithmTest;

import java.util.Scanner;

public class algo2750InsertionSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int array[] = new int[count];
		for(int i=0; i<count; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		int temp=0;
		int j=0;
		for(int i=1; i<array.length; i++) {
			temp = array[i];
			for(j=i-1; j>=0 && temp<array[j]; j--) {
					array[j+1] = array[j];
			}array[j+1] = temp;
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}

package algorithmTest;

import java.util.Scanner;

public class algo2750BubbleSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int array[] = new int[count];
		for(int i=0; i<count; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		int temp;
		
		for(int i=0; i<array.length-1;i++) {
			for(int j=1; j<array.length-i;j++) {
				if(array[j-1]>array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int a : array) {
			System.out.print(a+" ");
		}
	}
}

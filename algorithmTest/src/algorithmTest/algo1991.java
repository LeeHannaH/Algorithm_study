package algorithmTest;

import java.util.Scanner;

public class algo1991 {
	
	static int count;
	
	static void pre(String array[][], int root) {
		System.out.print(array[root][0]);
		for(int i=0; i<count; i++) {
			if(array[root][1].equals(array[i][0])) {
				pre(array, i);
			}
		}
		for(int i=0; i<count; i++) {
			if(array[root][2].equals(array[i][0])) {
				pre(array, i);
			}
		}
	}
	
	static void post(String array[][], int root) {

		
		for(int i=0; i<count; i++) {
			if(array[root][1].equals(array[i][0])) {
				post(array, i);
				System.out.print(array[i][0]);
			}
		}
		for(int i=0; i<count; i++) {
			if(array[root][2].equals(array[i][0])) {
				post(array, i);
				System.out.print(array[i][0]);
			}
		}
		if(root==0) {
			System.out.print(array[root][0]);
		}
	}
	
	static void in(String array[][], int root) {
		
		for(int i=0; i<count; i++) {
			if(array[root][1].equals(array[i][0])) {
				in(array, i);
			}
		}
		
		System.out.print(array[root][0]);
		
		for(int i=0; i<count; i++) {
			if(array[root][2].equals(array[i][0])) {
				in(array, i);
			}
		}
	}
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		String array[][] = new String[count][3];
		
		for(int i=0; i<count; i++) {
			for(int j=0; j<3; j++) {
				array[i][j] = sc.next();
			}
		}
		sc.close();
		
		pre(array, 0);
		System.out.println();
		in(array,0);
		System.out.println();
		post(array,0);
		
		
	}
}

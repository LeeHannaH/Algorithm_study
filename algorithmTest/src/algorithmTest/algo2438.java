package algorithmTest;

import java.util.Scanner;

public class algo2438 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		
		for(int i=0; i<count; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}

package algorithmTest;

import java.util.Scanner;

public class algo10809 {
	
	public static void main(String[] args) {
		
		int array[] = new int[26];
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		
		for(int i=0; i<array.length; i++) {
			array[i]=-1;
		}
		
		for(int i=0; i<S.length(); i++) {
			if(array[(int)S.charAt(i)-97]==-1) {
				array[(int)S.charAt(i)-97]=i;
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print (array[i]+" ");
		}
		
	}

}

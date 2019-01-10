package algorithmTest;

import java.util.Scanner;

public class algo11721 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        
        for(int i=0; i<input.length(); i++) {
        	
        	if(i%10==0&&i!=0) {
        		System.out.println();
        	}
        	System.out.print(input.charAt(i)); 
        }
	}

}

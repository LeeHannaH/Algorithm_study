package summerAlgorithm;

import java.util.Scanner;

public class HSwea7272 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=1; t<=testCase; t++) {
			String ans = "DIFF";
			
			String str1 = sc.next();
			String str2 = sc.next();
			
			if(cou(str1, str2)) ans = "SAME";
			
			System.out.println("#"+t+" "+ans);
		}
	}

	
	private static boolean cou(String str1, String str2) {
		if(str1.length()!=str2.length()) return false;
		for(int i=0; i<str1.length(); i++) {
			if(swi(str1.charAt(i))!=swi(str2.charAt(i))){
				return false;
			}
		}
		return true;
	}


	private static int swi(char ch) {
		int count = 0;
		switch(ch) {
		case 'A':
		case 'D':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
			count = 1;
			break;
		case 'B':
			count = 2;
			break;
		}
		return count;
	}
}

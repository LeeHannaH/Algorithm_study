package summerAlgorithm;

import java.util.Scanner;

public class H369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		boolean three = false;
		
		for(int i=1; i<=input; i++) {
			
			String s = Integer.toString(i);
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)%3==0 && s.charAt(j)!='0') {
					System.out.print("-");
					three = true;
				}
			}
			if(three) {
				three = false;
			}else{
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
}

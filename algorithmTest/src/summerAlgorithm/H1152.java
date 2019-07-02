package summerAlgorithm;

import java.util.Scanner;

public class H1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sc.close();		
		
		int ans = 0;
		
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i)==' ' && i!=0 && i!=sentence.length()-1) {
				ans ++;
			}
		}
		
		if(sentence.length()!=1) ans++;
		System.out.println(ans);
	}
}

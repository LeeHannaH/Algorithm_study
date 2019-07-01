package summerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class H1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		int[] words = new int[30];
		
		int max = 0;
		char ans = ' ';
	
		for(int i=0; i<word.length(); i++) {
			words[word.charAt(i)-65] ++;
			if(max < words[word.charAt(i)-65]) {
				ans = word.charAt(i);
				max = words[word.charAt(i)-65];
			}else if(max == words[word.charAt(i)-65]) {
				ans = '?';
			}
		}

		System.out.println();
		System.out.println("answer : "+ans);
	}
}

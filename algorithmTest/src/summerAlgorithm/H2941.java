package summerAlgorithm;

import java.util.Scanner;

public class H2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		int count = 0;
		int wordCount = 0;

		do {
			char next;
			if(count==sentence.length()-1) {
				count++;
				wordCount++;
				break;
			}else {
				next = sentence.charAt(count+1);
			}
			switch (sentence.charAt(count)) {
			case 'c':
				if(next == '=' || next == '-') {
					count++;
				}
				count++;
				wordCount++;
				break;
			case 'd':
				if(next == 'z' && sentence.charAt(count+2)=='=') {
					count +=2;
				}else if(next == '-') {
					count++;
				}
				count++;
				wordCount++;
				break;
			case 'n':
			case 'l':
				if(next == 'j') {
					count++;
				}
				count++;
				wordCount++;
				break;
			case 's':
			case 'z':
				if(next == '=') {
					count++;
				}
				count++;
				wordCount++;
				break;

			default:
				count++;
				wordCount++;
				break;
			}
		}while(count < sentence.length());
		
		System.out.println(wordCount);
	}
}

package summerAlgorithm;

import java.util.Scanner;

public class H2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			String word = sc.next();
			
			//String.substring(start) //문자열  start위치부터 끝까지 문자열 자르기
			//String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌
			int ans = 0;
			String start;
			String next;	
			
			for(int j=1; j<=10; j++) {
				start = word.substring(0, j);
				next = word.substring(j, j+j);
				if(start.equals(next)) {
					ans = j;
					break;
				}
			}
			

			System.out.println("#"+(i+1)+" "+ans);
		}
	}
}

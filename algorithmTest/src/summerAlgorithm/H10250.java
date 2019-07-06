package summerAlgorithm;

import java.util.Scanner;

public class H10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ca = sc.nextInt();
		String[] ans = new String[ca];
		for(int i=0; i<ca; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			String last = Integer.toString(N%H);
			String or = Integer.toString(N/H+1);
			
			if(last.equals("0")) {
				last = Integer.toString(H);
				or = Integer.toString(N/H);
			}
			

			if(or.length() ==1) {
				or = "0"+or;
			}
			
			ans[i] = last+or;
		}
		for(String ho : ans) {
			System.out.println(ho);
		}
	}
}

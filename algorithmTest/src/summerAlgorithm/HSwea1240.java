package summerAlgorithm;

import java.util.Scanner;

public class HSwea1240 {
	
	public static int isitNumber(String num) {
		int realnum;
		
		switch(num) {
		 case "0001101" : 
			 realnum = 0; break;
		 case "0011001" : 
			 realnum = 1; break;
		 case "0010011" : 
			 realnum = 2; break;
		 case "0111101" : 
			 realnum = 3; break;
		 case "0100011" : 
			 realnum = 4; break;
		 case "0110001" : 
			 realnum = 5; break;
		 case "0101111" : 
			 realnum = 6; break;
		 case "0111011" : 
			 realnum = 7; break;
		 case "0110111" : 
			 realnum = 8; break;
		 case "0001011" : 
			 realnum = 9; break;
		 default : 
			 realnum = -1; break;
		}
		
		return realnum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=1; t<=testCase; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][M];
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int j=0; j<M; j++) {
					arr[i][j] = str.charAt(j)-'0';
				}
			}
			
			int ansCount = 0;
			int[] ans = new int[8];
			
			
			for(int i=0; i<N; i++) {
				int count = 0;
				if(ansCount==8) break;
				String[] temp = new String[7];
				for(int j=M-1; j>=0; j--) {
					if(arr[i][j]!=1 && count == 0) continue;
					if(ansCount==8) break;
					if(count == 7) {
						String str = temp[0]+temp[1]+temp[2]+temp[3]+temp[4]+temp[5]+temp[6];
						if(isitNumber(str)==-1) break;
						else {
							ans[7-ansCount] = isitNumber(str);
							ansCount++;
							count=0;
						}
					}
					temp[6-count] = arr[i][j]+"";
					count++;
				}
			}//substring
			
			
			if(((ans[0]+ans[2]+ans[4]+ans[6])*3+ans[1]+ans[3]+ans[5]+ans[7]) % 10 == 0) {
					int sum = 0;
				for(int i=0; i<ans.length; i++) {
					sum += ans[i];
				}
				System.out.println("#"+t+" "+sum);
			}else {
				System.out.println("#"+t+" "+0);
			}
			
		}
	}
}

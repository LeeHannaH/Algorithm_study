package summerAlgorithm;

import java.util.Scanner;

public class HSushiDoor1216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			int ans = 0;
			int max = 0;
			int testCase = sc.nextInt();
			char[][] arr = new char[100][100];
			for(int i=0; i<100; i++) {
				String str = sc.next();
				arr[i] = str.toCharArray();
			}

			boolean find = false;
			int templength = 100;
			while(templength>1 && find == false) {
			// 어차피 큰거 찾는거면 제일 긴 길이부터 찾아서 찾으면 바로 끝
			for(int i=0; i<100; i++) {//행
				for(int j=0; j<=100-templength; j++) {//열
					String a = ""; String b = "";
					for(int c=j; c<j+templength/2; c++) {
						a += arr[i][c];
						if(templength%2==0)
							b += arr[i][c+templength/2];
						else
							b += arr[i][c+templength/2+1];
					}

					b = new StringBuffer(b).reverse().toString();
					
					if(a.equals(b)) {
						max = Math.max(max, templength);
						find=true;
						break;
					}
				}
				
			}
			
			for(int i=0; i<100; i++) {//열
				for(int j=0; j<=100-templength; j++) {//행
					String a = ""; String b = "";
					for(int c=j; c<j+templength/2; c++) {
						a += arr[c][i];
						if(templength%2==0)
							b += arr[c+templength/2][i];
						else
							b += arr[c+templength/2+1][i];
					}

					b = new StringBuffer(b).reverse().toString();
					
					if(a.equals(b)) {
						max = Math.max(max, templength);
						find=true;
						break;
					}
				}
				
			}
			
			templength--;
			}
			
			
			System.out.println("#"+testCase+" "+max);
		}
	}
}

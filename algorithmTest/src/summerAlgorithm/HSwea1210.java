package summerAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class HSwea1210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=0; t<10; t++) {
			int testCase = sc.nextInt();
			int ans = 0;
			int[][] ladder = new int[100][100];
			boolean[][] isvisited = new boolean[100][100];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					ladder[i][j] = sc.nextInt();
				}
			}
			
			// 2인곳에서 부터 시작 // ladder[99][i] for문 돌려서 2인 i 구하기
			// if 좌에 1이 있다 && 좌가 0보다 크거나 같다
			//	ladder[][-1] / isvisited = true; // continue;
			// if 우에 1이 있다 && 우가 99보다 작거나 같다
			//  ladder[][+1]/ isvisited = true; // continue;
			// ladder[-1][] / isvisted = true;
			// if(ladder[0][x] -> ans = x)
			int y = 0; 
			for(int i=0; i<100; i++) {
				if(ladder[99][i] == 2) {
					y = i;
					break;
				}
			}
			
			int currentX = 99;
			int currentY = y;
			
			while(true) {

				if((currentY-1)>=0 && ladder[currentX][currentY-1]==1 && isvisited[currentX][currentY-1] == false) {
					currentY -= 1;
					isvisited[currentX][currentY] = true;
					continue;
				}
				if((currentY+1)<=99 && ladder[currentX][currentY+1]==1 && isvisited[currentX][currentY+1] == false) {
					currentY += 1;
					isvisited[currentX][currentY] = true;
					continue;
				}
				
				currentX -= 1;
				isvisited[currentX][currentY] = true;
				
				if(currentX == 0) {
					ans = currentY;
					break;
				}
			}
			
			System.out.println("#"+testCase+" "+ans);
		}
	}
}
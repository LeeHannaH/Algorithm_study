package summerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class HSwea1860 {
	static String ans;
	static int N;
	static int M;
	static int K;
	static int[] cho;
	static int  boong;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++){
			ans = "Possible";
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();
			cho = new int[N];
			for(int i=0; i<N; i++) {
				cho[i] = sc.nextInt();
			}
			Arrays.sort(cho);
			boong = 0;
			//2초주면 1개씩만들수있음
			//2초, 3초에 오면 불가능 
			int count = 0;
			for(int i=0; i<=cho[N-1]; i++) {
				if(i>=M && i%M==0) {
					boong += K;
				}
				if(cho[count]==i) {
					if(boong==0) ans = "Impossible";
					else {
						boong--;
						count++;
					}
				}
			}
			
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

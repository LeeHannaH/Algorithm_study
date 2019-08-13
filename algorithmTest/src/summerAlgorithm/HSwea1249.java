package summerAlgorithm;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class HSwea1249 {
	static int ans;
	static int N;
	static char[][] arr;
	static boolean[][] isvisited;
	static boPoint startPoint;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int min;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=1; t<=testCase; t++) {
			min = 5000;
			N = sc.nextInt();
			arr = new char[N][N];
			isvisited = new boolean[N][N];
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int j=0; j<N; j++) {
					arr[i] = str.toCharArray();
				}
			}
			
			startPoint = new boPoint(0, 0, 0);
			
			bfs(startPoint);
			
			
			System.out.println("#"+t+" "+min);
		}
	}

	private static void bfs(boPoint startPoint) {
		PriorityQueue<boPoint> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(startPoint);
		isvisited[startPoint.i][startPoint.j] = true;
		
		while(!priorityQueue.isEmpty()) {
			boPoint p = priorityQueue.poll();
			if(p.i == N-1 && p.j == N-1) min = p.time;
			for(int d=0; d<4; d++) {
				int nI = p.i + dx[d];
				int nJ = p.j + dy[d];
				
				if(nI<0||nJ<0||nI>=N||nJ>=N) continue;
				if(isvisited[nI][nJ]) continue;
				priorityQueue.add(new boPoint(nI, nJ, p.time+(arr[nI][nJ]-'0')));
 				isvisited[nI][nJ] = true;
			}
		}
	}
}

class boPoint implements Comparable<boPoint>{
	int i;
	int j;
	int time;
	boPoint(int i, int j, int time){
		this.i = i;
		this.j = j;
		this.time = time;
	}
	@Override
	public int compareTo(boPoint p) {
		if(p.time < this.time) return 1;
		if(p.time == this.time) return 0;
		else return -1;
	}
	
	
}
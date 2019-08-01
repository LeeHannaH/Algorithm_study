package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H1697 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] isvisited = new boolean[200002];
		int ans = 0;
		int min = 1000000;
		
		Queue<suPoint> queue = new LinkedList<suPoint>();
		
		int[] dx = {-1, 1};
		
		queue.add(new suPoint(N, 0));
		isvisited[N] = true;
		
		while(!queue.isEmpty()) {
			suPoint current = queue.poll();
			if(N == K) {
				min = 0;
				queue.removeAll(queue);
				break;
			}
			for(int i=0; i<3; i++) {
				int nX;
				if(i==2) {
					nX = current.current*2;
				}else {
					nX = current.current + dx[i];
				}
				if(nX<0 || nX>100000) continue;
				if(isvisited[nX] == true) continue;
				if(nX == K) {
					queue.removeAll(queue);
					//ans = current.time+1;
					min = Math.min(min, current.time+1);
					break;
				}
				isvisited[nX] = true;
				queue.add(new suPoint(nX, current.time+1));
			}
		}
		System.out.println(min);
	}
}

class suPoint{
	int current;
	int time;
	suPoint(int current, int time){
		this.current = current;
		this.time = time;
	}
}
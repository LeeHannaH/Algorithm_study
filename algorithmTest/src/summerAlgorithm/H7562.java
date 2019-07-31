package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H7562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=0; t<testCase; t++) {
			int l = sc.nextInt();
			boolean[][] isvisited = new boolean[l][l];
			int min=0;
			cPoint start = new cPoint(sc.nextInt(), sc.nextInt(), 1);
			cPoint end = new cPoint(sc.nextInt(), sc.nextInt(), min);
			
			int[] dx = {-2,-1,-2,-1,1,2,1,2};
			int[] dy = {-1,-2,1,2,-2,-1,2,1};
			
			//min
			Queue<cPoint> queue = new LinkedList<cPoint>();
			
			queue.add(start);
			isvisited[start.i][start.j] = true;
			
			while(!queue.isEmpty()) {
				cPoint p = queue.poll();

				for(int i=0; i<8; i++) {
					int nX = p.i + dx[i];
					int nY = p.j + dy[i];
					
					if(nX<0 || nY<0 || nX >= l || nY >= l) continue;
					if(isvisited[nX][nY] == true) continue;
					if(nX == end.i && nY == end.j) {
						min = p.count;
						queue.removeAll(queue);
						break;
					}
					isvisited[nX][nY] = true;
					queue.add(new cPoint(nX, nY, p.count+1));
				}
			}
			
			System.out.println(min);
		}
	}
}

class cPoint{
	int i;
	int j;
	int count;
	cPoint(int i, int j, int count){
		this.i = i;
		this.j = j;
		this.count = count;
	}
}

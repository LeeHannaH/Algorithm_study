package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H5014 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		// 건물전체, from, to, up, down
		int all = sc.nextInt();
		int from = sc.nextInt();
		int to = sc.nextInt();
		int up = sc.nextInt();
		int down = sc.nextInt();
		int[] dir = {up, down*(-1)};
		int count = 0;
		
		//bfs 로 풀면될거가튼디 
		Queue<sPoint> queue = new LinkedList<sPoint>();
		boolean[] isvisited = new boolean[all+1];
		boolean ans = false;
		
		queue.add(new sPoint(from, 0));
		isvisited[from] = true;
		
		while(!queue.isEmpty()) {
			sPoint current = queue.poll();
			if(current.c==to) {
				ans = true;
				break;
			}
			for(int i=0; i<dir.length; i++) {
				int newFloor = current.c + dir[i];
				if(newFloor == to) {
					ans = true;
					count = current.count+1;
					queue.removeAll(queue);
					break;
				}
				if(newFloor<1 || newFloor>all) continue;
				if(isvisited[newFloor] == true) continue;
				count++;
				isvisited[newFloor] = true;
				queue.add(new sPoint(newFloor, current.count+1));
			}
			
		}
		if(ans == true)
		System.out.println(count);
		else
			System.out.println("use the stairs");
		
	}
}

class sPoint{
	int c;
	int count;
	sPoint(int c, int count){
		this.c = c;
		this.count = count;
	}
}

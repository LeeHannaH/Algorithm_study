package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H2206 {
	
	static int[][] arr;
	static boolean[][] isvisited;
	static int N;
	static int M;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static boolean finish;
	
	public static void main(String[] args) {
		// 기본 bfs로 최단 구하기  : 최단값
		// 기본 맵에서 1을 찾으면 0으로 바꾸기 -> bfs돌리기 : 최단값
		// 가장 min 구하기
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][M];
		
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<M; j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		int min = bfs(0,0);
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j]==1) {
					min = Math.min(min, bfs(i, j));
				}
			}
		}
		if(finish) 
		System.out.println(min);
		else
			System.out.println("-1");
	}

	private static int bfs(int i, int j) {
		int distance = 0;
		arr[i][j] = 0; //벽뿌숨!
		isvisited = new boolean[N][M]; //초기화
		
		Queue<BPoint> queue = new LinkedList<BPoint>();
		queue.add(new BPoint(0, 0, 1));
		isvisited[0][0] = true;
		
		while(!queue.isEmpty()) {
			BPoint p = queue.poll();
			for(int d=0; d<4; d++) {
				int nX = p.i + dx[d];
				int nY = p.j + dy[d];
				
				if(nX < 0 || nY < 0 || nX >= N || nY >= M) continue;
				if(isvisited[nX][nY]) continue;
				if(arr[nX][nY]==1) continue;
				queue.add(new BPoint(nX, nY, p.distance+1));
				isvisited[nX][nY] = true;

				if(nX==N-1 && nY==M-1) {
					finish = true;
					distance=p.distance+1;
					arr[i][j] = 1; 
					return distance;
				}
			}
		}
		
		arr[i][j] = 1; //복원
		return 1000;
	}
}

class BPoint{
	int i;
	int j;
	int distance;
	BPoint(int i, int j, int distance){
		this.i = i;
		this.j = j;
		this.distance = distance;
	}
}

//모든 칸을 전부 0으로 하나씩 바꾸어보고 BFS를 돌리는 것을 반복해서는 통과될 수 없습니다. 
//대부분의 알고리즘 문제가 그렇듯이, 풀이를 짜기 전에 반드시 해야 하는 것 중 하나는 시간 복잡도를 생각하는 것입니다. 
//시간 복잡도 계산, 전혀 어렵지 않습니다. 벽이 최대 O(NM)개 있는 맵에서, 벽을 하나 부술 때마다 O(NM)개의 칸을 탐색해야 하죠? 그러니 O((NM)^2)입니다. 
//이 수는 우리가 대충 1초에 돌 수 있다고 보는 단위인 1억을 10000배나 뛰어넘는 1조입니다. 절대 통과될 수 없겠죠?
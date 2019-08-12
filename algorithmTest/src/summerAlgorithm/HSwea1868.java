package summerAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class HSwea1868 {
	static int N;
	static int ans;
	static int[] dx = {1,0,-1,0,1,1,-1,-1};
	static int[] dy = {0,1,0,-1,-1,1,1,-1};
	static char[][] arr;
	static boolean[][] isvisited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=1; t<=testCase; t++) {
			ans = 0;
			N = sc.nextInt();
			arr = new char[N][N];
			isvisited = new boolean[N][N];
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int j=0; j<N; j++) {
					arr[i][j] = str.charAt(j);
					if(arr[i][j] == '*') {
						isvisited[i][j] = true;
						}
				}
			}
			
			// 지뢰 갯수 각자 다 써줌
			numbering();
		
			// 0을 먼저 선택해서 퍼뜨린다음
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(arr[i][j] == '0' && isvisited[i][j] == false) {
						checkDFS(i, j);
						ans++;
					}
				}
			}
			
			// 남은 숫자들 더해주기 (false로 남은 것들은 0, 0주변 친구들, * 제외 나머지 숫자임)
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(isvisited[i][j] == false) {
						ans++;
					}
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	// 최소 선택하는 수
	private static void checkDFS(int i, int j) {
		Stack<poppingPoint> stack = new Stack<>();
		stack.push(new poppingPoint(i, j));
		isvisited[i][j] = true;
		while(!stack.isEmpty()) {
			poppingPoint p = stack.pop();
			for(int d=0; d<8; d++) {
				int nI = p.i + dx[d];
				int nJ = p.j + dy[d];
				if(nI<0||nJ<0||nI>=N||nJ>=N) continue;
				if(isvisited[nI][nJ]) continue;
				isvisited[nI][nJ] = true; // 주변 것들 체크해줌
				if(arr[nI][nJ] == '0') {
					stack.add(new poppingPoint(nI, nJ)); // 주변 것이 0이라면 스택에 넣어줌
				}
			}
		}
	}

	// 지뢰 갯수 미리 매겨주는 것
	private static void numbering() {
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] == '.') {
					int count = 0;
					for(int d=0; d<8; d++) {
						int nI = i+dx[d];
						int nJ = j+dy[d];
						if(nI<0||nJ<0||nI>=N||nJ>=N) continue;
						if(arr[nI][nJ] == '*') count++;
					}
					arr[i][j] = (char) (count+'0');
				}
			}
		}
	}
}

class poppingPoint{
	int i;
	int j;
	poppingPoint(int i, int j){
		this.i = i;
		this.j = j;
	}
}

package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H16397 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 화면의 숫자
		int T = sc.nextInt(); // 버튼 최대 횟수
		int G = sc.nextInt(); // 목표 숫자 
		int ans = 0;
		boolean success = false;
		boolean[] isvisited = new boolean[100000];
		//isvisited 필요한가,,?
		Queue<hongPoint> queue = new LinkedList<hongPoint>();
		queue.add(new hongPoint(N, 0));
		isvisited[N] = true;
		while(!queue.isEmpty()) {
			hongPoint p = queue.poll();
			if(p.current==G) {
				success= true;
				break;
			}
			if(p.count>=T) break;
			for(int i=0; i<2; i++) {
				int newNum=0;
				if(i==0) {
					newNum = p.current+1;
				}else {
					if(p.current*2>99999) {
						break;
					}
					if(p.current!=0) {
						newNum = p.current*2 - (int) Math.pow(10, (int)(Math.log10(p.current*2)));
					}else {
						newNum = p.current;
					}
				}
				if(newNum>99999) {
					break;
				}
				if(isvisited[newNum]==true) continue;
				if(newNum == G) {
					success = true;
					ans = p.count+1;
					queue.removeAll(queue);
					break;
				}
				
				isvisited[newNum] = true;
				queue.add(new hongPoint(newNum, p.count+1));
				
			}
		}
		if(success == true)
		System.out.println(ans);
		else 
			System.out.println("ANG");
		
		
	}
}

class hongPoint{
	int current;
	int count;
	hongPoint(int current, int count){
		this.current = current;
		this.count = count;
	}
}
package algorithmTest;

import java.util.Arrays;

public class secuReal1 {
	public static int solution(int[] ranks) {
		int count=1;
		int answer=0;
		
		Arrays.sort(ranks); // quickSort
		//Primitive Type일 경우에는 QuickSort를 사용하지만,
		//Objective Type일 경우에는 MergeSort를 사용한다고 하는데
		
		//어떤 정렬 방법이 제일 시간복잡도가 좋지,,? ==> 힙정렬 !!
		//시간복잡도 빠르게(메모리엉망)=> 배열에 다 때려박기
		
		//정렬 설명할수있는가

		
		for(int i=0; i<ranks.length-1; i++) {
			if(ranks[i]==ranks[i+1]) count++;
			else if(ranks[i]!=ranks[i+1]) {
				if(ranks[i]+1==ranks[i+1])
					answer += count;
				count=1;
			}
		}
	
		return answer;
	}
	public static void main(String[] args) {
		
		int A[] = {3,4,3,0,2,2,3,0,0};
		int B[] = {4,2,0};
		int C[] = {4,4,3,3,1,0};
		int D[] = {};
		int E[] = {5};
		int F[] = {5,2,4,3,1,1,10,10};
		
		System.out.println(solution(A)); //5
		System.out.println(solution(B)); //0
		System.out.println(solution(C)); //3
		System.out.println(solution(D)); //0
		System.out.println(solution(E)); //0
		System.out.println(solution(F)); //5

	}
	
}

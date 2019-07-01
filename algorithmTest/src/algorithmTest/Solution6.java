package algorithmTest;

import java.util.Stack;

public class Solution6 {
/*	public static int solution(int[] A, int[] B) {
		int answer = 0;
		int firstB = 0;
		
		if(B.length==1) return 1; 
			
		for(int i=0; i<B.length-1; i++) {
			if(B[i]==1&&B[i+1]==0) {
				firstB = i;
				break;
			}else {
				answer++;
			}
		}
		
		for(int i=firstB+1; i<B.length; i++) {
			if(B[firstB]!=B[i]) {
				if(A[firstB]<A[i]) {
					firstB = i;
				}
			}else {
				answer++;
			}
			if(i==B.length-1) answer++;
		}
		System.out.println(answer);
		return answer;
    }*/
	public static int solution(int[] A, int[] B) {
		
		Stack<Integer> downfish = new Stack<>();
		int upfish = 0;

		for (int i = 0; i < B.length; i++) {
			if (B[i] == 0) {
				if (downfish.isEmpty()) {
					upfish++;
				} else {
					while (!downfish.empty()) {
						if (A[i] > downfish.peek()) {
							downfish.pop();
						} else {
							break;
						}
					}
					if (downfish.isEmpty()) {
						upfish++;
					}
				}
			} else {
				downfish.push(A[i]);
			}
		}

		System.out.println(upfish+downfish.size());
		return upfish+downfish.size();
	}
	public static void main(String[] args) {
		int A[] = {4,3,2,1,5};
		int B[] = {0,1,0,0,0};
		
		solution(A, B);
	}
}

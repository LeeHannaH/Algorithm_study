package algorithmTest;

import java.util.Arrays;

public class Solution8 {
	
	static int maxmode(int[] A){
		int leader = 0;
		int index[] = new int[100000];
		int max = Integer.MIN_VALUE;
		
		
			return leader;
	}
	public static int solution(int[] A) {
		int answer=0;
		int firstLeader, secondLeader;
		
		for(int i=0; i<A.length; i++) {
			int firstArray[] = new int[i+1];
			int secondArray[] = new int[A.length-i-1];
			int a, b;
			
		
			for(a=0; a<=i; a++) {
				firstArray[a]=A[a];
			}
			Arrays.sort(firstArray);	
			firstLeader = maxmode(firstArray);
			
			for(b=a; b<A.length; b++) {
				secondArray[b-(a)]=A[b];
			}
			Arrays.sort(secondArray);
			
			secondLeader = maxmode(secondArray);
			
			if(firstLeader==secondLeader&&firstLeader!=0) {
				answer++;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		
		int A[] = {4,3,4,4,4,2};
		solution(A);
	}
}

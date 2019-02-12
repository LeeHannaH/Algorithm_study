package algorithmTest;

import java.util.Arrays;

public class Solution5 {
	public static int solution(int[] A) {
		
		Arrays.sort(A);
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]+A[j]>A[j+1]) return 1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int A[] = {10,2,5,1,8,2};
		solution(A);
	}
}

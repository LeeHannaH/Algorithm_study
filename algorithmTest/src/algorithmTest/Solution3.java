package algorithmTest;

import java.util.Arrays;

public class Solution3 {

	  public static int solution(int[] A) {

		  if(A==null) return 0;
		 Arrays.sort(A);
		  if(A[0]!=1)return 0;
		 
		  for(int i=0; i<A.length-1; i++) {
			  if(A[i+1]-A[i]!=1) {
				  return 0;
			  }
		  }
		return 1;
	    }
	  
	  
	  public static void main(String[] args) {
		  int A[] = {4,1,3,2};
		  solution(A);
		  
		  int B[] = {4,1,3};
		  solution(B);
	}
}

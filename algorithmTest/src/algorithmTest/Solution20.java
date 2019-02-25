package algorithmTest;

public class Solution20 {
    public static int solution(int[] A) {
    	int first = -1;
    	int second = -1;
    	int third = -1;
    	int sum = 0;
    	
    	for(int i=0; i<A.length; i++) {
    		
    		if(A[i]<0) { // 마이너스인데
    			if(A[i+1]>=0) { //다음꺼는 프러스이면
    				first = i;
    			}
    		}

			if(first>=0 && A[i]>=0) { //첫번째가 정해졌으면
				sum+=A[i];
			}
    		
    	}
    	
    	return 0;
    }	
    public static void main(String[] args) {
		int A[]= {3,2,6,-1,4,5,-1,2};
		solution(A);
	}
	
}

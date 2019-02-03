package algorithmTest;


public class Solution10 {
    public static int solution(int[] A) {
    	int sum = 0;
    	int max = A[0];
    	
    	for(int i=0; i<A.length; i++) {
    		if(A[i]<0) continue;
    		sum += A[i];
    		for(int j=i; j<A.length; j++) {
    			if(i!=j)
    			sum += A[j];
    			if(sum>max) {
    				max = sum;
    			}
    		}
    		sum=0;
    	}
    	
    	return max;
    }
    public static void main(String[] args) {
		int A[] = {3,2,-6,4,0};
		solution(A);
	}
}

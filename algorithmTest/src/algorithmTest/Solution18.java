package algorithmTest;

public class Solution18 {
    public static int solution(int[] A, int[] B) {
    	
    	int cnt = 1;
    	int last = B[0];
    	
    	for(int i=0; i<A.length; i++) {
    		if(A[i]>last){
    			cnt++;
    			last = B[i];
    		}
    	}
    	System.out.println();
    	return cnt;
    }
    public static void main(String[] args) {
		int A[] = {1,3,7,9,9};
		int B[] = {5,6,8,9,10};
		
		solution(A,B);
	}
}

package algorithmTest;

public class Solution4 {
	public static int solution(int[] A) {

		int count=0;
		
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]==0) {
					if(A[j]==1) count++;
				}else if(A[i]==1) {
					break;
				}
			}
		}
		
		if(count > 1000000000) return -1;
		return count;
	}
	public static void main(String[] args) {
		
		int A[] = {0,1,0,1,1};
		solution(A);
	}
}

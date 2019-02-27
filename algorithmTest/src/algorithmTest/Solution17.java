package algorithmTest;


public class Solution17 {
	public static int solution(int[] A) {
		int answer=0;
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]==2147483647) {answer++; A[i]=0;}
				if((i+A[i])>=(j-A[j])) {
					answer++;
					if(answer>=10000000) return -1;
				}
			}
		}

		return answer;
    }
	public static void main(String[] args) {
		int A[] = {1,2147483647,0};
		solution(A);
	}
}

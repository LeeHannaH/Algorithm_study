package algorithmTest;

public class Solution11 {
	 public static int solution(int N) {
		 int factor = 0;
		 int last_factor = N;
		 
		 if(N==1) factor++;
		 for(int i=1; i<=Math.sqrt(N); i++) {
			 if(i>=last_factor) break;
			 if(N%i==0) {
				 if(i!=N/i)
					 factor+=2;
				 else
					 factor++;
				 last_factor = N/i;
			 }
		 }
		 return factor;
	 }
	 public static void main(String[] args) {
		 solution(1);
		 solution(24);
		 solution(100000);
		solution(25);
	}
}

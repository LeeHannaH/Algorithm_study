package algorithmTest;

import java.util.HashSet;
import java.util.Set;

public class Solution13 {
    public static int solution(int M, int[] A) {

    	  Set<Integer> set = new HashSet<>();
    	  int count = 0; 
    	  int answer = 0;
    	  while(count!=A.length) {
	        for(int i=count; i<A.length; i++){
	            if(set.contains(A[i])){
	                set.removeAll(set);
	                count++;
	                break;
	            }else{
	                set.add(A[i]);
	                answer++;
	               // if(A[i]==M&&i!=count) break;
	                if(answer==1000000000) break;
	            }
	        }
    	  }
    	  System.out.println(answer);
    	return answer;
    }
    public static void main(String[] args) {
		int A[] = {3,4,6,6,2};
    	solution(6, A);
	}
}

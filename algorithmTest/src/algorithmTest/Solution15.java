package algorithmTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution15 {
    public static int solution(int[] A) {
    
    	Arrays.sort(A);
    	Set<Integer> set = new HashSet<>();
    	for(int num : A) {
    		set.add(num);
    	}
    	
    	for(int i=1; i<100000; i++) {
    		if(!set.contains(i)) {
    			System.out.println(i);
    			break;
    		}
    	}
    	/*for(int i=0; i<A.length-1; i++) {
    		if(A[i]<=0) {
    			System.out.println(1);
    			return 1;
    			}
    		if(A[i+1]-A[i]!=1&&A[i+1]!=A[i]) {
    			System.out.println((A[i]+1));
    			return (A[i]+1);
    		}
    	}
    	*/
     return 0;
    }
    public static void main(String[] args) {
		int A[] = {1,3,6,4,1,2};
		int B[] = {1,2,3};
		int C[] = {2};
		
		System.out.println("*****A******");
		solution(A);
		System.out.println("*****B******");
		solution(B);
		System.out.println("*****C******");
		solution(C);
	}
}

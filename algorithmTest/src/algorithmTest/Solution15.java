package algorithmTest;

import java.util.HashSet;
import java.util.Set;

public class Solution15 {
    public static int solution(int[] A) {
    
    	Set<Integer> set = new HashSet<>();
    	for(int num : A) {
    		set.add(num);
    	}
    	
    	for(int i=1; i<=100000; i++) {
    		if(!set.contains(i)) {
    			return i;
    		}
    		if(i==100000) return (i+1);
    	}
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

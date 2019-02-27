package algorithmTest;

import java.util.HashSet;
import java.util.Set;

public class Solution21 {
	public static int solution(int[] A) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int a : A) {
			a = Math.abs(a);
			set.add(a);
			
			
			
		}

		return set.size();
    }
	public static void main(String[] args) {
		int A[] = {-5,-3,-1,0,3,6};
		System.out.println(solution(A));
	}
}

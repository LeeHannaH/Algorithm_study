package algorithmTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class secu1 {
	
	static Set<Integer> indexSet = new HashSet<>();
   // Set을 쓴 목적이 약간 애매,, -> linkedList로 바꿨다
	public static int neck(int[] A, int startNum, int index, int answer) {
	
		indexSet.remove(index);
		if(A[index]==startNum) return answer;
		return neck(A, startNum, A[index], ++answer); //++된 값이 들어가야해서 전위에 붙였는데 후에 붙이면 어케되는거지 ==> 안됨~
		
	}
	public static int solution(int[] A) {
		int firstIndex;
		int answer=0;
		
	   for(int i=0; i<A.length; i++) {
		   indexSet.add(i); //O(1)
	   }
	   while(!indexSet.isEmpty()) {
		   firstIndex = indexSet.iterator().next(); //O(h/n)인데 h/n이 뭐지
		   answer = Math.max(answer, neck(A, A[firstIndex], A[firstIndex], 1));
	   }
   
      return answer;
   }
	
	
	// O(1)이랑 O(log n)이랑 뭐가 더 좋지?
	// HashSet보다 좋은게 뭐가 있지?
	
	
   public static void main(String[] args) {

      int A[] = {5,4,0,3,1,6,2}; //4
      int B[] = {3,1,0,5,8,15,2,4,9,10,7,12,11,6,13,14}; //8
      int C[] = {}; //0
      int D[] = {1,0}; //2
      
      System.out.println(solution(A));
      System.out.println(solution(B));
      System.out.println(solution(C));
      System.out.println(solution(D));
      

   }
}
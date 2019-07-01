package algorithmTest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class secu2 {

	static LinkedList<Integer> list = new LinkedList<>();
	   
	public static int neck(int[] A, int startNum, int index, int answer) {
	
		list.remove((Integer)index); //오버로딩 int로 들어가면 인덱스지워져서 형변환(object로)
		if(A[index]==startNum) return answer;
		return neck(A, startNum, A[index], ++answer); //++된 값이 들어가야해서 전위에 붙였는데 후에 붙이면 어케되는거지 ==> 안됨~
		
	}
	public static int solution(int[] A) {
		int firstIndex;
		int answer=0;
		
	   for(int i=0; i<A.length; i++) {
		   list.add(i);
	   }
	   while(!list.isEmpty()) {
		   firstIndex =list.peek();
		   answer = Math.max(answer, neck(A, A[firstIndex], A[firstIndex], 1));
	   }
   
      return answer;
   }
	
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

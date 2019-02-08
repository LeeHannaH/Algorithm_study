package algorithmTest;

import java.util.Stack;

public class test3 {
	 public static int[] solution(int[] T) {
		 
		 Stack<Integer> stack = new Stack<>();
		 int length[] = new int[T.length];
		 int capital = -1;
		 int count = 0;
		 boolean flag = false;
		 
		 for(int i=0; i<T.length; i++) {
			 if(T[i]==i) {
				 capital = i;
			 }
			 length[i]=0;
		 }
		 
		 stack.push(capital);
		 T[capital] = -1;
		 int find = capital;
		 int pushCount=0;
		 while(!stack.isEmpty()) { 
			 
			 			 
			 for(int i=0; i<T.length; i++) {
				 if(T[i]==find) {
					 stack.push(i);
					 pushCount++;
					// System.out.println("pushCount >>" +pushCount);
					 System.out.println(i + " == " + find + "인 index -> " +count);
					 T[i] = -1;
					 length[count]++;
				 }
			 }System.out.println();
			 find = stack.pop();
			 pushCount--;
		//	 System.out.println("pushCount >>" +pushCount);
			 if(pushCount==0) {
				 count++;
			 }
		 }

		 for(int num:length) {
			 System.out.print(num+" / ");
		 }
		 return length;
	 }
	 public static void main(String[] args) {
		int A[] = {9,1,4,9,0,4,8,9,0,1};
		solution(A);
	}
}

package summerAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class H1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		boolean ans = true;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Character> arrlist = new ArrayList<>();
		
		Stack<Integer> stack = new Stack<>(); // 답
		Stack<Integer> temp = new Stack<>(); // 임시저장
		
		int cnt = 0;
		int i=1;
		while(i<=N) {
			
			if(i==arr[cnt]) {
				temp.push(i);
				arrlist.add('+');
				arrlist.add('-');
				stack.push(temp.pop());
				cnt++;
				i++;
				
			}else if(!temp.isEmpty()&&arr[cnt]==temp.peek()){
				arrlist.add('-');
				stack.push(temp.pop());
				cnt++;
			}else {
				temp.push(i);
				arrlist.add('+');
				i++;
				
			}
			
			
		}
		
		int size = temp.size();
		for(int k=0; k<size; k++) {
			if(temp.peek()==arr[cnt]) {
				arrlist.add('-');
				stack.push(temp.pop());
				cnt++;
			}else {
				ans = false;
			}
		}

		if(ans) {
		for(char c : arrlist) {
			System.out.println(c);
		}
		}else {
			System.out.println("NO");
		}
	}

}

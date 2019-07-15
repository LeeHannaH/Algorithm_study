package summerAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class H9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			String line = sc.next();
			char[] arr = new char[line.length()];
			arr = line.toCharArray();
			Stack<Character> stack = new Stack<>();

			for(int j=0; j<line.length(); j++) {
				if(arr[j]=='(') {
					stack.push(arr[j]);
				}else {
					if(stack.isEmpty()) stack.push(arr[j]);
					else if(stack.peek()=='(') {
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty()) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			
		}
	}
}

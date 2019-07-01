package algorithmTest;

import java.util.Stack;

public class Solution7 {
	public static int solution(String S) {
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<S.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(S.charAt(i));
			}else {
				if(stack.peek()=='('&&S.charAt(i)==')') {
					stack.pop();
				}else {
					stack.push(S.charAt(i));
				}
			}
		}
		if(stack.isEmpty()) return 1;
		return 0;
    }
	public static void main(String[] args) {
		solution("(()(())())");
	}
}

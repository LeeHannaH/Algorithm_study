package haban;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MakeFunc {
	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		solution(progresses, speeds);
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer;
		Stack<MFunc> stack = new Stack<>();

		for (int i = 0; i < progresses.length; i++) {
			int value = (100 - progresses[i]);
		

			if (value % speeds[i] != 0) {
				value = value / speeds[i] + 1;
			} else {
				value = value / speeds[i];
			}
			

			if (stack.isEmpty()) {
				stack.push(new MFunc(value, 1));
			} else {

				MFunc temp = stack.peek();

				if (temp.value >= value) {
					temp.count += 1;
				} else {
					stack.push(new MFunc(value, 1));
				}
			}
		}

		answer = new int[stack.size()];
		
		int cnt = 0;
		for(MFunc m : stack) {
			answer[cnt] = m.count;
			System.out.println(answer[cnt]);
			cnt++;
		}

		return answer;
	}
}

class MFunc {
	int value;
	int count;

	public MFunc(int value, int count) {
		this.value = value;
		this.count = count;
	}
}

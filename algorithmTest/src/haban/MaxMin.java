package haban;

import java.util.Arrays;

public class MaxMin {
	public static void main(String[] args) {
		solution("1 2 3 4");
		solution("-1 -2 -3 -4");
		solution("-1 -1");
	}

	public static String solution(String s) {
		String answer = "";
		
		String[] num = s.split(" ");
		int[] numIn = new int[num.length];
		for(int i=0; i<num.length; i++) {
			numIn[i] = Integer.parseInt(num[i]);
		}
		
		Arrays.sort(numIn);
		
		System.out.println(numIn[0]+" "+numIn[num.length-1]);
		
		
		
		return answer;
	}
}

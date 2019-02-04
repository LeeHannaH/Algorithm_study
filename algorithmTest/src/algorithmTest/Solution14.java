package algorithmTest;

public class Solution14 {
	 public static int solution(String S) {
		 
		 String[] words = S.split(" ");
		 int answer = words.length;
		 boolean flag = true;
		 
		 int letter = 0;
		 int digits = 0;
		 int answerLength = 0;
		 
		 for(String str : words) {
			 
			 for(char c: str.toCharArray()) {
				 if(c!=' ') {
					 if(Character.isDigit(c)||Character.isAlphabetic(c)||Character.isLetter(c)) {
						 if(Character.isLetter(c)) letter++;
						 else if(Character.isDigit(c)) digits++;
					 }
					 else flag = false;
				 }
			 }
			 
			 if(flag==false||letter%2!=0||digits%2==0) {
				 answer -= 1;
			     flag = true;
			     if(answer == 0) return -1;
			 }else {
				 answerLength = Math.max(answerLength, str.length());
			 }

			
			 letter=digits=0;
		 }
		 

		 return answerLength;
	 }
	 public static void main(String[] args) {
		solution("a");
	}
}

package algorithmTest;

public class test1 {
	public static int solution(String S, int K) {
		
		int count = 0;
		int sum = 0;
		int answer = 0;
		
		String charWord[] = S.split(" ");
		int array[] = new int[charWord.length];
		
		for(int i=0; i<charWord.length; i++) {
			array[i]=charWord[i].length();
		}
		
		for (int i=0; i<array.length; i++) {
			if (array[i] > K)
				return -1;
			
			sum += array[i];
			if (count != 0)
				sum++; // 두번째 배열이면 공백 추가
			count++;
			
			if (sum > K) {
				i--;
				sum = 0;
				count = 0;
				answer++;
			//	System.out.println(i + "번째 array answer : " +answer );
				
			}
			if(i==array.length-1) {
				answer++;
			//	System.out.println(i + "번째 array answer : " +answer );
				
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		System.out.println("1번 답 " +solution("SMS messages are really short",12));
		System.out.println("2번 답 : " +solution("a cat is playing",5));
		System.out.println("3번 답 : " +solution("a cat is playin",6));
		System.out.println("4번 답 : " +solution("a b c d e f abc abcc",4));
		System.out.println("5번 답 : " +solution("abc",3));
	}

}

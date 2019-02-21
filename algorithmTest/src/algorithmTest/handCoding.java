package algorithmTest;

public class handCoding {

	public static void main(String[] args) {
		int answer = 0;
		for(int i=1; i<=16; i++) {
			if(i%3==0) answer+=i;
			else if(i%5==0) answer+=i;
		}
		
		System.out.println(answer);
		
	}
}

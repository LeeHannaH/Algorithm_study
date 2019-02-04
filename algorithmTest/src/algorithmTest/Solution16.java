package algorithmTest;

public class Solution16 {
    public static int solution(int A, int B, int K) {
    	 return ((B/K)-(A/K)+(A%K==0?1:0));
    }
    public static void main(String[] args) {
		solution(6, 11, 2);
	}
}

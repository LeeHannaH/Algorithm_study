package algorithmTest;

public class Solution12 {
    public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return Math.abs(a);
  }
  
    public int solution(int N, int M) {
        return N/gcd(N,M);
    }
}
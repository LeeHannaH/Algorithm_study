package summerAlgorithm;

import java.util.Scanner;

public class H1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		boolean[] che = new boolean[end+1];
		
		che[0]=che[1]=false;
		for(int i=2; i<=end; i++) {
			che[i] = true;
		}
		
		for(int i=2; i*i<=end; i++) {
			for(int j=i*i; j<=end; j+=i) {
				che[j] = false;
			}
		}
		
		for(int i=start; i<=end; i++) {
			if(che[i] == true) {
				System.out.println(i);
			}
		}
		//2부터 N까지의 수 중에서 소수를 찾는다고 했을 때,
		//N의 제곱근(나누어 떨어지지 않는다면 보다 큰 자연수)보다 작은 소수의 배수를 모두 지우고 남는 수는 모두 소수입니다.
	}
}

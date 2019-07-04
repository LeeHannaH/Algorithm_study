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
		
	}
}

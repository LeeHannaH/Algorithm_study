package summerAlgorithm;

import java.util.Scanner;

public class H11729 {
	static int count = 0;
	public void Hanoi(int n, int from, int by, int to) {
		count++;
		if(n==1) {
			System.out.println(from + " "+to);
		}else {
			Hanoi(n-1, from, to, by);
			System.out.println(from + " "+to);
			Hanoi(n-1, by, from, to);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		H11729 h = new H11729();
		h.Hanoi(num, 1, 2, 3);
		System.out.println(count);
		
	}
}

package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i=0 ;i<N; i++) {
			arr[i] = i+1;
			queue.add(arr[i]);
		}
		
		for(int i=0; i<N-1; i++) {
			queue.removeFirst();
			int temp = queue.poll();
			queue.add(temp);
		}
		
		System.out.println(queue.poll());
	}
	

}

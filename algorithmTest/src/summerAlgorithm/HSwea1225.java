package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HSwea1225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=0; t<10; t++) {
			int testCase = sc.nextInt();
			Queue<Integer> queue = new LinkedList<>();
			for(int i=0; i<8; i++) {
				queue.add(sc.nextInt());
			}
			
			int count = 1;
			int temp = queue.peek();
			
			while(temp>0){
				temp = queue.poll();
				temp -= count;
				if(count==5) count = 1;
				else count++;
				if(temp<=0) temp = 0;
				queue.add(temp);
			}
			
			System.out.print("#"+testCase+" ");
			for(int i=0; i<8; i++) {
				System.out.print(queue.poll()+" ");
			}System.out.println();
			
		}
	}
}

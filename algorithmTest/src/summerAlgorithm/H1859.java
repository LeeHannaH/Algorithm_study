package summerAlgorithm;

import java.util.Scanner;

public class H1859 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = 0;
		long []array;
		long max = 0;
		int sum = 0;
		int count = 0;
		long ans = 0;
		for(int i=0; i<num; i++) {
			num2 = sc.nextInt();
			array = new long[num2+1];
			for(int j=0; j<num2; j++) {
				array[j] = sc.nextInt();
			}
			max = array[num2-1];
			sum= 0; count = 0;
			for(int j=num2-1; j>=0; j--) {
				if(j==0) {
					ans = ans + (count * max)-sum;
					sum = 0; count = 0;
				}
				else if(array[j]<array[j-1] && array[j-1]>max) { 
					ans = ans + (count * max)-sum;
					max = array[j-1];
					sum = 0; count = 0;
				}else {
					sum += array[j-1];
					count++;
				}
			}
			System.out.println("#"+(i+1)+" "+ans);
			ans = 0;
		}
	}
}


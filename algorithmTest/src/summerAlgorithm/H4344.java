package summerAlgorithm;

import java.util.Scanner;

public class H4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		double array[] = new double[testCase];
		
		for(int i=0; i<testCase; i++) {
			int num = sc.nextInt();
			int[] tempArray = new int[num];
			int sum = 0;
			int check = 0;
			double avg = 0.0;
			for(int j=0; j<num; j++) {
				tempArray[j] = sc.nextInt();
				sum += tempArray[j];
			}
			avg = sum/num;
			for(int k=0; k<num; k++) {
				if(tempArray[k] > avg) {
					check++;
				}
			}
			array[i]=(double)check/(double)num * 100;
			System.out.printf("%.3f",array[i]);
			System.out.println("%");
		}
		sc.close();
	
		
	}
}

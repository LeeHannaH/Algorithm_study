package algorithmTest;

import java.util.Scanner;

public class algo1427 {
	
	public static void main(String[] args) {
		
		int array[] = new int[100000];
		int temp;
		Scanner sc = new Scanner(System.in);
		String inputNum = sc.next();
		for(int i=0; i<inputNum.length(); i++) {
			array[i]=inputNum.charAt(i)-48;
		}
		for(int i=0; i<inputNum.length(); i++) {
			for(int j=i+1; j<inputNum.length(); j++) {
				if(array[j]>array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i=0; i<inputNum.length(); i++) {
			System.out.print(array[i]);
		}
	}
	
}

package algorithmTest;

import java.util.Scanner;

public class algo2577 {
	
	public static void main(String args[]) {
		
		int array[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		String sum = String.valueOf(A*B*C);
		
		for(int i=0; i<sum.length(); i++) {
			array[(int)sum.charAt(i)-48]+=1; // char 에서 int로 바꾸려면 (int)붙이고 -48 을 해줘야 한다! 아스키코드!
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}

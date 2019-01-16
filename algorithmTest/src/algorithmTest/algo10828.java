package algorithmTest;

import java.util.Scanner;

public class algo10828 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String order;
		int array[] = new int[10000];
		int top=-1;
		
		for(int i=0; i<N; i++) {
			String orderName = sc.next();
			if(orderName.equals("push")) {
				top++;
				array[top] = sc.nextInt();
			}else if(orderName.equals("top"))
			{
				if(top==-1)System.out.println("-1");
				else{System.out.println(array[top]);}
				
			}else if(orderName.equals("size")) {
				System.out.println(top+1);
			}else if(orderName.equals("empty")) {
				if(top==-1) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(orderName.equals("pop")) {
				if(top==-1)System.out.println("-1");
				else{System.out.println(array[top]);top--;}
			}
		}
	}

}



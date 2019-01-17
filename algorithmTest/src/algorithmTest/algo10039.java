package algorithmTest;

import java.util.Scanner;

public class algo10039 {
	public static void main(String args[]){
		int sum=0;
		 Scanner sc = new Scanner(System.in);

		for(int i=0; i<5; i++){
		 int score = sc.nextInt();
		 if(score<40) {
		     sum += 40;
		 }else{
		    sum += score;
		 }
		}
		System.out.println(sum/5);
		}
}
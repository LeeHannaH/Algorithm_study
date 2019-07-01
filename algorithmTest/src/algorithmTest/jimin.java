package algorithmTest;

import java.util.Scanner;

public class jimin {
	   public static int num;
	   public static String arr[];

	   public static void preorder(char x) {
	      if(x != '.') {
	         System.out.print(x);
	         preorder(find(x,1));
	         preorder(find(x,2));
	      }
	   }
	   
	   public static void inorder(char x) {
	      if(x != '.') {
	         inorder(find(x,1));
	         System.out.print(x);
	         inorder(find(x,2));
	      }
	   }
	   
	   public static void postorder(char x) {
	      if(x != '.') {
	         postorder(find(x,1));
	         postorder(find(x,2));
	         System.out.print(x);
	      }
	   }
	   
	   public static char find(char c,int k) {
	      for(int i=0;i<num;i++) {
	         if(arr[i].charAt(0)==c) {
	            return arr[i].charAt(k);
	         }
	      }
	      
	      return '1';
	   }
	   
	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      num = scan.nextInt();
	      arr= new String[num];//num개의 문자열로 배열선언
	      
	      for(int i=0;i<num;i++) {//배열로 받기
	         arr[i] = scan.next();
	      }
	      
	      preorder(arr[0].charAt(0));
	      System.out.println();
	      inorder(arr[0].charAt(0));
	      System.out.println();
	      postorder(arr[0].charAt(0));
	   }

}

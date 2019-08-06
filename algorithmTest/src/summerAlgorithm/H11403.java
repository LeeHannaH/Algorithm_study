package summerAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class H11403 {
   static int[][] arr;
   static int[][] ans;
   static int N;
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      arr = new int[N][N];
   
      ans = new int[N][N];
      for(int i=0; i<N; i++) {
         for(int j=0; j<N; j++) {
            arr[i][j] = sc.nextInt();
            if(arr[i][j]==1) ans[i][j]=1;
         }
      }
      
      // arr[i][asdf] 가 1이면 가는길이 있다는거니 stack에 추가
      // dfs해서 i에서 j까지 가는게 있는지 확인 후 있으면 1 없으면 0
      for(int i=0; i<N; i++) {
            dfs(i);
      }
      
      for(int i=0; i<N; i++) {
         for(int j=0; j<N; j++) {
            System.out.print(ans[i][j]+" ");
         }System.out.println();
      }
      
   }

   private static void dfs(int from) {
      Stack<FindPoint> stack = new Stack<>();
      boolean[] isvisited = new boolean[N];
      
      stack.add(new FindPoint(from));
      System.out.println("----------------> stack에 "+from+"추가");
      while(!stack.isEmpty()) {
         int newfrom = stack.pop().from;
         System.out.println("stack에서 뽑음:"+newfrom);
         for(int i=0; i<N; i++) {
        	 System.out.println("------"+i+"-----------");
        	 System.out.println("hasdfasdf");
        	if(isvisited[i]) continue;
            System.out.println("here???");
            if(arr[newfrom][i] == 0) continue;
            System.out.println("---i : "+i);
            if(i==from) {
               ans[from][i] = 1;
               System.out.println(from+"->"+i+" 추가");
               continue;
            }
            ans[from][i] = 1;
            System.out.println(i+", ");
            if(arr[newfrom][i] == 1) {
            	isvisited[i] = true;
            	System.out.println("---------------->stack에 "+i+"추가");
               stack.push(new FindPoint(i));
            }
            
         }System.out.println();
      }
      
   }
}

class FindPoint{
   int from;
   FindPoint(int from){
      this.from = from;
   }
}
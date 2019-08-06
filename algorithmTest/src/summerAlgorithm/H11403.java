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
   
      // 입력받아요
      ans = new int[N][N];
      for(int i=0; i<N; i++) {
         for(int j=0; j<N; j++) {
            arr[i][j] = sc.nextInt();
            if(arr[i][j]==1) ans[i][j]=1;
         }
      }
      
      // 시작점넣어서 dfs함수 돌리기
      for(int i=0; i<N; i++) {
            dfs(i);
      }
      
      // 출력
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
      while(!stack.isEmpty()) {
         int newfrom = stack.pop().from;
         for(int i=0; i<N; i++) {
        	if(isvisited[i]) continue; // 이미 간곳 continue
            if(arr[newfrom][i] == 0) continue; // 갈 길이 없어도 continue
            if(i==from) { // 원점으로 돌아왔으면 1로 고치고 continue
               ans[from][i] = 1;
               continue;
            }
            ans[from][i] = 1; // from->somewhere 1로 바꿔주고
            isvisited[i] = true;
            stack.push(new FindPoint(i));
         }
      }
      
   }
}
// 만들필요 없었는데 그냥 해씀
class FindPoint{
   int from;
   FindPoint(int from){
      this.from = from;
   }
}
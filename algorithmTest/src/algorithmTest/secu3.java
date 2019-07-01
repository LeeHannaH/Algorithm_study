package algorithmTest;

public class secu3 {
    int maxAnswer = 0; // 이거 어케했더라;

    // 멀티쓰레드....
    // DFS랑 BFS의 시간복잡도?
    // BFS로,,풀,,,ㅇ,,,,ㅓㄴㅇ로,ㅇ
    
   public  void preOrder(String[] B, int x, int y, int startIndex) { //preorder의 경우에는 O(n) - O(n+m) 노드수+모서리수
	   																					//이진트리는 에지수가 2로 제한되어있으므로 이진트리 최대 총 에지수는 n-1(n:총 노드의 수)
	   																					//그러면 복잡성은 O(n+n-1)이 되어 O(n)이 된다.
	   
	   // DFS인데.. 이미 방문했다는 표시는 어떻게 한거지..? 그거 안하면 원래 무한루프에 빠지지않나,.,????????????????????
      if(y<0||y>B.length-1||x<0||B[x].charAt(y)=='X') {
    	  //예외처리하는 곳
    	  // 벽 왼쪽을 뚫지 못함 || 벽 오른쪽을 뚫지 못함 || 체스 맨 위를 넘어가지 못함 || 대대각선이 X로 막혀있으면 못감
         return;
      }
      
      if(x-1>0&&B[x-1].charAt(y-1)=='X') { // LEFT 먹을 말이 있으면
         preOrder(B,x-2,y-2,startIndex);
      }

   
      if(x-1>0&&y<B.length-1&&B[x-1].charAt(y+1)=='X') { // RIGHT 먹을 말이 있으면
         preOrder(B,x-2,y+2,startIndex);
      }

      maxAnswer = Math.max((startIndex-x)/2, maxAnswer);
      
   }
   
   public int solution(String[] B) {
	  boolean flag = false; 
      int xIndex = B.length-1;
      if(B.length==0) return 0;
      for(int j=B.length-1; j>=0; j--) {
	      for(int i=0; i<B[0].length(); i++) {
	         if(B[j].charAt(i)=='O') {
	        	 flag = true;
	            preOrder(B, j, i,j); // (x, y) -- 여기선 B[x].charAt(y)로 표현 // 이 방법 말고 다른 방법을 생각해보삼.,,?
	            break;
	         }
	         if(flag==true) break; // O를 찾았으면 그 뒤를 더 찾을 필요가 없으므로 flag로 판단해서 break걸어줌
	      }
      }
      return maxAnswer;
   }
   
   
   
   public static void main(String[] args) {
      
	  String[] D = {".....",".X...","..O..","...X.","....."};
      String[] A = {"X....",".X...","..O..","...X.","....."};
      String[] B = {"..X...","......","....X.",".X....","..X.X.","...O.."};
      String[] C = {".X........",
                     "..........",
                     "....X...X.",
                     "..........",
                     "..X...X.X.",
                     "..........",
                     "..X...X...",
                     "..........",
                     "..X.X.....",
                     "...O......",};
      
      secu3 s = new secu3();
     
    System.out.println("답 : "+s.solution(D));  //1
     s=new secu3();
     System.out.println("답 : "+s.solution(A)); //0
     s=new secu3();
     System.out.println("답 : "+s.solution(B));  //2
     s=new secu3();
    System.out.println("답 : "+s.solution(C));  //4
     s=new secu3();
      
   }
}
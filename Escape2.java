package codingtest;

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

class xxy{
   int x =0;
   int y =0;
   
   public xxy(int r, int c) {
      this.x = r;
      this.y = c;
   }

}

public class Escape2 {

	static void meth() {
		
	}
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Stack<xxy> stack = new Stack<xxy>();
      
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[][] map = new int[N][M];
      
      sc.nextLine();
      
      int cnt =0;
      while(cnt < N)
      {
         String str = sc.nextLine();
         for (int i = 0; i < M; i++) {
            map[cnt][i] = (int)str.charAt(i)-'0';
         }
         cnt++;
      }
      
      int r =1;
      int c =1;
      
      r--;
      c--;
      
      
      int tCnt =0;
      int k =0;
      
      stack.push(new xxy(r,c));
     
      while(!stack.empty())
      {
         if(r < 0 || c < 0 || r > N || c > M) {
            break;
         }
         
             k=0;
             tCnt++;
             
             r = stack.peek().x;
             c = stack.peek().y;

             if(r == N-1 && c == M-1)
                break;

             if(r >= 1){//위
                if(map[r-1][c] == 1 && r-1 >=0){
                   stack.push(new xxy(r-1,c));
                   map[r-1][c] = map[r][c]+1;
                   k++;
                }
             }

             if(c >= 1) {//왼
                if(map[r][c-1] == 1 && c-1 >= 0) {
                   stack.push(new xxy(r,c-1));
                   map[r][c-1] = map[r][c]+1;
                   k++;
                }
             }
             if(c < M-1 ) {//오른
                if(map[r][c+1] == 1 && c+1 < M) {
                   stack.push(new xxy(r,c+1));
                   map[r][c+1] = map[r][c]+1;
                   	k++;
                }
             }
             if(r < N-1) {//아래
                if(map[r+1][c] == 1 && r+1 < N) {
                   stack.push(new xxy(r+1,c));
                   map[r+1][c] = map[r][c]+1;
                   k++;
                }
             }
             if(k == 0)
            	 stack.pop();

         }

      
      
      for(int[] a : map)
      {
         for(int b: a)
         {
            System.out.print(b+"   ");
         }
         System.out.println();
      }
      System.out.println(map[r][c]);
   }
}


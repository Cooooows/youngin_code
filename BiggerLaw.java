package codingtest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BiggerLaw {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(N+", "+M+", "+K);
		
		sc.nextLine();
		String arr = sc.nextLine();
		
		String[] numArr = arr.split(" ");
		int[] num = new int[N];
		
		for (int i =0; i < N; i++) {
			num[i] = Integer.parseInt(numArr[i]);
		}
		
		int bigger =0;
		int idx =0;
		int[] totArr = new int[M];
		Arrays.fill(totArr, -1);
		int bufIdx=0;

	
	   while(true)
	      {
	         if(!(IntStream.of(totArr).anyMatch(x->x == -1)))
	        	 break;
	         bigger=0;
	         
	         for(int i=0;i<num.length;i++)
	         {
	            if(bigger < num[i] && i != bufIdx)
	            {
	               bigger = num[i];
	               idx=i;
	            }
	         }
	         
	         
	         int tIdx=0;
	         for(int h =0; h<M; h++)
	         {
	            if(totArr[h] ==-1)
	            {
	               tIdx =h;
	               break;
	            }
	         }
	         
	         int k=0;
	         
	         while(tIdx < M)
	         {
	            for( k =tIdx; k < tIdx+K; k++)
	            {
	            	if(k >= M) break;
	            	if(totArr[k]==-1)
	            		totArr[k] = idx;
	            }
	            tIdx = k+1;
	         }
	         
	         bufIdx = idx;
	      }
	   
	   int sum =0;
	   for(int l : totArr)
	   {
		   sum+=num[l];
	   }
	   System.out.println(Arrays.toString(totArr));
		System.out.println(sum);
	
		
	}
}

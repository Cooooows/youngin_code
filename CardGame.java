package codingtest;

import java.util.Scanner;

public class CardGame {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long before = System.currentTimeMillis();
		int [][]arr2 =new int[N][M];
		
		for(int n =0; n < N; n++) {
			for(int s = 0; s < M; s++)
			{
				arr2[n][s] = (int)(Math.random()*10000)%20+1;
				System.out.print(arr2[n][s]+" ");
			}
			System.out.println();
		}
		
		
		int biggest =0;
		int small =333;
		for(int[] i : arr2)
		{
			small = 333;
			for(int j : i)
			{
				if(j < small)
				{
					small = j;
				}
			}
			
			if(biggest < small)
			{
				biggest = small;
			}
		}

		System.out.println(biggest);
		long after = System.currentTimeMillis();
		System.out.println("시간: "+((after-before)/1000)+"초");
	}
}

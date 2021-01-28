package codingtest;

import java.util.Scanner;

public class MaybeOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt=0;
		
		while(N != 1)
		{
			if(N%K ==0)
			{
				cnt++;
				N /= K;
			}
			else
			{
				cnt++;
				N -= 1;
			}
		}		
		System.out.println(cnt);
	}
}

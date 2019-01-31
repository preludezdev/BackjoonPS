import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class prob2293 {
	
	static int[] arr;
	static int[] dp;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		arr = new int[N+1];
		dp = new int[K+1];
		dp[0] = 1;
		
		for(int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(getCount(N, K)+"");
	}

	public static int getCount(int N, int K) {
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= K; j++) {
				if(arr[i] <= j)
					dp[j] += dp[j-arr[i]];
			}
		}
		
		return dp[K];
	}
}





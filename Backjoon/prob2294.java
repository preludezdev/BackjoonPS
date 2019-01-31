import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class prob2294 {

	static int[] arr;
	static int[] dp;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		arr = new int[N+1];
		dp = new int[K+1];

		for(int i = 1; i <= N; i++) 
			arr[i] = sc.nextInt();
		
		for(int i = 1; i <= K; i++)
			dp[i] = 10001;

		Arrays.sort(arr);

		System.out.println(getCount(N, K)+"");
	}

	public static int getCount(int N, int K) {

		for(int i = 1; i <= N; i++) {
			for(int j = arr[i]; j <= K; j++) {
				dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
			}
		}

		return dp[K] == 10001 ? -1 : dp[K];
	}
}





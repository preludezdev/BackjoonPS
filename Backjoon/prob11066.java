import java.io.*;
import java.util.Scanner;

public class prob11066 {

	static int[][] dp;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		int T =  sc.nextInt();

		for(int i = 0; i < T; i++) {
			int K = sc.nextInt();
			int[] arr = new int[K+1];

			for(int j = 1; j <= K; j++) 
				arr[j] = sc.nextInt();

			bw.write(getMinCost(arr, K)+"\n");
		}

		bw.flush();
		bw.close();
	}


	public static int getMinCost(int[] arr, int K) {
		dp = new int[K+1][K+1];

		for(int j = 2; j <= K; j++) {
			int i = 1;
			for(int currJ = j; currJ <= K; currJ++, i++) {
				
				double min = Double.POSITIVE_INFINITY;
				
				for(int mid = i; mid < currJ; mid++) {
					min = dp[i][mid] + dp[mid+1][currJ] < min ?  
							dp[i][mid] + dp[mid+1][currJ] : min;
				}

				int sum = 0;

				for(int n = i; n <= currJ; n++)
					sum += arr[n];

				dp[i][currJ] = (int)min + sum;
			}
		}

		return dp[1][K];
	}
}






import java.io.*;
import java.util.Scanner;

public class prob1912 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		int[] arr = new int[T+1];
		
		for(int i = 1; i <= T; i++)
			arr[i] = sc.nextInt();
		
		bw.write(maximumSubArray(arr)+"");
		bw.flush();
		bw.close();
	}
	
	public static int maximumSubArray(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = 0;
		
		for(int i = 1; i <= arr.length -1 ; i++) {
			if(dp[i-1] >= 0) {
				dp[i] = dp[i-1] + arr[i];
			}
			else
				dp[i] = arr[i];
		}
		
		int max = dp[1];
		for(int i = 2; i < dp.length; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		
		return max;
	}
}






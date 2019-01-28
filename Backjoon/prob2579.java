import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob2579 {
	
	static int[] stair = new int[301];  

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) 
			stair[i] = Integer.parseInt(br.readLine());

		bw.write(getSum(T)+"");
		bw.flush();
		bw.close();
	}

	public static int getSum(int T) {
		int[] dp = new int[301];
		
		dp[1] = stair[1];
		dp[2] = stair[1] + stair[2];
		dp[3] = Math.max(stair[1] + stair[3], stair[2] + stair[3]);
		
		for(int i = 4; i <= T; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + stair[i-1]) + stair[i];
		}
		
		return dp[T];
	}
}





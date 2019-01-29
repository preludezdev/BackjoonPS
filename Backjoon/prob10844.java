import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob10844 {
	
	static long[][] dp = new long[101][10];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		bw.write(getCount(T)+"");
		bw.flush();
		bw.close();
	}

	public static long getCount(int T) {
		//√ ±‚»≠
		for(int i = 1; i <= 9; i++)
			dp[1][i] = 1;
		
		for(int n = 2; n <= T; n++) {
			//0
			dp[n][0] = dp[n-1][1] % 1000000000;
			//1~8
			for(int k = 1; k <= 8; k++)
				dp[n][k] = dp[n-1][k-1] + dp[n-1][k+1] % 1000000000;
			//9
			dp[n][9] = dp[n-1][8] % 1000000000;
		}
		
		long sum = 0;
		for(int i = 0; i <= 9; i++)
			sum = (sum + dp[T][i]) % 1000000000;
		
		return sum % 1000000000;
	}
}





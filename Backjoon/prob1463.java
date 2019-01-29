import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob1463 {
	
	static int[] dp = new int[1000001];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		bw.write(getMin(T)+"");
		bw.flush();
		bw.close();
	}

	public static int getMin(int T) {
		dp[1] = 0;
		
		for(int i = 2; i <= T; i++) {
			int dividedByThree = i % 3 == 0 ? dp[i/3] : 10000000;
			int dividedByTwo = i % 2 == 0 ? dp[i/2] : 10000000;
			int subtractedOne = dp[i-1];
			
			//dp[n] : 해당 위치에 도달할 때 걸리는 최소비용
			// 세 가지 경우의 수 중 최소비용에 +1 해준다.
			int min = 0;
			if(dividedByThree <= dividedByTwo) {
				if(dividedByThree <= subtractedOne) {
					min = dividedByThree;
				}
				else {
					min = subtractedOne;
				}
			}
			else {
				if(subtractedOne <= dividedByTwo) {
					min = subtractedOne;
				}
				else {
					min = dividedByTwo;
				}
			}
			dp[i] = min + 1;
		}
		
		return dp[T];
	}
}





import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob2749 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long N = Long.parseLong(br.readLine());
		int mod = 1000000;
		int P = 15 * mod / 10; //M = 10^k �� �� �ǻ���ֱ� ���ϴ� ����.
		
		//�ǻ�� �ֱⰡ P�� ��
		//N��° �Ǻ���ġ ���� K�� ���� �������� 
		//N%P��° �Ǻ���ġ ���� K�� ���� �������� ����.
		bw.write(fib((int)(N%P), P, mod)+"");
		bw.flush();
		bw.close();
	}
	
	public static long fib(int n, int p, int mod) {
		long[] dp = new long[p];
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i < p; i++) {
			dp[i] = (dp[i-2] + dp[i-1])%mod;
		}
		
		return dp[n] % mod;
	}
}

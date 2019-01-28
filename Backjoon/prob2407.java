import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class prob2407 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int r = Integer.parseInt(temp[1]);
		
		bw.write(nCr(n,r));
		bw.flush();
		bw.close();
		
	}
	
	public static String nCr(int n, int r) {
		if(n < r) return "-1"; // ¿¡·¯
		if(n == 0) return "1";
		
		BigInteger[][] combi = new BigInteger[n+1][n+1];
		
		for(int i = 0; i < combi.length; i++) {
			combi[i][0] = BigInteger.valueOf(1);
			combi[i][1] = BigInteger.valueOf(i);
			combi[i][i] = BigInteger.valueOf(1);
		}
		
		for(int i = 2; i < combi.length; i++) {
			for(int j = 2; j <= i - 1; j++) {
				combi[i][j] = combi[i-1][j-1].add(combi[i-1][j]);
			}
		}
		
		return combi[n][r].toString();
	}
}





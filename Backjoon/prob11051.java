import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob11051 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int r = Integer.parseInt(temp[1]);
		
		bw.write(nCr(n,r)+"");
		bw.flush();
		bw.close();
		
	}
	
	public static long nCr(int n, int r) {
		if(n < r) return -1; // ¿¡·¯
		if(n == 0) return 1;
		
		int[][] combi = new int[n+1][n+1];
		
		for(int i = 0; i < combi.length; i++) {
			combi[i][0] = 1;
			combi[i][1] = i;
			combi[i][i] = 1;
		}
		
		for(int i = 2; i < combi.length; i++) {
			for(int j = 2; j <= i - 1; j++) {
				combi[i][j] = combi[i-1][j-1] + combi[i-1][j] % 10007;
			}
		}
		
		return combi[n][r] % 10007 ;
	}
}





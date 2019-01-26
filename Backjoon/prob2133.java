import java.io.*;

public class prob2133 {

	static long[] arr;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		arr = new long[n+1];
		bw.write(dp(n)+"\n");

		bw.flush();
		bw.close();
	}

	public static long dp(int n) {
		if(n == 0) return 1;
		if(n % 2 == 1) return 0;
		if(n == 3) return 3;

		if(arr[n] != 0)	{
			return arr[n];
		}
		else {
			arr[n] = 3*dp(n-2);

			for(int i = 4; i <= n; i = i+2)  
				arr[n] += 2*dp(n-i);

			return arr[n];
		}
	}
}





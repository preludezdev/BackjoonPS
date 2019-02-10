import java.util.Scanner;

public class prob11049 {
	
	static int[][] dp;
	static int[][] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		dp = new int[N+1][N+1];
		arr = new int[N+1][2];
		
		for(int i = 1; i <= N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		System.out.println(getMinCost(N)+"");
		
	}
	
	public static int getMinCost(int n) {		
		
		for(int j = 2; j <= n; j++) {
			int i = 1;
			for(int currJ = j; currJ <= n; currJ++, i++) {

				double min = Double.POSITIVE_INFINITY;

				for(int mid = i; mid < currJ; mid++) {
					min = dp[i][mid] + dp[mid+1][currJ] + arr[i][0] * arr[mid][1] * arr[currJ][1] < min ?  
							dp[i][mid] + dp[mid+1][currJ] + arr[i][0] * arr[mid][1] * arr[currJ][1] : min;
				}

				dp[i][currJ] = (int)min;	
			}
		}
		
		
		return dp[1][n];
	}

}

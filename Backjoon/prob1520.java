import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class prob1520 {

	static int[][] arr;
	static int[][] dp;
	static int[] X = {-1,1,0,0}; //상하좌우
	static int[] Y = {0,0,-1,1};

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		arr = new int[M+2][N+2];
		dp = new int[M+2][N+2];

		for(int i = 1; i <= M; i++) 
			for(int j = 1; j <= N; j++) 
				arr[i][j] = sc.nextInt();
		
		for(int[] row : dp)
			Arrays.fill(row, -1);

		System.out.println(gotoDest(1,1)+"");
	}


	public static int gotoDest(int i, int j) {
		int sum = 0;
		
		//한번 목적지에서 현재위치로 돌아오는 경우의 수를 구했으면
		//저장했다가 그대로 쓴다.
		//여기서 타임로스를 줄일 수 있다.
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		if(arr[i][j] == arr[arr.length - 2][arr[0].length - 2]) {
			dp[i][j] = 1;
			return dp[i][j];
		}

		for(int direction = 0; direction < 4; direction++) { //상하좌우
			int nextX = i + X[direction];
			int nextY = j + Y[direction];
			
			if(arr[nextX][nextY] != 0 && arr[nextX][nextY] < arr[i][j])
				sum += gotoDest(nextX, nextY);
		}
		
		dp[i][j] = sum;
		return dp[i][j];
	}
}






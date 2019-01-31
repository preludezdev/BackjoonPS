import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class prob2156 {

	static int[] arr = new int[10001];
	static int[] dp = new int[10001];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();

		System.out.println(getMaxAmount(n)+"");
	}

	public static int getMaxAmount(int n) {
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		
		for(int i = 3; i <= n; i++) 
			dp[i] = getMax(dp[i-3] + arr[i-1]+arr[i], dp[i-2] + arr[i], dp[i-1]);
		
		return dp[n];
	}
	
	public static int getMax(int a, int b, int c) {
		if(a > b) {
			if(a > c) return a;
			else return c;
		}
		else {
			if(b > c) return b;
			else return c;
		}
	}
}





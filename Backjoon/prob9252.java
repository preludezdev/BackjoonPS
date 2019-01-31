import java.io.*;
import java.util.Scanner;

public class prob9252 {

	static int[][] dp;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		System.out.println(lcs(str1,str2));
		System.out.println(lcsString(str1,str2));
	}


	public static int lcs(String str1, String str2) {
		dp = new int[str1.length() + 1][str2.length() + 1];

		for(int i = 1; i <= str1.length(); i++) {
			for(int j = 1; j <= str2.length(); j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}

		return dp[str1.length()][str2.length()];
	}
	
	public static String lcsString(String str1, String str2) {
		StringBuffer str = new StringBuffer();
		
		//dp[X][Y]
		//시작위치
		int X = str1.length();
		int Y = str2.length();
		
		while(dp[X][Y] != 0) {
			if(str1.charAt(X-1) == str2.charAt(Y-1)) {
				str.append(str1.charAt(X-1));
				X--;
				Y--;
			}
			else {
				if(dp[X-1][Y] > dp[X][Y-1])
					X--;
				else
					Y--;
			}
		}
		
		return str.reverse().toString();
	}
}






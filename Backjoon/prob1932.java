import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob1932 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int[][] board = new int[T][T];
		
		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			
			for(int j = 0; j < temp.length; j++) {
				int curr = Integer.parseInt(temp[j]);
				
				if(i == 0 && j == 0)
					board[i][j] = curr;
				else if(j == 0) 
					board[i][j] = curr + board[i-1][j];
				else if(i == j) 
					board[i][j] = curr + board[i-1][j-1];
				else {
					int left = board[i-1][j-1];
					int right = board[i-1][j];
					
					board[i][j] = curr + Math.max(left, right);
				}
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < T; i++) 
			max = board[T-1][i] > max ? board[T-1][i] : max;
		
		bw.write(max+"");
		bw.flush();
		bw.close();
	}
}





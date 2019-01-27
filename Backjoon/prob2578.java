import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob2578 {

	static int[][] board = new int[5][5];
	static int[][] countingArr = new int[3][5];
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp;
		
		for(int i = 0; i < 5; i++) {
			temp = br.readLine().split(" ");
			for(int j = 0; j < 5; j++) {
				board[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
		int[] nums = new int[25];
		
		for(int i = 0; i< 5; i++) {
			temp = br.readLine().split(" ");
			for(int j = 0; j < 5; j++) {
				nums[i*5 + j] = Integer.parseInt(temp[j]);
			}
		}
		
		bw.write(getBingo(nums)+"\n");

		bw.flush();
		bw.close();
	}

	public static int getBingo(int[] nums) {
		for(int n = 0; n < nums.length; n++) {
			int curr = nums[n];
			
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board.length; j++) {
					if(board[i][j] == curr) {
						countingArr[0][i]++;
						countingArr[1][j]++;
						
						if(i == j) 
							countingArr[2][0]++;
						if(i == board.length - 1 -j)
							countingArr[2][1]++;
						
						if(countBingo() >= 3)
							return n+1;
					}
				}
			}
		}
		return -1; // -1을 리턴하면 에러
	}
	
	public static int countBingo() {
		int count = 0;
		
		for(int i = 0; i < board.length; i++) {
			if(countingArr[0][i] == board.length)
				count++;
			if(countingArr[1][i] == board.length)
				count++;
			if(countingArr[2][i] == board.length)
				count++;
		}
		return count;
	}
}






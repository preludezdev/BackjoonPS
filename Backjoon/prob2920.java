

import java.io.*;

public class prob2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0; // 7 : ascending , -7 : descending , else : mixed
		String rtn;
		try {
			String input = br.readLine();
			
			String[] temp = input.trim().split(" ");
			int[] inputArr = new int[temp.length];
			
			for(int i = 0 ; i < inputArr.length; i++) {
				inputArr[i] = Integer.parseInt(temp[i]);
			}
			
			for(int i = 1 ; i < inputArr.length; i++) {
				if(inputArr[i]-inputArr[i-1] > 0)
					result++;
				else
					result--;
			}
			
			if(result == 7)
				rtn = "ascending";
			else if (result == -7)
				rtn = "descending";
			else
				rtn = "mixed";
			
			bw.write(rtn);
			bw.flush();
			bw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}

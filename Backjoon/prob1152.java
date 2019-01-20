

import java.io.*;

public class prob1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int count = 0;
			String input = br.readLine();
			input = input.trim();
			if(input.equals("")) {
				count = 0;
			}
			else {
				String[] arr = input.split(" ");
				count = arr.length;
			}

			bw.write(count+"");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

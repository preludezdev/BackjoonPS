import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int[] arr = new int[5];
			int sum = 0;
			for(int i = 0 ; i < arr.length; i ++) {
				int temp = Integer.parseInt(br.readLine());
				arr[i] = temp > 40 ? temp : 40;
				sum += arr[i];
			}
			int avg = sum/5;
			bw.write(avg+"");
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

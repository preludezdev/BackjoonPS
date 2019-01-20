import java.io.*;

public class prob8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int count = Integer.parseInt(br.readLine());

			for(int i = 0 ; i < count ; i ++) {
				String input = br.readLine().trim();
				bw.write(getSum(input)+"\n");
			}
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

	public static int getSum(String input) {
		int sum;
		if(input.equals("")) {
			sum = 0;
		}
		else {
			int[] arr = new int[input.length()];
			for(int i = 0 ; i < arr.length; i++)
				arr[i] = 0;
			
			arr[0] = input.charAt(0) == 'O' ? 1 : 0;
			sum = arr[0];
			
			for(int k = 1 ; k < input.length(); k++) {
				arr[k] = input.charAt(k) == 'O' ? arr[k-1] + 1 : 0;
				sum = sum + arr[k];
			}
		}
		return sum;
	}

}

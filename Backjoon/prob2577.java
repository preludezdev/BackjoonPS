
import java.io.*;

public class prob2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int a =  Integer.parseInt(br.readLine());
			int b =  Integer.parseInt(br.readLine());
			int c =  Integer.parseInt(br.readLine());
			
			int result = a*b*c;
			
			//array
			int[] arr = new int[10];
			
			for(int i = 0 ; i < arr.length ; i++)
				arr[i] = 0;
			
			String resultStr =  result+"";
			
			for(int i = 0; i < resultStr.length(); i++) 
				arr[resultStr.charAt(i)-48]++;
			
			for(int i = 0 ; i < arr.length; i++)
				bw.write(arr[i]+"\n");
				
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



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class prob4344 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {			
			//입력의 첫번째 줄
			int count = Integer.parseInt(br.readLine());
			double max = 0;
			double[] arr = new double[count];
			
			//입력의 두번째 줄
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0 ; i < count ; i++) {				
				String tempString = st.nextToken();
				arr[i] = Integer.parseInt(tempString);
				
				//최고점수 구하기
				if(arr[i] > max)
					max = arr[i];				
			}
			
			double result = 0;
			
			for(int i = 0 ; i < count; i++) {
				arr[i] = (arr[i] / max)*100;
				String fakeScore = String.format("%.2f", arr[i]);
				result += Double.parseDouble(fakeScore);
			}
			
			bw.write(String.format("%.2f",(result/(double)count)));
			bw.flush();
			bw.close();
		}catch(IOException e) {
			
		}		
	}	
}




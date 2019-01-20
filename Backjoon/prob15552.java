import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class prob15552 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));;
		StringTokenizer st;
		
		try {				
			int n = Integer.parseInt(br.readLine());			
						
			for(int i = 0 ; i < n ; i ++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				bw.write((x+y)+"\n");
			}
			
			bw.flush();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

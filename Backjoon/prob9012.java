import java.io.*;

public class prob9012 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer result = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			boolean isVPS = true;
			String input = br.readLine();
			int sum = 0;
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == '(') {
					sum++;
				}
				else if(input.charAt(j)==')') {
					if(sum == 0) {
						isVPS = false;
						break;
					}
					sum--;
				}
			}
			if(!isVPS)
				result.append("NO\n");
			else if(sum == 0)
				result.append("YES\n");
			else
				result.append("NO\n");
		}

		bw.write(result.toString());		
		bw.flush();
		bw.close();
	}
}


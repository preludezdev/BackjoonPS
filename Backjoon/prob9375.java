import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class prob9375 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int nums = Integer.parseInt(br.readLine());
			
			HashMap<String,Integer> hm = new HashMap<>();
			for(int j = 0; j < nums; j++) {
				String[] temp = br.readLine().split(" ");
				int val = hm.containsKey(temp[1]) ? hm.get(temp[1]) + 1 : 1; 
				hm.put(temp[1], val);
			}
			
			Iterator<Entry<String,Integer>> iterator = hm.entrySet().iterator();

			int count = 1;
			
			while(iterator.hasNext()) {
				count *= (iterator.next().getValue()+1);
			}
			
			count = count -1;
			
			bw.write(count+"\n");
		}

		bw.flush();
		bw.close();
	}
}





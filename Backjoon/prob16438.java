import java.io.*;

public class prob16438 {

	static StringBuffer[] teamOrder = new StringBuffer[7];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer initiation = new StringBuffer();
		
		
		int n = Integer.parseInt(br.readLine());
		
		initiation.append("AB");
		for(int i = 2; i < n; i++)
			initiation.append("A");
		
		int count = (int) Math.ceil(Math.log10(n) / Math.log10(2));
		
		
		for(int i = 0; i < 7; i++) 
			teamOrder[i] = new StringBuffer();
		
		arrangeTeamOrder(n, 0, count);
		
		for(int i = count; i < 7; i++)
			teamOrder[i].append(initiation.toString());
		
		for(StringBuffer sb : teamOrder)
			bw.write(sb+"\n");

		bw.flush();
		bw.close();
	}
	static boolean makeRandomChar;
	public static void arrangeTeamOrder(int n, int currIndex, int count) {
		if(currIndex == count) return;
		
		if(n == 0) return;
		
		//n이 1이면 다른쪽에서 정렬할게 있다는 뜻
		if(n == 1) {
			teamOrder[currIndex].append("B");
			return;
		}

		int half = n/2;

		for(int i = 0; i < half; i++)
			teamOrder[currIndex].append("A");
		for(int i = half; i < n; i++)
			teamOrder[currIndex].append("B");
		
		int nextIndex = currIndex + 1;
		arrangeTeamOrder(half, nextIndex, count);
		arrangeTeamOrder(n - half, nextIndex, count);
	}
}





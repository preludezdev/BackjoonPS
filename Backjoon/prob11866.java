import java.io.*;
import java.util.*;

public class prob11866 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		bw.write("<"+getOrder(N,M)+">");
		bw.flush();
		bw.close();
	}

	public static String getOrder(int N, int M) {
		StringBuffer rtn = new StringBuffer();
		int target = M;

		LinkedList<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++)
			queue.add(i);

		while(!queue.isEmpty()) {
			int count = 0;
			for(int i = 0; i < M-1; i++) {
				queue.add(queue.poll());
			}
			rtn.append(queue.poll());
			if(!queue.isEmpty())
				rtn.append(", ");
		}
		return rtn.toString();
	}
}




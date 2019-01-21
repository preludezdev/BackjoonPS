import java.io.*;
import java.util.LinkedList;

public class prob10845 {
	
	public static LinkedList<String> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer result = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++)
			result.append(queue(br.readLine()));
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
	
	public static String queue(String input) {
		StringBuffer rtn = new StringBuffer();
		String[] comm = input.split(" ");
		
		switch(comm[0]) {
		case "push":
			queue.add(comm[1]);
			return "";
		case "pop":
			rtn.append(queue.isEmpty() ? "-1" : queue.poll());
			break;
		case "size":
			rtn.append(queue.size());
			break;
		case "empty":
			rtn.append(queue.isEmpty() ? "1" : "0");
			break;
		case "front":
			rtn.append(queue.isEmpty() ? "-1" : queue.peek());
			break;
		case "back":
			rtn.append(queue.isEmpty() ? "-1" : queue.get(queue.size()-1));
			break;
		}
		rtn.append("\n");
		return rtn.toString();
	}
	
	
}


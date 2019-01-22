import java.io.*;
import java.util.*;

public class prob10866 {

	static LinkedList<String> deque = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++)
			bw.write(deque(br.readLine()));
		
		bw.flush();
		bw.close();
	}

	public static String deque(String input) {
		StringBuffer rtn = new StringBuffer();
		
		
		String[] comm = input.split(" ");
		
		switch(comm[0]) {
		case "push_front" :
			deque.addFirst(comm[1]);
			return "";
		case "push_back" :
			deque.addLast(comm[1]);
			return "";
		case "pop_front" :
			rtn.append(deque.isEmpty() ? "-1" : deque.removeFirst());
			break;
		case "pop_back" :
			rtn.append(deque.isEmpty() ? "-1" : deque.removeLast());
			break;
		case "size" :
			rtn.append(deque.size());
			break;
		case "empty" :
			rtn.append(deque.isEmpty() ? "1" : "0");
			break;
		case "front" :
			rtn.append(deque.isEmpty() ? "-1" : deque.peekFirst());
			break;
		case "back" :
			rtn.append(deque.isEmpty() ? "-1" : deque.peekLast());
			break;
		default :
			break;
		}
		return rtn.toString()+"\n";
	}
}




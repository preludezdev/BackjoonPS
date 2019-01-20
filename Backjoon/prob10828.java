import java.io.*;
import java.util.*;

public class prob10828 {

	static ArrayList<Integer> al = new ArrayList<>();

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T ; i++) {
			bw.write(stackController(br.readLine()));
		}

		bw.flush();
		bw.close();

	}

	public static String stackController(String command) {
		String rtn = "";
		String[] arr = command.split(" ");

		switch(arr[0]){
		case "push" :
			al.add(Integer.parseInt(arr[1]));
			break;
		case "pop" :
			int last = al.size()-1;
			if(last == -1) 
				rtn = "-1\n";
			else {
				rtn = al.get(last)+"\n";
				al.remove(last);
			}
			break;
		case "size" :
			rtn = al.size()+"\n";
			break;
		case "empty" :
			rtn = al.isEmpty() ? "1\n" : "0\n";
			break;
		case "top" :
			rtn = al.isEmpty() ? "-1\n" : al.get(al.size()-1)+"\n";
			break;
		default :
			break;
		}
		return rtn;
	}
}

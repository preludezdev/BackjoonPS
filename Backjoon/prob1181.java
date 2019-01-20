

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class prob1181 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//ют╥б
		int T = Integer.parseInt(br.readLine());

		ArrayList<Model> al = new ArrayList<>();
		
		for(int i = 0 ; i < T ; i++) {
			Model model = new Model(br.readLine());
			if(!al.contains(model))
				al.add(model);
		}
		
		Collections.sort(al);
		
		for(Model object : al)
			bw.write(object.getString()+"\n");
		
		bw.flush();
		bw.close();
	}
}

class Model implements Comparable<Model>{
	private String mStr;
	
	Model(String str){
		this.mStr = str;
	}
	
	public int length() {
		return mStr.length();
	}
	
	public String getString() {
		return mStr;
	}
	
	@Override
	public boolean equals(Object object) {
		if(compareTo((Model)object) == 0)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Model other) {
		// TODO Auto-generated method stub
		if(this.length() < other.length())
			return -1;
		else if (this.length() > other.length())
			return 1;
		else {
			for(int i = 0; i < this.length(); i++) {
				if(mStr.charAt(i) < other.mStr.charAt(i))
					return -1;
				else if(mStr.charAt(i) > other.mStr.charAt(i))
					return 1;
			}
			return 0;
		}
	}
	
	
}


package temp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	static int[] arr;
	//에라토스테네스의 채 구현
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//에라토스테네스의 채 구현
		arr = new int[10000+1];
		for(int i = 2; i <= Math.sqrt(10000); i++) {
			if(arr[i] == 0) {
				for(int j = 2; i*j <= 10000; j++) {
					arr[i*j] = 1;
				}
			}
		}

		//입력
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());

			ArrayList<Integer> al = new ArrayList<>();
			int mid = 0;
			for(int j = 2; j < n; j++) {
				if(checkPrimaryNumber(j)) {
					if(j <= n/2) mid = j;
					al.add(j);
				}
			}
			
			for(int k = al.indexOf(mid); k >= 0; k--) {
				if(checkPrimaryNumber(n-al.get(k))) {
					bw.write(al.get(k) +" " + (n-al.get(k)) + "\n");
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
	public static boolean checkPrimaryNumber(int num) {
		if(num == 1) return false;
		if(arr[num] == 0) return true;
		else
			return false;
	}
}


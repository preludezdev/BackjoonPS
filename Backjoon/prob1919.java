

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob1919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inputWord01,inputWord02;
		
		try {
			inputWord01 = br.readLine();
			inputWord02 = br.readLine();
			
			int count = 0;
			int[] arr01 = new int[26];
			int[] arr02 = new int[26];
			
			//초기화
			for(int i = 0; i < 26; i++) {
				arr01[i] = 0;
				arr02[i] = 0;
			}
			
			//알고리즘
			for(int i = 0 ; i < inputWord01.length(); i++) {
				arr01[inputWord01.charAt(i)-97]++;
			}
			
			for(int i = 0 ; i < inputWord02.length(); i++) {
				arr02[inputWord02.charAt(i)-97]++;
			}
				
			for(int i = 0 ; i < 26 ; i ++) {
				count = count + Math.abs(arr01[i] - arr02[i]);
			}
			
			bw.write(count+"");
			bw.flush();
			bw.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class prob4673 {
	
	static int[] arr = new int[10000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st;

		StringBuffer result = new StringBuffer();
		
		for(int i = 0; i < 10000; i++) {
			arr[i] = i+1;
		}
		
		try {						
			recFunctionHelper();			
			for(int i = 0 ; i < 10000 ; i++) {
				if(arr[i] !=0)
					result.append(arr[i]+"\n");
			}

			bw.write(result.toString());
			bw.flush();
			bw.close();

		}catch(IOException e) {

		}			
	}

	static void recFunctionHelper() {
		for(int i = 0; i < 10000; i++) {
			recFunction(i+1);
		}
	}
	
	static void recFunction(int i) {
		int nextVal = mathFunction(i);
		
		if(nextVal > 10000)
			return;
		
		if(arr[i-1] != 0) { // �����ѹ��� �ƴϸ� 0���� ����鼭 �����Ѵ�. ���߿� �ݺ��� �� ������  ���� 0�� �ƴѰ� �����ѹ��� �ȴ�.
			recFunction(nextVal);
			arr[nextVal-1] = 0;
		}
		//0�̸� ���̻� ���� ����(�̹� ���� �� ���� ����)
	}
	
	static int mathFunction(int n) {
		String temp = n+"";
		int sum = 0;
		for(int i = 0 ; i < temp.length(); i++) {
			sum = sum + Character.getNumericValue(temp.charAt(i));
		}
		return n+sum;
	}
}


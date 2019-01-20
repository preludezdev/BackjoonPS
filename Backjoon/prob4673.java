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
		
		if(arr[i-1] != 0) { // 셀프넘버가 아니면 0으로 만들면서 진행한다. 나중에 반복문 다 돌고나면  값이 0이 아닌게 셀프넘버가 된다.
			recFunction(nextVal);
			arr[nextVal-1] = 0;
		}
		//0이면 더이상 진행 금지(이미 전에 다 밟은 길임)
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


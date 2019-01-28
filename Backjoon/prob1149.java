import java.io.*;

public class prob1149 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[3]; //현재 이 인덱스에 올 수 있는 합 중 최소값
		
		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			int newA = Integer.parseInt(temp[0]);
			int newB = Integer.parseInt(temp[1]);
			int newC = Integer.parseInt(temp[2]);
			
			int a = arr[0];
			int b = arr[1];
			int c = arr[2];

			arr[0] = newA + Math.min(b, c);
			arr[1] = newB + Math.min(c, a);
			arr[2] = newC + Math.min(a, b);
		}
		
		if(arr[0] <= arr[1] && arr[0] <= arr[2])
			bw.write(arr[0]+"");
		else if(arr[1] <= arr[2] && arr[1] <= arr[0])
			bw.write(arr[1]+"");
		else 
			bw.write(arr[2]+"");
		
		bw.flush();
		bw.close();
	}
}





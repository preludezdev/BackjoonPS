import java.io.*;
import java.util.Scanner;

public class prob2805 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();

		long[] arr = new long[1000001];
		long maxHeight = 0;

		for(int i = 0; i < N; i++) { //n
			arr[i] = sc.nextLong();

			if(arr[i] > maxHeight)
				maxHeight = arr[i];
		}

		long H = 0;
		long start = 0;
		long mid = 0;
		long end = maxHeight;

		while(start <= end) {
			mid = (start + end)/2;
			long sum = 0;

			for(int i = 0; i < N; i++) {
				if(arr[i] - mid > 0)
					sum += arr[i] - mid; 
			}

			if(sum >= M) {
				if(H < mid) H = mid;
				start = mid + 1;
			}
			else 
				end = mid - 1;
		}

		System.out.println(H+"");
	}
}





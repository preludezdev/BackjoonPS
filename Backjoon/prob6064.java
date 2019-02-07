import java.io.*;
import java.util.Scanner;

public class prob6064 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = sc.nextInt();

		for(int i = 0; i < T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			bw.write(findK(M,N,x,y)+"\n");
		}

		bw.flush();
		bw.close();
		sc.close();
	}

	public static int findK(int M, int N, int x, int y) {
		int lcm = getLCM(M,N);

		for(int loop = 0; loop < lcm/M; loop++) {
			int k = M*loop + x;

			if(k % N == y) return k;
			if(k % N == 0 && y == N) return k;
		}

		return -1;
	}

	public static int getLCM(int x, int y) {
		return x*y / getGCD(x,y);
	}

	public static int getGCD(int x, int y) {
		if(x < y) {
			int temp = x;
			x = y;
			y = temp;
		}

		int n;
		while(y != 0) {
			n = x%y;
			x = y;
			y = n;
		}

		return x;
	}
}


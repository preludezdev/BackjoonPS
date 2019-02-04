import java.io.*;
import java.util.Scanner;

public class prob11729 {
	
	static StringBuilder sb = new StringBuilder();
	static int count = 0;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		hanoi(K,1,3);
		
		System.out.println(count);
		System.out.println(sb.toString());
	}
	
	public static void hanoi(int n, int start, int dest) {
		if(n == 0) return;
		
		int mid = 6 - (start + dest);
		
		hanoi(n-1, start, mid);
		
		sb.append(start + " " + dest + "\n");
		count++;
		
		hanoi(n-1, mid, dest);
	}
}

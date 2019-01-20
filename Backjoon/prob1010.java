
import java.util.Scanner;

public class prob1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int M,N;
		int[][] dP;
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		

		for(int n = 0; n < count ; n++) {
			dP = new int[31][];
			for(int i = 0 ; i < dP.length ; i++) {
				dP[i] = new int[31];
			}
			
			N = sc.nextInt();
			M = sc.nextInt();
			
			//dP 생성
			//dP[N][M]
			for(int i = 0; i<=M;i++) {
				dP[1][i] = i; 
			}
			
			for(int i = 2; i <=N;i++) {
				for(int j = i ; j <=M; j++) {
					for(int k = i; k <= j ; k++) {
						dP[i][j] += dP[i-1][k-1];
					}
				}
			}
			
			System.out.println(dP[N][M]);
		}
	}
}

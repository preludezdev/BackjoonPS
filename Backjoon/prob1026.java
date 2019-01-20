import java.util.Scanner;

public class prob1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] A = new int[count];
		int[] B = new int[count];

		for(int i = 0; i < count ; i++)
			A[i] = sc.nextInt();

		for(int i = 0; i < count ; i++)
			B[i] = sc.nextInt();

		//알고리즘
		//버블소트
		for(int j = 0; j < count; j++) {
			for(int i = count-1; i > 0 ; i--) {
				if(B[i] < B[i-1]) {
					int temp = B[i-1];
					B[i-1] = B[i];
					B[i] = temp;
				}
			}
		}
		
		for(int j = 0; j < count; j++) {
			for(int i = count-1; i > 0 ; i--) {
				if(A[i] < A[i-1]) {
					int temp = A[i-1];
					A[i-1] = A[i];
					A[i] = temp;
				}
			}
		}

		int sum = 0;
		for(int i=0, j = count-1; i < count; i++,j--) {
			sum+= A[i]*B[j];
		}

		System.out.println(sum);		
	}

}

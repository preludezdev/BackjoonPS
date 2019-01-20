
//아직 못풀음

import java.util.Scanner;

public class prob1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int sumOfNotSqrt = 0;

		for(int i = min ; i <= max ; i++) {

			double value = Math.sqrt(i);
			double result = value - (int)value;

			if(result == 0.0) {
			}
			else {
				sumOfNotSqrt++;
			}
		}
		System.out.println(sumOfNotSqrt);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prob1924 {
	public static void main(String args[]) {
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] date = {"MON","TUE", "WED", "THU", "FRI", "SAT","SUN"};

		int totalDays = 0;
		
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			StringTokenizer st = new StringTokenizer( br.readLine() );

			int x = Integer.parseInt( st.nextToken() );
			int y = Integer.parseInt( st.nextToken() );

			for(int i = 1 ; i < x ; i++) {
				totalDays += months[i-1];
			}
			totalDays += y;

			System.out.println(date[ (totalDays-1)%7 ]);	
		}catch(IOException e) {

		}
	}
}

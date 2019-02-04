import java.io.*;
import java.util.Scanner;

public class prob1107 {

	static int[] left = new int[10];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		String target = sc.nextLine();
		int errorCount = sc.nextInt();

		for(int i = 0; i < 10; i++)
			left[i] = i;

		//배열값이 -1 이면 고장난 버튼이란 뜻.
		for(int i = 0; i < errorCount; i++) {
			int error = sc.nextInt();
			left[error] = -1;
		}

		int count1 = Math.abs(Integer.parseInt(target) - 100);
		int count2 = getCount2(target);

		if(errorCount == 10) 
			System.out.println(count1);
		else {
			if(count1 < count2) 
				System.out.println(count1);
			else
				System.out.println(count2);
		}

		sc.close();
	}

	//만들 수 있는 모든 경우의 수와 타겟과의 차를 계산하고 
	//그 중 제일 최소가 되는 숫자를 찾아 리턴한다.
	public static int getCount2(String target) {
		int minDiff = 500001;
		int currDiff = 500001;
		
		//모든 경우의 수
		for(int i = 0; i <= 999999; i++) {
			String curr = i+"";

			if(checkIfErrorHappen(curr)) 
				continue;
			else {
				currDiff = Math.abs(Integer.parseInt(curr) - Integer.parseInt(target)) 
						+ curr.length();
				minDiff = currDiff < minDiff ? currDiff : minDiff;
			}
		}

		return minDiff;
	}

	//해당 숫자가 에러를 피하는지 체크
	public static boolean checkIfErrorHappen(String curr) {
		for(int e = 0; e < curr.length(); e++) {
			if(left[curr.charAt(e) - '0'] == -1) {
				return true;
			}
		}
		
		return false;
	}
}








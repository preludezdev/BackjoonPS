import java.io.*;
import java.util.Scanner;

public class prob1024 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		double L = sc.nextDouble();
		
		boolean isExist = false;
		double answerL;
		double firstNum = 0.0;
		
		//L부터 100까지 해당 식이 정수로 나오는지 체크
		//안나오면 -1 출력 후 종료
		for(answerL = L; answerL <= 100; answerL++) {
			firstNum = (4*N + 2*answerL - 2*answerL*answerL) / (4*answerL);
			
			//음이 아닌 정수리스트 이므로 첫 숫자가 음수면 해당사항 안됨.
			if(firstNum < 0) continue;
			
			if(firstNum - (int)firstNum == 0) {
				isExist = true;
				break;
			}
		}
		
		StringBuffer rtn = new StringBuffer();
		
		if(isExist) {
			for(int i = 0; i < answerL; i++)
				rtn.append((int)firstNum++ + " ");
		}
		else {
			rtn.append("-1");
		}
		
		System.out.println(rtn.toString());
	}
}

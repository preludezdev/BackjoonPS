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
		
		//L���� 100���� �ش� ���� ������ �������� üũ
		//�ȳ����� -1 ��� �� ����
		for(answerL = L; answerL <= 100; answerL++) {
			firstNum = (4*N + 2*answerL - 2*answerL*answerL) / (4*answerL);
			
			//���� �ƴ� ��������Ʈ �̹Ƿ� ù ���ڰ� ������ �ش���� �ȵ�.
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

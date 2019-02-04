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

		//�迭���� -1 �̸� ���峭 ��ư�̶� ��.
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

	//���� �� �ִ� ��� ����� ���� Ÿ�ٰ��� ���� ����ϰ� 
	//�� �� ���� �ּҰ� �Ǵ� ���ڸ� ã�� �����Ѵ�.
	public static int getCount2(String target) {
		int minDiff = 500001;
		int currDiff = 500001;
		
		//��� ����� ��
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

	//�ش� ���ڰ� ������ ���ϴ��� üũ
	public static boolean checkIfErrorHappen(String curr) {
		for(int e = 0; e < curr.length(); e++) {
			if(left[curr.charAt(e) - '0'] == -1) {
				return true;
			}
		}
		
		return false;
	}
}








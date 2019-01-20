import java.io.*;
import java.util.*;

public class prob1874 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer result = new StringBuffer();
		int T = Integer.parseInt(br.readLine());
		int[] val = new int[T]; // �Է°�

		for(int i = 0 ; i < T ; i++) {
			val[i] = Integer.parseInt(br.readLine());
		}

		ArrayList<Integer> stack = new ArrayList<>();

		int count = 0; // pop Ƚ�� 
		int push = 1; // ���� Ǫ���ؾ��� ����
		int curr = 0; // ���� ������ top
		//ã�� ���� ���� �ε������� ũ�� Ǫ��
		//ã�� ���� ���� �ε������� ������ ��
		//�̶� ã�� ���� �̹� �� �Ǿ����� NO
		while(count < T) {
			if(stack.size() == 0 )
				curr = 0;
			else
				curr = stack.get(stack.size()-1);

			if(curr < val[count]) { //push
				stack.add(push);
				push++;
				result.append("+\n");
			}
			else if(curr == val[count]) { //pop�� �ȵ����� pop or NO
				stack.remove(stack.size()-1);
				result.append("-\n");
				count++;
			}
			else {
				result.setLength(0); // ��Ʈ������ �ʱ�ȭ
				result.append("NO");
				break;
			}
		}

		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
}


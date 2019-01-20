import java.io.*;
import java.util.*;

public class prob1874 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer result = new StringBuffer();
		int T = Integer.parseInt(br.readLine());
		int[] val = new int[T]; // 입력값

		for(int i = 0 ; i < T ; i++) {
			val[i] = Integer.parseInt(br.readLine());
		}

		ArrayList<Integer> stack = new ArrayList<>();

		int count = 0; // pop 횟수 
		int push = 1; // 현재 푸시해야할 숫자
		int curr = 0; // 현재 스택의 top
		//찾는 값이 현재 인덱스보다 크면 푸시
		//찾는 값이 현재 인덱스보다 작으면 팝
		//이때 찾는 값이 이미 팝 되었으면 NO
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
			else if(curr == val[count]) { //pop이 안됐으면 pop or NO
				stack.remove(stack.size()-1);
				result.append("-\n");
				count++;
			}
			else {
				result.setLength(0); // 스트링버퍼 초기화
				result.append("NO");
				break;
			}
		}

		bw.write(result.toString());
		bw.flush();
		bw.close();
	}
}


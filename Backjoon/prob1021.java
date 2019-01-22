import java.io.*;
import java.util.*;

public class prob1021 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		String[] arr = br.readLine().split(" ");
		
		bw.write(getShortestPathLength(N,M,arr));
		
		bw.flush();
		bw.close();
	}

	public static String getShortestPathLength(int N, int M, String[] arr) {
		LinkedList<Integer> deque = new LinkedList<>();
		
		for(int i = 1; i <= N; i++)
			deque.add(i);
		
		int length = 0;
		int curr = 1; // 현재 위치
		for(int i = 0; i < M; i++) {
			int target = Integer.parseInt(arr[i]);
			int currToTarget = 0;
			
			//현재 위치에서 타겟까지 거리를 계산한다.
			//타겟이 아니면 현재노드를 제일 뒤로 넘긴다.
			//currToTarget 과  (size - currToTarget) 중 작은걸 패스 길이에 더한다.
			while(true) {
				if(deque.peekFirst() == target) {
					currToTarget = currToTarget < (deque.size() - currToTarget) ?
							currToTarget : (deque.size() - currToTarget);
					length += currToTarget;
					deque.removeFirst();
					break;
				}
				else {
					deque.addLast(deque.removeFirst());
					currToTarget++;
				}
			}
		}
		
		return length+"";
	}
}




import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

public class prob1966 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer result = new StringBuffer();

		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			String[] NM = br.readLine().split(" ");
			String[] temp = br.readLine().split(" ");

			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			int[] arr = new int[temp.length];
			for(int j = 0 ; j < arr.length; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			result.append(getRank(N,M,arr));
		}

		bw.write(result.toString());
		bw.flush();
		bw.close();
	}

	public static String getRank(int N, int M, int[] arr) {
		StringBuffer rtn = new StringBuffer();
		int target = M;

		LinkedList<model2> queue = new LinkedList<>();
		for(int i = 0 ; i < arr.length ; i++)
			queue.add(new model2(i,arr[i]));

		int rank = 0;
		//큐 안에 우선순위가 본인보다 높은게 있는지 검사하고
		//있으면 해당 큐 제일 뒤로 이동
		//없으면 해당 큐 팝하고 rank++
		while(true) {
			boolean isMoved = false;
			Iterator<model2> iterator = queue.iterator();
			
			model2 currModel = iterator.next();
			while(iterator.hasNext()) {
				if(currModel.value < iterator.next().value) {
					queue.add(queue.pop());
					isMoved = true;
					break;
				}
			}
			
			if(isMoved)
				continue;
			else { //pop
				rank++;
				if(target == queue.pop().id) {
					rtn.append(rank+"\n");
					break;
				}
			}
		}

		return rtn.toString();
	}
}

class model2{
	int id;
	int value;
	
	public model2(int id, int value){
		this.id = id;
		this.value = value;
	}
}



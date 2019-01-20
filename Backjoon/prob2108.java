import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob2108 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//입력
		int T = Integer.parseInt(br.readLine());

		//최대값 4000 + 4000 = 8000
		int[] arr = new int[8001];

		for(int i = 0; i < T ; i++) {
			int val = Integer.parseInt(br.readLine());
			arr[val+4000]++;
		}
		
		//최빈값 구하기
		int maxNoVal = 0;
		int minNo = 0;
		int minNo2 = 0;
		boolean checkMin2 = false;
		
		//정렬된 배열 출력
		int[] arr2 = new int[T];
		int count = 0;
		int i = 0; // 기존 배열 인덱스
		int index = 0; // 새 배열의 인덱스
		while(count < T) {
			if(arr[i] != 0) {
				//최빈값 개수 구하기
				if(arr[i] > maxNoVal) {
					maxNoVal = arr[i];
					minNo2 = i-4000;
					checkMin2 = false;
				}
				else if(arr[i] == maxNoVal) {
					if(!checkMin2) {
						minNo2 = i-4000;
						checkMin2 = true;
					}
				}
				
				for(int j = 0; j < arr[i]; j++) {
					arr2[index] = i-4000;
					count++;
					index++;
				}
			}
			i++;
		}
		
		//산술평균
		int sum = 0;
		for(int k = 0; k < arr2.length; k++) 
			sum += arr2[k];
		
		bw.write(Math.round((double)sum/T)+"\n"); 
		
		//중간값
		bw.write(arr2[T/2]+"\n");
		
		//최빈값
		bw.write(minNo2+"\n");
		
		// 최대값-최소값
		bw.write(arr2[T-1]-arr2[0]+"");

		//출력
		bw.flush();
		bw.close();
	}
}


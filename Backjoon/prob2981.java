import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class prob2981 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];

		for(int i = 0; i < T; i++) 
			arr[i] = sc.nextInt();

		Arrays.sort(arr);

		//�ּҰ��� �ִ밪�� �� ���� ������ ����� ������ �Ǹ� �������� �׻� ����.
		//�׷��Ƿ� ���� �� �� �ּҰ��� �ִ밪�� ������ ����� ���Ѵ�.
		ArrayList<Integer> dividers = (ArrayList<Integer>) dividers(arr[T-1] - arr[0]);

		//�ּҰ��� �ִ밪�� ������ ������ ������ ������ ���� ����� ���� �� 
		//�ּҰ��� ����� ���� �������� ������ ���� ������ �н�, �ٸ��� ����
		for(int i = 0; i < dividers.size();) {
			int currDivider = dividers.get(i);
			int mod = arr[0] % currDivider;

			boolean isDivided = true;
			for(int n = 1; n < arr.length - 1; n++) {
				if(arr[n] % currDivider != mod) {
					dividers.remove(i);
					isDivided = false;
					break;
				}
			}

			if(isDivided) i++;
		}

		StringBuffer rtn = new StringBuffer();
		for(int val : dividers) {
			rtn.append(val+" ");
		}

		System.out.println(rtn.toString());
	}

	public static List<Integer> dividers(int diff) {
		ArrayList<Integer> divider = new ArrayList<>();

		for(int i = 2; i <= Math.sqrt(diff); i++) {
			if(diff % i == 0) {
				divider.add(i);
				
				if(!divider.contains(diff/i))
					divider.add(diff/i);
			}
		}

		divider.add(diff);
		
		Collections.sort(divider);
		
		return divider;
	}
}

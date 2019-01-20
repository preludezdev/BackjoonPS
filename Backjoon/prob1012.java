

import java.util.Scanner;

public class prob1012 {

	public static int[][] map;
	public static int index = 1;
	public static int maxX;	
	public static int maxY;
	public static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 0; i < count ; i++) {
			findCount();
		}
		sc.close();
		
		// �ý��� �ڿ�����ϴ� �͵��� ��.��.�� close �ؾ� �Ѵ�
		//  Ű����, �����ͺ��̽�, ����, ��Ʈ��ũ, ....
		// Closeable �������̽� ������ �����..
	}

	static void findCount() {		
		
//		Scanner sc = new Scanner(System.in);
		maxX = sc.nextInt(); //�� ���� ����
		maxY = sc.nextInt(); //�� ���� ����
		int num_cabbage = sc.nextInt();

		//�ʱ�ȭ
		index = 1;		
		map = new int[maxY][maxX];
			
		for(int i = 0; i < maxY ; i++) {
			for(int j = 0; j < maxX ; j++) {
				map[i][j] = 0;
			}
		}
		
		// ���� ��ġ ����
		int newX;
		int newY;
		for(int k = 0; k < num_cabbage ; k++) {
			newX = sc.nextInt();
			newY = sc.nextInt();
			map[newY][newX]	= 1;			
		}

		// �� ���鼭 �ּ� ���� �� üũ	
		for(int i = 0; i < maxY ; i++) { //����
			for(int j = 0; j < maxX ; j++) { //����
				if(map[i][j] == 1) {
					index++;					
					path(i,j);
				}
			}
		}

		System.out.println(index-1);	
		
	}

	//x,y ��ġ���� ���߰� �ִ��� üũ�ϰ� ������  �׹������� ������
	static void path(int x, int y) {
		if(map[x][y] == 1) {
			map[x][y] = index;
			if(x-1 >= 0)
				path(x-1,y);//��
			if(x+1 < maxY)
				path(x+1,y);//�Ʒ�
			if(y-1 >= 0)
				path(x,y-1);//��
			if(y+1 < maxX)
				path(x,y+1);//��
		}
	}	
}

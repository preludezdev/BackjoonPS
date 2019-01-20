

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
		
		// 시스템 자원사용하는 것들은 반.드.시 close 해야 한다
		//  키보드, 데이터베이스, 파일, 네트워크, ....
		// Closeable 인터페이스 구현한 존재들..
	}

	static void findCount() {			
//		Scanner sc = new Scanner(System.in);
		maxX = sc.nextInt(); //맵 가로 길이
		maxY = sc.nextInt(); //맵 세로 길이
		int num_cabbage = sc.nextInt();

		//초기화
		index = 1;		
		map = new int[maxY][maxX];
			
		for(int i = 0; i < maxY ; i++) {
			for(int j = 0; j < maxX ; j++) {
				map[i][j] = 0;
			}
		}
		
		// 배추 위치 생성
		int newX;
		int newY;
		for(int k = 0; k < num_cabbage ; k++) {
			newX = sc.nextInt();
			newY = sc.nextInt();
			map[newY][newX]	= 1;			
		}

		// 맵 돌면서 최소 벌레 수 체크	
		for(int i = 0; i < maxY ; i++) { //세로
			for(int j = 0; j < maxX ; j++) { //가로
				if(map[i][j] == 1) {
					index++;					
					path(i,j);
				}
			}
		}

		System.out.println(index-1);	
		
	}

	//x,y 위치에는 배추가 있는지 체크하고 있으면  네방향으로 보낸다
	static void path(int x, int y) {
		if(map[x][y] == 1) {
			map[x][y] = index;
			if(x-1 >= 0)
				path(x-1,y);//위
			if(x+1 < maxY)
				path(x+1,y);//아래
			if(y-1 >= 0)
				path(x,y-1);//왼
			if(y+1 < maxX)
				path(x,y+1);//오
		}
	}	
}

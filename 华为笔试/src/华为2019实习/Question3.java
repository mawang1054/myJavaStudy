package 华为2019实习;

import java.util.Scanner;

public class Question3 {
	public static long n = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] map = new int[N][M];
			boolean[][] flag = new boolean[N][M];
			for(int i = 0; i < N; ++i) {
				for(int j = 0; j < M; ++j) {
					map[i][j] = sc.nextInt();
				}
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int w = sc.nextInt();
			core(map, flag, x, y, z, w, -1, N, M);
			System.out.println(n % 1000000000);
			n = 0;
		}
		sc.close();
	}
	
	public static void core(int[][] map, boolean flag[][], int x, int y, int z, int w, int haiba, int N, int M) {
		if(x == z && y == w) {
			n++;
			return;
		}
		if(x < 0 || x >= N || y < 0 || y >= M || flag[x][y] == true || map[x][y] <= haiba ) {
			return;
		}
		flag[x][y] = true;
		core(map, flag, x + 1, y, z, w, map[x][y], N, M);
		core(map, flag, x - 1, y, z, w, map[x][y], N, M);
		core(map, flag, x, y + 1, z, w, map[x][y], N, M);
		core(map, flag, x, y - 1, z, w, map[x][y], N, M);
		flag[x][y] = false;
	}
}

//4 5
//0 1 0 0 0
//0 2 3 0 0
//0 0 4 5 0
//0 0 7 6 0
//0 1 3 2
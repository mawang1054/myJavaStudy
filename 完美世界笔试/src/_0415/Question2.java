package _0415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question2 {
	public static List<Integer> minHpList = new ArrayList<Integer>();
	public static int minhp = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] map = new int[n][m];
			for(int i = 0; i < n; ++i) {
				for(int j = 0; j < m; ++j) {
					map[i][j] = sc.nextInt();
				}
			}
			core(map, n, m, 0, 0, 0, 0);
			System.out.println(1 - Collections.max(minHpList));
			minHpList.clear();
			minhp = Integer.MAX_VALUE;
		}
		sc.close();
	}
	
	public static void core(int[][] map, int iLength, int jLength, int iIndex, int jIndex, int hp, int count) {
		if(iIndex >= iLength || iIndex < 0 || jIndex >= jLength || jIndex < 0) {
			return;
		}			
		if(iIndex == iLength - 1 && jIndex == jLength - 1) {
			hp = hp + map[iIndex][jIndex];
			if(minhp > hp)
				minhp = hp;
			minHpList.add(minhp);
			return;
		}
		if(minhp > hp)
			minhp = hp;
		core(map, iLength, jLength, iIndex, jIndex + 1, hp + map[iIndex][jIndex], count + 1);
		core(map, iLength, jLength, iIndex + 1, jIndex, hp + map[iIndex][jIndex], count + 1);
	}
}

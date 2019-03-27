package oj;

import java.util.Arrays;

//3 5 2
//11100
//11110
//01100

import java.util.Scanner;

public class MyCodeZ1_360 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.nextInt();
		byte[][] arr = new byte[i][j];
		for (int x = 0; x < i; ++x) {
			arr[x] = sc.next().getBytes();
		}
		for (int y = 0; y < i; ++y) {
			for (int z = 0; z < j; ++z) {
				arr[y][z] -= 48;
			}
		}
		int count = 0;
		for(int a = 0; a <= i - 3; ++a) {
			for(int b =0; b <= j - 3; ++b) {
				if(check(arr,a,b))
					count++;
			}
		}
		System.out.println(count);
	}

	public static boolean check(byte[][] arr, int i, int j) {
		if (arr[i][j+1] == 1 &&
			arr[i+1][j] == 1 &&
			arr[i+1][j+1] == 1 &&
			arr[i+1][j+2] == 1 &&
			arr[i+2][j+1] == 1)
			return true;
		else
			return false;
	}
}

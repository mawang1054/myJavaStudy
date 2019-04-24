package 网易互娱笔试;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			for (String string : arr) {
				System.out.println(string);
			}
		}
//	}

}

package pdd正式批;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			if(str1.matches(str1)) {
				System.out.println(str1.length() - str2.length());
				continue;
			}
		}
	}
}

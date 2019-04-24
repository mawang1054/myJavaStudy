package 携程笔试;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			str = str.substring(1, str.length() - 1);
			String[] strArr = str.split(",");
//			for (String string : strArr) {
//				System.out.println(string);
//			}
			int k = sc.nextInt();
			for(int i = 0; i < strArr.length && (i + k) < strArr.length; i += k) {
				int length = i + k;
				int mid = (length + i) / 2;
				for(int j = i; j < mid; ++j) {
					String temp = strArr[j];
					strArr[j] = strArr[length - j - 1 + i];
					strArr[length - j - 1 + i] = temp;
				}
			}
			for(int i = 0; i < strArr.length; ++i) {
				if(i == 0)
					System.out.print("[");
				System.out.print(strArr[i]);
				if(i != strArr.length - 1)
					System.out.print(",");
				if(i == strArr.length - 1)
					System.out.print("]");
			}
		}
		sc.close();
	}
}

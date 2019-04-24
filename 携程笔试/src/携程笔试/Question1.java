package 携程笔试;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] strArr = str.split(",");
			int size1 = strArr.length;
			Set<String> set = new HashSet<String>();
			for(int i = 0; i < size1; ++i) {
				set.add(strArr[i]);
			}
			if(set.size() != size1)
				System.out.println("true");
			else
				System.out.println("false");
		}
		sc.close();
	}
}

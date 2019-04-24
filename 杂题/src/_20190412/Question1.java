package _20190412;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			List<Integer> list = new ArrayList<Integer>();
			List<Character> strArr = new ArrayList<Character>();
			int index = 0;
			for(int i = 0; i < str.length(); ++i) {
				if(str.charAt(i) == '+' || str.charAt(i) == '-') {
					list.add(Integer.valueOf(str.substring(index, i)));
					strArr.add(str.charAt(i));
					index = i + 1;
				}
			}
			list.add(Integer.valueOf(str.substring(index, str.length())));
			int result = list.get(0);
			for(int i = 0; i < strArr.size(); ++i) {
				if(strArr.get(i) == '+')
					result += list.get(i + 1);
				else
					result -= list.get(i + 1);
			}
			System.out.println(result);
		}
		sc.close();
	}
}

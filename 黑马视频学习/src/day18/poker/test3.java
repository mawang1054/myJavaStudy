package day18.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class test3 {
	public static void main(String[] args) {
		HashMap<Integer, String> poker = new HashMap<>();
		
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"黑桃","红桃","梅花","方片"};
		
		int x = 0;
		
		for (int i = 0; i < num.length; ++i) {
			for (int j = 0; j < color.length; ++j) {
				poker.put(x, color[j] + num[i]);
				++x;
			}
		}
		
		poker.put(x, "小王");
		poker.put(++x, "大王");
		//System.out.println(poker);
		
		ArrayList<Integer> al = new ArrayList<>(poker.keySet());
		//System.out.println(al);
		
		Collections.shuffle(al);//打乱
		
		//发牌
		TreeSet<Integer> person1 = new TreeSet<>();
		TreeSet<Integer> person2 = new TreeSet<>();
		TreeSet<Integer> person3 = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for(int i = 0; i < al.size(); ++i) {
			if (i % 3 == 0) {
				person1.add(al.get(i));
			}
			if (i % 3 == 1) {
				person2.add(al.get(i));
			}
			if (i % 3 == 2) {
				person3.add(al.get(i));
			}
			if (i >= al.size() - 3) {
				dipai.add(al.get(i));
			}	
		}
		
//		System.out.println(person1);
//		System.out.println(person2);
//		System.out.println(person3);
//		System.out.println(dipai);
		
		lookPoker(poker, person1, "高进");
		lookPoker(poker, person2, "龙五");
		lookPoker(poker, person3, "我");
		lookPoker(poker, dipai, "底牌");
	}

	public static void lookPoker(HashMap<Integer, String> poker, TreeSet<Integer> dipai, String name) {
		System.out.print(name + "的牌: ");
		for (Integer i : dipai) {
			System.out.print(poker.get(i) + "  ");
		}
		System.out.println();
	}
}

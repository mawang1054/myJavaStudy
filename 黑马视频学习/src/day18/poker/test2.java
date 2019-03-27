package day18.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class test2 {

	public static void main(String[] args) {
		//ϴ��
		ArrayList<String> poker = xipai();
		
		//����
		ArrayList<ArrayList<String>> person = fapai(poker);
		
		System.out.println("person1:" + person.get(0));
		System.out.println("person2:" + person.get(1));
		System.out.println("person3:" + person.get(2));
		System.out.println("����:" + poker);
	}

	public static ArrayList<ArrayList<String>> fapai(ArrayList<String> poker) {
		ArrayList<ArrayList<String>> person = new ArrayList<ArrayList<String>>();
		person.add(new ArrayList<String>());
		person.add(new ArrayList<String>());
		person.add(new ArrayList<String>());
		Iterator<String> it = poker.iterator();
		for (int i = 0; i < (poker.size() - 3) / 3; ++i) {
			person.get(0).add(it.next());
			person.get(1).add(it.next());
			person.get(2).add(it.next());
		}
		poker.removeAll(person.get(0));
		poker.removeAll(person.get(1));
		poker.removeAll(person.get(2));
		System.out.println(person.get(0).size());
		return person;
	}

	public static ArrayList<String> xipai() {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"��Ƭ","÷��","����","����"};
		ArrayList<String> poker = new ArrayList<String>();
		for (int i = 0; i < color.length; ++i) {
			for (int j = 0; j < num.length; ++j) {
				poker.add(color[i] + num[j]);
			}
		}
		poker.add("С��");
		poker.add("����");
		Collections.shuffle(poker);
		System.out.println(poker);
		return poker;
	}

}

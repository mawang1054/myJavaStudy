package shuJuJieGou;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList=new LinkedList<>();
		myList.add("mawang");
		myList.add("mama");
		myList.add("baba");
		//Iterator<String> it1=myList.iterator();
		ListIterator<String> it3=myList.listIterator(3);
		//it3.next();
		System.out.println(it3.nextIndex());
		ListIterator<String> it2=myList.listIterator();
		System.out.println(it2.previousIndex());
		System.out.println(myList.toString());
		it2.add("nainai");
		System.out.println(myList.toString());
		//String str1 = it2.next();
		it2.add("yeye");
		System.out.println(myList.toString());
		String str2 = it2.next();
		System.out.println(str2);
		myList.add("mawang");
		System.out.println(myList.toString());
	}
}

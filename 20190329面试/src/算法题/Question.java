package 算法题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question {
	public static void main(String[] args) {
		String str = "a,bb,c,a,dd ,c c, bb";
		List<String> list = split(str);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	public static List<String> split(String txt){
		if(txt == null || txt.length() == 0)
			return null;
		
		List<String> list = new ArrayList<String>();
		
		String[] arr = txt.split(",");
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = arr[i].trim();
		}
		
		Set<String> set = new LinkedHashSet<>();
		for (String string : arr) {
			set.add(string);
		}
		
		for (String string : set) {			
			list.add(string);
		}
		
		return list;
		
	}
}

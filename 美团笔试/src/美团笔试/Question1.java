package 美团笔试;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] map = new int[n * m];
			for(int i = 0; i < n * m; ++i) {
				map[i] = sc.nextInt();
			}
			Map<Integer, Integer> black = new HashMap<Integer, Integer>();
			Map<Integer, Integer> write = new HashMap<Integer, Integer>();
			for(int i = 0; i < map.length; i = i + 2) {
				if(black.containsKey(map[i])) {
					black.put(map[i], black.get(map[i]) + 1);
				} else {
					black.put(map[i], 1);
				}
			}
			for(int i = 1; i < map.length; i = i + 2) {
				if(write.containsKey(map[i])) {
					write.put(map[i], write.get(map[i]) + 1);
				} else {
					write.put(map[i], 1);
				}
			}
			int size1 = black.size();
			int size2 = write.size();
			
			int maxKey1 = hashMapValueMax(black);
			int maxKey2 = hashMapValueMax(write);
	        int count1 = black.get(hashMapValueMax(black));
	        int count2 = write.get(hashMapValueMax(write));
			
	        if(maxKey1 == maxKey2) {
	        	int min = count1 > count2 ? count2 : count1;
	        	System.out.println(min);
	        } else {
	        	System.out.println(count1 + count2);	        	
	        }

		}
		sc.close();
	}

	public static int hashMapValueMax(Map<Integer, Integer> black) {
		int maxKey   = 0;
		int maxVlaue = Integer.MIN_VALUE;
		
		Set<Entry<Integer,Integer>> entrySet = black.entrySet();
		
		for (Entry<Integer, Integer> entry : entrySet) {
		    int key   = entry.getKey();
		    int value = entry.getValue();
		    if(maxVlaue < value ) {
		        maxKey = key;
		        maxVlaue = value;  
		    }   
		}
		return maxKey;
	}
}

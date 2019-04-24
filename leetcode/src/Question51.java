import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question51 {
	public static int length = 1;
	public static List<List<Integer>> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Integer[] position = new Integer[length];
		dfsCore(position, 0);
		System.out.println(list.size());
		List<List<String>> strList = new ArrayList<>();
		print(list, strList);
		System.out.println(strList);
	}
	
	private static void print(List<List<Integer>> list, List<List<String>> strList) {
		for (List<Integer> list2 : list) {
			List<String> str = new ArrayList<String>();
			for(int i = 0; i < list2.size(); ++i) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < length; ++j) {
					if(list2.get(i) == j) {
						sb.append("Q");
					} else {
						sb.append(".");
					}
				}
				str.add(sb.toString());
			}
			strList.add(str);
		}
	}
	

	public static void dfsCore(Integer[] position, int index) {
		if(index >= length) {
			List<Integer> arr = new ArrayList<Integer>();
			Collections.addAll(arr, position);
			list.add(arr);
			return;
		}
		for(int i = 0; i < length; ++i) {
			if(isSafe(position, index, i)) {
				position[index] = i;
				dfsCore(position, index + 1);
			}
		}
	}

	public static boolean isSafe(Integer[] position, int index, int i) {
		for(int j = 0; j < index; ++j) {
			if(position[j] == i || position[j] + index - j == i || position[j] - index + j == i)
				return false;
		}
		return true;
	}
	
	public static void print(List<List<Integer>> list) {
		System.out.println("[");
		int count = 1;
		for (List<Integer> list2 : list) {
			for(int i = 0; i < list2.size(); ++i) {
				if(i == 0) {
					System.out.print("[\"");
				} else {
					System.out.print(" \"");
				}

				for(int j = 0; j < length; ++j) {
					if(list2.get(i) == j) {
						System.out.print("Q");
					} else {
						System.out.print(".");
					}
				}
				
				if(i == list2.size() - 1)
					if(count == list.size() - 1)
						System.out.println("\"]");
					else
						System.out.println("\"],");
				else {
					System.out.print("\",");
					if(i == 0)
						System.out.println("  // 解法 " + count);
					else
						System.out.println();
				}
			}
			if(count != list.size())
				System.out.println();
			count++;
		}
		System.out.println("]");
	}
}

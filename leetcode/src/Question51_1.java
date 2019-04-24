import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Question51_1 {
    public static int length;
	public static List<List<Integer>> list = new ArrayList<>();
    
	public static void main(String[] args) {
		System.out.println(solveNQueens(1));
	}
	
    public static List<List<String>> solveNQueens(int n) {
        length = n;
       	Integer[] position = new Integer[length];
		dfsCore(position, 0); 
        List<List<String>> strList = new ArrayList<>();
		print(list, strList);
		
        return strList;
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
			}list.clear();
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
}

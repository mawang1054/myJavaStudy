package 剑指offer;

public class Question__二进制1的个数 {
    public int NumberOf1(int n) {
		int index = 1;
		int count = 0;
    	while(index != 0) {
    		if((n & index) == index)
    			count++;
    		index = index << 1;
    	}
    	return count;
    }
}

package leetcode;

public class Question200 {
    public static int numIslands(char[][] grid) {
    	if(grid.length == 0 || grid[0].length == 0)
    		return 0;
        int count = 0;
        boolean[][] flag = new boolean[grid.length][grid[0].length];
        int iHigh = grid.length - 1;
        int jHigh = grid[0].length - 1;
        for(int i = 0; i < flag.length; ++i) {
        	for(int j = 0; j < flag[0].length; ++j) {
        		if(grid[i][j] == '1' && !flag[i][j]) {
        			++count;
        			visit(grid, flag, i,  j, 0, iHigh, 0, jHigh);
        		}
        	}
        }
        return count;
    }
    
    public static void visit(char[][] grid, boolean[][] flag, 
    		int i, int j, int iLow, int iHigh, int jLow, int jHigh) {
    	if(i < iLow || i > iHigh || j < jLow || j > jHigh)
    		return;
    	if(grid[i][j] != '1' || flag[i][j] )
    		return;
    	flag[i][j] = true;
    	visit(grid, flag, i - 1,  j, 0, iHigh, 0, jHigh);
    	visit(grid, flag, i + 1,  j, 0, iHigh, 0, jHigh);
    	visit(grid, flag, i,  j - 1, 0, iHigh, 0, jHigh);
    	visit(grid, flag, i,  j + 1, 0, iHigh, 0, jHigh);
    }
    
    public static void main(String[] args) {
//		char[][] c = {{'1','1','1','1','0'},
//					  {'1','1','0','1','0'},
//					  {'1','1','0','0','0'},
//					  {'0','0','0','0','0'}};
    	char[][] c = {{}};
		System.out.println(numIslands(c));
	}
}

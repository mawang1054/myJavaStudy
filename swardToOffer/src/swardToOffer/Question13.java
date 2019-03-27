package swardToOffer;

public class Question13 {

	public static void main(String[] args) {
		System.out.println(movingCount(5, 10, 10));

	}

    public static int movingCount(int threshold, int rows, int cols)
    {
        if(threshold <= 0 || rows <= 0 || cols <= 0){
            return 0;
        }
        byte[][] flag = new byte[rows][cols];
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                if(canVisit(i, j, threshold))
                    flag[i][j] = 1;
                else
                    flag[i][j] = 0;
            }
        }
        
        int count = moveCore(rows, cols, 0, 0, flag);
        return count;
    }

    public static int moveCore(int rows, int cols, int row, int col, byte[][] flag){
        int count = 0;
        if(row >= 0 && row < rows && col >= 0 && col < cols && flag[row][col] != 0){
            flag[row][col] = 0;
            count = 1 + moveCore(rows, cols, row - 1, col, flag) +
                        moveCore(rows, cols, row + 1, col, flag) +
                        moveCore(rows, cols, row, col - 1, flag) +
                        moveCore(rows, cols, row, col + 1, flag);
        }
        return count;
    }
    
    public static boolean canVisit(int i, int j, int k){
        int num = 0;
        while(i > 0){
            num += i % 10;
            i /= 10;
        }
        while(j > 0){
            num += j % 10;
            j /= 10;
        }
        if(num > k)
            return false;
        return true;
    }
}

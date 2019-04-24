package 快手笔试;

import java.util.Scanner;

public class question22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(moveCount(m, n, k));
		}
	}
    public static int moveCount( int m, int n, int k)
    {
        if(k <= 0 || m <= 0 || n <= 0){
            return 0;
        }
        byte[][] flag = new byte[m][n];
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(canDao(i, j, k))
                    flag[i][j] = 1;
                else
                    flag[i][j] = 0;
            }
        }
         
        int count = moveCore(m, n, 0, 0, flag);
        return count;
    }
 
    public static int moveCore(int M, int N, int m, int n, byte[][] flag){
        int count = 0;
        if(m >= 0 && m < M && n >= 0 && n < N && flag[m][n] != 0){
            flag[m][n] = 0;
            count = 1 + moveCore(M, N, m - 1, n, flag) +
                        moveCore(M, N, m + 1, n, flag) +
                        moveCore(M, N, m, n - 1, flag) +
                        moveCore(M, N, m, n + 1, flag);
        }
        return count;
    }
     
    public static boolean canDao(int i, int j, int k){
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

import java.util.Arrays;

public class Question322 {
	public static void main(String[] args) {
		int[] coins = {186,419,83,408};
		int amount = 6249;
		System.out.println(coinChange(coins, amount));
	}
	
    public static int coinChange(int[] coins, int amount) {
    	int rows = coins.length;
    	int cols = amount + 1;
//    	Arrays.sort(coins);
        int[][] dp = new int[rows][cols];
        for(int i = 0; i < cols; ++i) {
        	if(i % coins[0] == 0)
        		dp[0][i] = i / coins[0];
        	else
        		dp[0][i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i < rows; ++i) {
        	for(int j = 1; j < cols; ++j) {
        		int temp = j - coins[i];
        		if(temp >= 0 && temp < cols)
        			dp[i][j] = Math.min(dp[i - 1][j], dp[i][temp] + 1);
        		else
        			dp[i][j] = dp[i - 1][j];
        	}
        }
        
        for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
        
		return dp[rows - 1][cols - 1] == Integer.MAX_VALUE ? -1 : dp[rows - 1][cols - 1];
    }
    
    public int coinChange1(int[] coins, int amount) {
        int len = coins.length;
        int[][] dp = new int[len][amount+1];
        
        //初始化第0行，也就是只用coins[0]时
        for(int i=1;i<amount+1; i++){
            dp[0][i] = Integer.MAX_VALUE;
            if(i>=coins[0]&&dp[0][i-coins[0]]!=Integer.MAX_VALUE){
                dp[0][i] = dp[0][i-coins[0]]+1;
            }
        }
        
        for(int i = 1; i< len; i++){
            for(int j=1; j< amount+1; j++){
                int left = Integer.MAX_VALUE;
                if(j>=coins[i] && dp[i][j-coins[i]]!=Integer.MAX_VALUE){
                    left = dp[i][j-coins[i]]+1;
                }
                dp[i][j] = Math.min(dp[i-1][j],left);
            }
        }
        
        return dp[len-1][amount] == Integer.MAX_VALUE?-1:dp[len-1][amount];
    }
}

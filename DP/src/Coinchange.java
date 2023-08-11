public class Coinchange {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // There's one way to make an amount of 0 (by using no coins)

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}


//Example 1:
//
//        Input: amount = 5, coins = [1,2,5]
//        Output: 4
//        Explanation: there are four ways to make up the amount:
//        5=5
//        5=2+2+1
//        5=2+1+1+1
//        5=1+1+1+1+1
